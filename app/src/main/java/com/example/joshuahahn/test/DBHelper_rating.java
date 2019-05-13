package com.example.joshuahahn.test;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper_rating extends SQLiteOpenHelper {

    // DBHelper 생성자로 관리할 DB 이름과 버전 정보를 받음
    public DBHelper_rating(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE AvgRating (rating INTEGER, userID INTEGER);");

    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}

    public void insert(int rating, int userID) {

        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("INSERT INTO AvgRating VALUES(null, '" + rating + "', " + userID + ");");
        db.close();
    }

    public void update(int userID, int rate) {
        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("UPDATE AvgRating SET rating=" + rate + " WHERE userID='" + userID + "';");
        db.close();
    }

    public void delete(int userID) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM AvgRating WHERE userID='" + userID + "';");
        db.close();
    }


    public String AResult() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";

        // DB에 있는 데이터를 쉽게 처리하기 위해 Cursor를 사용하여 테이블에 있는 모든 데이터 출력
        Cursor cursor = db.rawQuery("SELECT * FROM MONEYBOOK", null);
        while (cursor.moveToNext()) {
            result += cursor.getString(0)
                    + " : "
                    + cursor.getString(1)
                    + " | "
                    + cursor.getInt(2)
                    + "원 "
                    + cursor.getString(3)
                    + "\n";
        }

        return result;

}}

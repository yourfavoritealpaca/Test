package com.example.joshuahahn.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {


/** 로딩 화면이 떠있는 시간(밀리초단위)  **/
private final int SPLASH_DISPLAY_LENGTH = 1000;

/** 처음 액티비티가 생성될때 불려진다. */
@Override
public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash_page);

        /* SPLASH_DISPLAY_LENGTH 뒤에 메뉴 액티비티를 실행시키고 종료한다.*/
        new Handler().postDelayed(new Runnable(){
@Override
public void run() {
        /* 메뉴액티비티를 실행하고 로딩화면을 죽인다.*/
        Intent mainIntent = new Intent(Splash.this,Main.class);
        Splash.this.startActivity(mainIntent);
        Splash.this.finish();
        }
        }, SPLASH_DISPLAY_LENGTH);
        }
}

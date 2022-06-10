package com.example.prj3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                // 시간 차를 두고 실행하고 싶은 함수 호출
                Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);

            }
        }, 2000); // 3000 대신 시간차를 두기 원하는 만큼의 수를 써주세요 ( 단위 : 밀리초 )
    }
}
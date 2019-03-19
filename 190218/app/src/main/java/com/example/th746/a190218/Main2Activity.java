package com.example.th746.a190218;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b=(Button) findViewById(R.id.btn);

        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){ //버튼 클릭시 동작
                Snackbar.make(v, "메인으로 돌아갑니다.", 10000).show();
            }
        });

       /* //버튼 객체 참조
        Button backbtn=(Button) findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new OnClickListener() {
            public void onClick(view v){
                Toast.makeText(getApplicationContext(), "메인으로 돌아갑니다.", Toast.LENGTH_LONG).show();
                finish();
            }
        });*/
    }
}

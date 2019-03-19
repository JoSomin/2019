package com.example.th746.a190218;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b=(Button) findViewById(R.id.btn);

        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){ //버튼 클릭시 동작
                Snackbar.make(v, "Hello World", 10000).show();
            }
        });

        //activity_main2로 넘어가는 버튼
        btn2= findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
                //인텐트 선언 -> 현재 엑티비티, 넘어갈 엑티비티
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                //인텐트 실행
                startActivity(intent);
            }
        });
    }

}

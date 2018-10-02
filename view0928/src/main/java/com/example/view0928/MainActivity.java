package com.example.view0928;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;


    //키보드 관리 객체를 저장하는 변수 선언
    InputMethodManager imm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml에 디자인한 뷰 가져오기
        editText = findViewById(R.id.edit);
        textView = findViewById(R.id.text);

        //뷰 조작
        textView.setText("xml에 뷰 조작하기");
        textView.setTextSize(20);

        //콘솔에 출력 - 하단에 logcat에서 확인 가능
        Log.e("태그", "내용");

        //키보드 관리 객체 가져오기
        imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        //edit에 포커스 설정
        imm.showSoftInput(editText, 0);

        //버튼 가져오기
        Button button1 = findViewById(R.id.show);
        Button button2 = findViewById(R.id.hide);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imm.showSoftInput(editText,0);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
        });


        EditText editmove = findViewById(R.id.editmove);



    }
}

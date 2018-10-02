package com.example.view0928;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TapUse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap_use);

        //전체 탭을 관리하는 호스트를 찾아오기
        TabHost host = findViewById(R.id.host);
        //탭을 설정하기 위한 메소드를 호출
        host.setup();

        //탭을 생성 - 태그는 탭의
        TabHost.TabSpec spec = host.newTabSpec("tap1");

        //탭의 아이콘을 설정
        spec.setIndicator(null,ResourcesCompat.getDrawable(getResources(), R.drawable.group_fill, null));

        //탭의 내용을 설정
        spec.setContent(R.id.tab_content1);
        //호스트에 탭 추가
        host.addTab(spec);

        //탭을 생성 - 태그는 탭
        spec = host.newTabSpec("tap2");
        //탭의 아이콘을 설정
        spec.setIndicator(null,ResourcesCompat.getDrawable(getResources(), R.drawable.addpeople_fill, null));

        //탭의 내용을 설정
        spec.setContent(R.id.tab_content2);
        //호스트에 탭 추가
        host.addTab(spec);

        //탭을 생성 - 태그는 탭
        spec = host.newTabSpec("tap3");
        //탭의 아이콘을 설정
        spec.setIndicator(null,ResourcesCompat.getDrawable(getResources(), R.drawable.addressbook_fill, null));

        //탭의 내용을 설정
        spec.setContent(R.id.tab_content3);
        //호스트에 탭 추가
        host.addTab(spec);
    }
}

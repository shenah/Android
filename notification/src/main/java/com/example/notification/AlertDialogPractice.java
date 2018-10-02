package com.example.notification;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogPractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_practice);

        Button btndialog = findViewById(R.id.btndialog);
        btndialog.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(AlertDialogPractice.this)
                        .setTitle("미션성공!")
                        .setMessage("축하합니다! 계속하시겠습니까?")
                        .setIcon(R.drawable.icon)
                        .setPositiveButton("네", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AlertDialogPractice.this, "Level up!", Toast.LENGTH_LONG).show();
                            }
                        })
                        .setNegativeButton("아니오", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AlertDialogPractice.this, "게임종료!", Toast.LENGTH_LONG).show();
                            }
                        })
                        .setNeutralButton("취소", null)
                        .setCancelable(false)
                        .show();

            }
        });

        //비동기적 수행

        //대화상자 출력
        Button btnasync = findViewById(R.id.btnasync);
        btnasync.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(AlertDialogPractice.this)
                        .setMessage("액티비티 종료")
                        .setTitle("대화상자")
                        .setIcon(R.drawable.warning)
                        .show();
                //토스트 출력
                Toast.makeText(AlertDialogPractice.this,"토스트 출력", Toast.LENGTH_LONG).show();

                //액티비티 종료
                finish();
            }
        });

    }
}

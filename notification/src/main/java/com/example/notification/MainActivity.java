package com.example.notification;

import android.app.AlarmManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnvibrate);
        btn2 = findViewById(R.id.btnsystemsound);
        btn3 = findViewById(R.id.btnusersound);

        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Vibrator vib = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                vib.vibrate(3000);
            }
        });

        btn2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                Ringtone ringtone = RingtoneManager.getRingtone(getApplicationContext(), notification);
                ringtone.play();
            }
        });

        btn3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.win);
                player.start();
            }
        });

    }
}

package com.example.peeravich.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private String urlYoutubeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // main Method

    public void clickAboutMe(View View) {

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.effect_btn_shut);
        mediaPlayer.start();//ต้องถามมาสเตอร์ให้ได้ อย่าลืมนะ

        //intent to WebView สามารถอ่่านQQRCODE
        urlYoutubeString = "https://youtu.be/t7aPWbKhJOY";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlYoutubeString));
        startActivity(intent);
        }
}  //main class นี่คือคลาสหลัก

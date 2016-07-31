package com.example.peeravich.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private String urlYoutubeString;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.listView);


        //setup Array for integer
        int[] iconInt = new int[20];
        iconInt[0] = R.drawable.traffic_01;
        iconInt[1] = R.drawable.traffic_01;
        iconInt[2] = R.drawable.traffic_01;
        iconInt[3] = R.drawable.traffic_01;
        iconInt[4] = R.drawable.traffic_01;
        iconInt[5] = R.drawable.traffic_01;
        iconInt[5] = R.drawable.traffic_01;
        iconInt[6] = R.drawable.traffic_01;
        iconInt[7] = R.drawable.traffic_01;
        iconInt[8] = R.drawable.traffic_01;
        iconInt[9] = R.drawable.traffic_01;
        iconInt[10] = R.drawable.traffic_01;
        iconInt[11] = R.drawable.traffic_01;
        iconInt[12] = R.drawable.traffic_01;
        iconInt[13] = R.drawable.traffic_01;
        iconInt[14] = R.drawable.traffic_01;
        iconInt[15] = R.drawable.traffic_01;
        iconInt[16] = R.drawable.traffic_01;
        iconInt[17] = R.drawable.traffic_01;
        iconInt[18] = R.drawable.traffic_01;
        iconInt[19] = R.drawable.traffic_01;

        //For Setup Title
        String[] titleStrings = getResources().getStringArray(R.array.my_title);

        String[] detailLongStrings = getResources().getStringArray(R.array.my_detail);

        String[] detailShort = new String[detailLongStrings.length];
        for (int i=0;i<detailLongStrings.length;i+=1){
            detailShort[i] = detailLongStrings[i].substring(0,20)+ "...";
        }
        //Create ListView
        MyAdapter myAdapter = new MyAdapter(this,iconInt, titleStrings,detailShort );
listView.setAdapter(myAdapter);

    }//main Method

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

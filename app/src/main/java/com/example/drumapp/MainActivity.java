package com.example.drumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer tom, kick, crash1, crash2,hat1,hat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tom = MediaPlayer.create(MainActivity.this, R.raw.tom);
        kick = MediaPlayer.create(MainActivity.this, R.raw.kick);
        crash1 = MediaPlayer.create(MainActivity.this, R.raw.crash1);
        crash2 = MediaPlayer.create(MainActivity.this, R.raw.crash2);
        hat1 = MediaPlayer.create(MainActivity.this, R.raw.hat);
        hat2 = MediaPlayer.create(MainActivity.this, R.raw.hat2);

        ImageView leftCrashImg = (ImageView)findViewById(R.id.leftCrash);
        leftCrashImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crash1.start();
            }
        });

        ImageView rightCrashImg = (ImageView)findViewById(R.id.rightCrash);
        rightCrashImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crash2.start();
            }
        });

        ImageView leftHatImg = (ImageView)findViewById(R.id.leftHat);
        leftHatImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hat1.start();
            }
        });

        ImageView rightHatImgss = (ImageView)findViewById(R.id.rightHat);
        rightHatImgss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hat2.start();
            }
        });

        ImageView kickImg = (ImageView)findViewById(R.id.kick);
        kickImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kick.start();
            }
        });

        ImageView tomsImg = (ImageView)findViewById(R.id.toms);
        tomsImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tom.start();
            }
        });

    }


}

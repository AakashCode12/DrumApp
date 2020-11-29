package com.example.drumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer tom, kick, crash1, crash2, hat, hat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tom = MediaPlayer.create(MainActivity.this, R.raw.tom);
        kick = MediaPlayer.create(MainActivity.this, R.raw.kick);
        crash1 = MediaPlayer.create(MainActivity.this, R.raw.crash1);
        crash2 = MediaPlayer.create(MainActivity.this, R.raw.crash2);

        hat = MediaPlayer.create(MainActivity.this, R.raw.hat);
        hat2 = MediaPlayer.create(MainActivity.this, R.raw.hat2);

    }

    public void playToms(View view) {
        tom.start();
    }

    public void playKick(View view) {
        kick.start();
    }

    public void playCrash1(View view) {
        crash1.start();
    }

    public void playCrash2(View view) {
        crash2.start();
    }

    public void playHat(View view) {
        hat.start();
    }

    public void playHat2(View view) {
        hat2.start();
    }

}
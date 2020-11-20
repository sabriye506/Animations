package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView garfieldImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        garfieldImageView = findViewById(R.id.garfieldImageView);

        garfieldImageView.setX(-1000);
        garfieldImageView.setAlpha(0f);

        garfieldImageView.animate().translationXBy(1000).alpha(1f).rotation(3600).setDuration(5000);
        

    }
}
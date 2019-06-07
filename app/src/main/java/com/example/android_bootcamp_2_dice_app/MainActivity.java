package com.example.android_bootcamp_2_dice_app;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context  context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button dice_roll;
        ImageView dice_left;
        ImageView dice_right;
        ImageView dicee_logo;

        context = this;

        dice_left = findViewById(R.id.dice_left);
        dice_right = findViewById(R.id.dice_right);
        dicee_logo = findViewById(R.id.dicee_logo);

        dice_roll= findViewById(R.id.dice_roll);

        dice_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, " Button Ckicl :)", Toast.LENGTH_SHORT).show();
            }
        });


    }

}

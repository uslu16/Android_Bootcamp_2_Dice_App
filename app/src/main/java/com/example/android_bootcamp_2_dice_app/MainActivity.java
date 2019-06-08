package com.example.android_bootcamp_2_dice_app;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Context  context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button dice_roll;
        final ImageView dice_left;
        final ImageView dice_right;
        ImageView dicee_logo;

        final int[] diceArray= {
        R.drawable.dice1,
        R.drawable.dice2 ,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6 };

        context = this;

        dice_left = findViewById(R.id.dice_left);
        dice_right = findViewById(R.id.dice_right);
        dicee_logo = findViewById(R.id.dicee_logo);

        dice_roll= findViewById(R.id.dice_roll);

        dice_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGen = new Random();
                int randomNum1= randomNumberGen.nextInt(6);
                int randomNum2= randomNumberGen.nextInt(6);


                dice_left.setImageResource(diceArray[(randomNum1)]);

                dice_right.setImageResource(diceArray[(randomNum2)]);


                Toast.makeText(context," Random Num is "+ (randomNum1+1) +" "+ (randomNum2+1), Toast.LENGTH_SHORT).show();
            }
        });

          }

}

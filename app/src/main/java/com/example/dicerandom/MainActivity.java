package com.example.dicerandom;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    ImageView diceImage;
    Button rollButton;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        diceImage = findViewById(R.id.diceImage);
        rollButton = findViewById(R.id.rollButton);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateDice();
            }
        });
    }

    private void rotateDice() {
        // Tạo số ngẫu nhiên từ 1 đến 6
        int i = random.nextInt(6) + 1;

        // Khởi tạo Animation
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.rotate);

        // Áp dụng Animation vào hình ảnh
        diceImage.startAnimation(anim);

        // Thay đổi hình ảnh dựa trên số ngẫu nhiên
        switch (i) {
            case 1:
                diceImage.setImageResource(R.drawable.xs_one);
                break;
            case 2:
                diceImage.setImageResource(R.drawable.xs_two);
                break;
            case 3:
                diceImage.setImageResource(R.drawable.xs_three);
                break;
            case 4:
                diceImage.setImageResource(R.drawable.xs_four);
                break;
            case 5:
                diceImage.setImageResource(R.drawable.xs_five);
                break;
            case 6:
                diceImage.setImageResource(R.drawable.xs_six);
                break;
        }
    }}
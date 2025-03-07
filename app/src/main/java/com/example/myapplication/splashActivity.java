package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        ImageView img = findViewById(R.id.imageView);

        Thread t = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

                    rotate.setDuration(5000);
                    rotate.setInterpolator(new LinearInterpolator());
                    img.setAnimation(rotate);
                    Intent intent=new Intent(splashActivity.this,MainActivity.class);
                    sleep(5000);
                    startActivity(intent);
                    splashActivity.this.finish();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        t.start();

    }
}
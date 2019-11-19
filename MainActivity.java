package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private TextView tv;
private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)=findViewById(R.id.tv);
        tv=(ImageView)=findViewById(R.id.iv);
        Animation anim= AnimationUtils.loadAnimation(this.R.anim.myTransition);
        tv.startAnimation(anim);
        iv.startAnimation(anim);
    }
}

package com.example.jsonanimviewpage.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.jsonanimviewpage.R;

public class M4L9T2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4_l9_t2);
        initView();
    }
    private void initView() {

        ImageView imageView=findViewById(R.id.image3);

        Button bounce=findViewById(R.id.bt_Sequential);
        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.squential);
                imageView.startAnimation(animation);
            }
        });


    }
}
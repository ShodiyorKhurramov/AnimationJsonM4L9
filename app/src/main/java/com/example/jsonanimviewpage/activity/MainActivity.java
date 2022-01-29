package com.example.jsonanimviewpage.activity;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jsonanimviewpage.R;
import com.example.jsonanimviewpage.adapter.ViewPagerAdapter;
import com.example.jsonanimviewpage.fragment.FragmentFive;
import com.example.jsonanimviewpage.fragment.FragmentFour;
import com.example.jsonanimviewpage.fragment.FragmentOne;
import com.example.jsonanimviewpage.fragment.FragmentSix;
import com.example.jsonanimviewpage.fragment.FragmentThree;
import com.example.jsonanimviewpage.fragment.FragmentTwo;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button button=findViewById(R.id.json);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJsonActivity();
            }
        });
        Button bounce=findViewById(R.id.m4l9t1);
        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openM4L9T1Activity();
            }
        });
        Button Sequential=findViewById(R.id.m4l9t2);
        Sequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openM4L9T2Activity();
            }
        });
        Button togather=findViewById(R.id.m4l9t3);
        togather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openM4L9T3Activity();
            }
        });
        Button m4l9t4=findViewById(R.id.m4l9t4);
        m4l9t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openM4L9T4Activity();
            }
        });
        Button m4l9t5=findViewById(R.id.m4l9t5);
        m4l9t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openM4L9T5Activity();
            }
        });
        Button m4l9t6=findViewById(R.id.m4l9t6);
        m4l9t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openM4L9T6Activity();
            }
        });


    }


   void openJsonActivity(){
        Intent intent=new Intent(this,JsonViewPagerTask.class);
        startActivity(intent);
   }
    void openM4L9T1Activity(){
        Intent intent=new Intent(this,M4L9T1.class);
        startActivity(intent);
    }
    void openM4L9T2Activity(){
        Intent intent=new Intent(this,M4L9T2.class);
        startActivity(intent);
    }
    void openM4L9T3Activity(){
        Intent intent=new Intent(this,M4L9T3.class);
        startActivity(intent);
    }
    void openM4L9T4Activity(){
        Intent intent=new Intent(this,M4L9T4.class);
        startActivity(intent);
    }
    void openM4L9T5Activity(){
        Intent intent=new Intent(this,M4L9T5.class);
        startActivity(intent);
    }
    void openM4L9T6Activity(){
        Intent intent=new Intent(this,M4L9T6.class);
        startActivity(intent);
    }


}
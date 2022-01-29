package com.example.jsonanimviewpage.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.jsonanimviewpage.R;
import com.example.jsonanimviewpage.adapter.ViewPagerAdapter;
import com.example.jsonanimviewpage.fragment.FragmentFive;
import com.example.jsonanimviewpage.fragment.FragmentFour;
import com.example.jsonanimviewpage.fragment.FragmentOne;
import com.example.jsonanimviewpage.fragment.FragmentSix;
import com.example.jsonanimviewpage.fragment.FragmentThree;
import com.example.jsonanimviewpage.fragment.FragmentTwo;

public class JsonViewPagerTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_view_pager_task);
        ViewPager viewPager=findViewById(R.id.viewpager);
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.add(new FragmentOne(),"");
        viewPagerAdapter.add(new FragmentTwo(),"");
        viewPagerAdapter.add(new FragmentThree(),"");
        viewPagerAdapter.add(new FragmentFour(),"");
        viewPagerAdapter.add(new FragmentFive(),"");
        viewPagerAdapter.add(new FragmentSix(),"");

        viewPager.setAdapter(viewPagerAdapter);

    }
}
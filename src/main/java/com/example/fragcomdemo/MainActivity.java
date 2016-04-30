package com.example.fragcomdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainFragment.OnMessageSendListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onAction(int res) {
        //实现回调方法
        if(res == 1){
            ShowFragment showFragment= (ShowFragment) getFragmentManager().findFragmentById(R.id.fragmentB);
            if(showFragment!=null){
                showFragment.showResult("Pass");
            }else{

            }
        }
    }
}

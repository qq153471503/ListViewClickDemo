package com.example.listviewclickdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 动态加载第一个Fragment布局
         */
        getFragmentManager().beginTransaction().replace(R.id.id_framelayout_right, new FragmentRight()).commit();
    }
}

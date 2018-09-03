package com.jc.gradle.skill;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jc.gradle.core.lib.TestUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestUtils.printTest();
    }
}

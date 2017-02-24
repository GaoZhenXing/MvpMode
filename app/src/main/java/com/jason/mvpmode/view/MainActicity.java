package com.jason.mvpmode.view;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.AppCompatTextView;

import com.jason.mvpmode.R;

/**
 * 项目名称：MvpMode
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * 创建人：JasonGao
 * 创建日期：2017/2/24.9:55
 */
public class MainActicity extends AppCompatActivity {
    private AppCompatTextView textView;
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        textView= (AppCompatTextView) findViewById(R.id.text);
        super.onCreate(savedInstanceState);
    }

}

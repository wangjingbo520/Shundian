package com.eims.myapp.ui.activity;

import android.os.Bundle;

import com.eims.myapp.R;
import com.eims.myapp.base.BaseActivity;

/**
 * @author bobo
 * @date 2018/9/1
 * describe 注册
 */
public class RegisterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_register);
        setTitle("注册");
    }
}

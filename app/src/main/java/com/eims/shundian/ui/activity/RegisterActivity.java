package com.eims.shundian.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.eims.shundian.R;
import com.eims.shundian.TabHomeActivity;
import com.eims.shundian.base.BaseActivity;

import butterknife.OnClick;

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

    @OnClick(R.id.btnRegister)
    @Override
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.btnRegister:
                startTo(TabHomeActivity.class, true);
                break;
            default:
                break;
        }
    }

}

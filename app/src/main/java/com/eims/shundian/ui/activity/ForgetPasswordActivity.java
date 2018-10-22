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
 * describe 忘记密码
 */
public class ForgetPasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_forget_password);
        setTitle("忘记密码");
    }

    @OnClick(R.id.btnSure)
    @Override
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.btnSure:
                startTo(TabHomeActivity.class, true);
                break;
            default:
                break;
        }
    }
}

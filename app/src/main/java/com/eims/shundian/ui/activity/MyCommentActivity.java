package com.eims.shundian.ui.activity;

import android.os.Bundle;

import com.eims.shundian.R;
import com.eims.shundian.base.MyNetDataBaseActivity;

/**
 * @author bobo
 * @date 2018/10/23
 * describe 我的评价
 */
public class MyCommentActivity extends MyNetDataBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_my_comment);
        setTitle("我的评价");
    }
}

package com.eims.myapp.ui.activity;

import android.os.Bundle;

import com.eims.myapp.R;
import com.eims.myapp.base.BaseActivity;

/**
 * @author bobo
 * @date 2018/9/1
 * describe 搜索
 */
public class SearchActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_search);
        setTitleLayoutVisiable(false);
    }
}

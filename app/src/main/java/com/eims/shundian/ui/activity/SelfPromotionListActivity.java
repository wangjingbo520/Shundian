package com.eims.shundian.ui.activity;

import android.os.Bundle;

import com.eims.shundian.R;
import com.eims.shundian.base.MyNetDataBaseActivity;

/**
 * @author bobo
 * @date 2018/10/23
 * describe 自提列表
 */
public class SelfPromotionListActivity extends MyNetDataBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_ziti_list);
        setTitle("自提列表");
    }
}

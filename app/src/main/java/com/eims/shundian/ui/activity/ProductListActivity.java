package com.eims.shundian.ui.activity;

import android.os.Bundle;

import com.eims.shundian.R;
import com.eims.shundian.base.MyNetDataBaseActivity;
import com.eims.shundian.common.widgets.popwindow.SelectionPop;

/**
 * @author bobo
 * @date 2018/9/1
 * describe 商品列表
 */
public class ProductListActivity extends MyNetDataBaseActivity {
    private SelectionPop selectionPop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_product_list);
        setTitleLayoutVisiable(false);
    }
}

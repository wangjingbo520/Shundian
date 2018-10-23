package com.eims.shundian.adapter.recyadapter;

import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.eims.shundian.R;

import java.util.List;

/**
 * @author bobo
 * @date 2018/10/23
 * describe
 */
public class MyAdapter extends BaseQuickAdapter<String,BaseViewHolder> implements BaseQuickAdapter.OnItemClickListener {
    public MyAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tvTitle,item);

    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

    }
}

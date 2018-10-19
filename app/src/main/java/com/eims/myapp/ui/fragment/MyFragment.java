package com.eims.myapp.ui.fragment;


import android.view.View;
import android.view.ViewGroup;

import com.eims.myapp.R;
import com.eims.myapp.adapter.commonmadapter.LQRAdapterForAbsListView;
import com.eims.myapp.adapter.commonmadapter.LQRViewHolder;
import com.eims.myapp.adapter.commonmadapter.LQRViewHolderForAbsListView;
import com.eims.myapp.adapter.commonmadapter.OnItemClickListener;
import com.eims.myapp.base.BaseFragment;
import com.eims.myapp.common.view.MyGridView;

import java.util.Arrays;

import butterknife.BindView;

/**
 * @author bobo
 * @date 2018/9/1
 * describe 我的
 */
public class MyFragment extends BaseFragment {

    @BindView(R.id.gridview)
    MyGridView gridview;
    private String[] mTitles;
    private LQRAdapterForAbsListView lqrAdapterForAbsListView;

    @Override
    public void initData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my;
    }

    @Override
    public void initView(View view) {
        mTitles = getResources().getStringArray(R.array.my_title);
        lqrAdapterForAbsListView = new LQRAdapterForAbsListView<String>(getContext(), Arrays.asList
                (mTitles), R.layout
                .item_my_gridview) {
            @Override
            public void convert(LQRViewHolderForAbsListView helper, String item, int position) {
                helper.setText(R.id.tvTitle, item);
            }
        };

        lqrAdapterForAbsListView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(LQRViewHolder helper, ViewGroup parent, View itemView, int
                    position) {
                switch (position) {
                    case 0:
                        break;
                    default:
                        break;
                }
            }
        });
        gridview.setAdapter(lqrAdapterForAbsListView);
    }

}

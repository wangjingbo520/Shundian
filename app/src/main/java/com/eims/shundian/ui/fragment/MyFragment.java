package com.eims.shundian.ui.fragment;


import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.eims.shundian.R;
import com.eims.shundian.adapter.recyadapter.MyAdapter;
import com.eims.shundian.base.BaseFragment;
import com.eims.shundian.ui.activity.MyCollectionActivity;
import com.eims.shundian.ui.activity.MyCommentActivity;
import com.eims.shundian.ui.activity.SelfPromotionListActivity;

import java.util.Arrays;

import butterknife.BindView;

/**
 * @author bobo
 * @date 2018/9/1
 * describe 我的
 */
public class MyFragment extends BaseFragment {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private String[] mTitles;
    private MyAdapter myAdapter;

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
        recyclerView.setLayoutManager(new GridLayoutManager(mContext,4));
        recyclerView.setAdapter(myAdapter = new MyAdapter(R.layout.item_my_gridview,Arrays.asList(mTitles)));
        myAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                switch (position) {
                    case 0:
                        //我的收藏
                        mContext.startActivity(new Intent(mContext,MyCollectionActivity.class));
                        break;
                    case 1:
                        //自提列表
                        startToActivity(SelfPromotionListActivity.class, false);
                        break;
                    case 2:
                        //我的评价
                        startToActivity(MyCommentActivity.class, false);
                        break;
                    default:
                        break;
                }
            }
        });
    }

}

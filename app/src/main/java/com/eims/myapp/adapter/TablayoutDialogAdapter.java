package com.eims.myapp.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * @author bobo
 * @date 2018/10/18
 * describe
 */
public class TablayoutDialogAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public TablayoutDialogAdapter(int layoutResId, @Nullable List<String>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String
            goodsTypeListBean) {
//        helper.setText(R.id.tvName, goodsTypeListBean.getGoods_type_name());
//        GlideImageLoader.loadImage(mContext, goodsTypeListBean.getPic_url(), (ImageView) helper
//                .getView(R.id.ivPic));

    }
}

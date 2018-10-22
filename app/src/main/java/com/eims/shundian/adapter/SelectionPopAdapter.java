package com.eims.shundian.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.eims.shundian.R;

import java.util.List;

/**
 * @author bobo
 * @date 2018/10/22
 * describe
 */
public class SelectionPopAdapter extends BaseAdapter {
    private Context context;
    private List<Object> listBeanList;
    private int tag = 0;

    public SelectionPopAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Object> listBeanList, int tag) {
        this.tag = tag;
        this.listBeanList = listBeanList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return listBeanList.size();
    }

    @Override
    public Object getItem(int arg0) {
        return listBeanList.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }

    @Override
    public View getView(final int position, View arg1, ViewGroup arg2) {
        ViewHolder holder = null;
        if (arg1 == null) {
            holder = new ViewHolder();
            arg1 = View.inflate(context, R.layout.listview_pop, null);
            holder.tvTitle = arg1.findViewById(R.id.tvTitle);
            arg1.setTag(holder);
        } else {
            holder = (ViewHolder) arg1.getTag();
        }
        return arg1;
    }

    static class ViewHolder {
        TextView tvTitle;
    }
}
package com.eims.shundian.common.widgets.popwindow;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.eims.shundian.R;
import com.eims.shundian.adapter.SelectionPopAdapter;

/**
 * @author bobo
 * @date 2018/10/22
 * describe 商品列表
 */
public class SelectionPop extends PopupWindow {
    private Activity context;
    private ListView mListView;
    private SelectionPopAdapter selectionPopAdapter;

    public SelectionPop(final Activity context) {
        super(context);
        this.context = context;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View mView = inflater.inflate(R.layout.layout_electionpop, null);
        mListView = (ListView) mView.findViewById(R.id.listview);
        selectionPopAdapter = new SelectionPopAdapter(context);
        mListView.setAdapter(selectionPopAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dismiss();
            }
        });

        this.setContentView(mView);
        this.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        this.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        this.setFocusable(false);
        ColorDrawable dw = new ColorDrawable(0xb0000000);
        this.setBackgroundDrawable(dw);
        this.setOutsideTouchable(true);
        this.setTouchable(true);
    }

}

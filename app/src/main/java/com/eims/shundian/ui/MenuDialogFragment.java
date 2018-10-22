package com.eims.shundian.ui;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eims.shundian.R;

/**
 * @author bobo
 * @date 2018/9/1
 * describe 菜单定制
 */
public class MenuDialogFragment extends DialogFragment {
    private RecyclerView mRecyclerView;
    private TextView tvSure;

    public static MenuDialogFragment newInstance() {
        MenuDialogFragment dialogFragment = new MenuDialogFragment();
        Bundle bundle = new Bundle();
//        bundle.putSerializable("dataSelected", (Serializable) selectedDatas);
//        bundle.putSerializable("dataUnselected", (Serializable) unselectedDatas);
        dialogFragment.setArguments(bundle);
        return dialogFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Dialog dialog = getDialog();
        if (dialog != null) {
            //添加动画
            dialog.getWindow().setWindowAnimations(R.style.dialogSlideAnim);
        }
        return inflater.inflate(R.layout.fragment_menu_dialog, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView =  view.findViewById(R.id.recyclerView);
        tvSure = view.findViewById(R.id.tvSure);
        tvSure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
       // processLogic();
    }
}

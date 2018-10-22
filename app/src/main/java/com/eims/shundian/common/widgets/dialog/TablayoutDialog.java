package com.eims.shundian.common.widgets.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.eims.shundian.R;

/**
 * @author bobo
 * @date 2018/10/18
 * describe
 */
public class TablayoutDialog extends Dialog implements View.OnClickListener {

    public TablayoutDialog( Activity context) {
        super(context, R.style.ActionSheetDialogStyle);
        WindowManager m = context.getWindowManager();
        Display d = m.getDefaultDisplay();
        setContentView(R.layout.layout_talayout_menu);
        Window dialogWindow = getWindow();
        dialogWindow.setGravity(Gravity.BOTTOM);
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        lp.width = d.getWidth();
        dialogWindow.setAttributes(lp);
    }

    @Override
    public void onClick(View view) {

    }
}

package com.eims.shundian.common.zxing;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.eims.shundian.R;

public class BasicActivity extends AppCompatActivity {

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }
}

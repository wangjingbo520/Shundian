package com.eims.shundian.common.zxing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.eims.shundian.R;
import com.eims.shundian.common.zxing.common.Scanner;


/**
 * 纯文本显示
 */
public class TextActivity extends BasicActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        Bundle extras = getIntent().getExtras();
        if (extras != null)
            ((TextView) findViewById(R.id.textView3)).setText(extras.getString(Scanner.Scan.RESULT));
    }

    public static void gotoActivity(Activity activity, Bundle bundle) {
        activity.startActivity(new Intent(activity, TextActivity.class).putExtras(bundle));
    }
}

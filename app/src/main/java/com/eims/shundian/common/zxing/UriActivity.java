package com.eims.shundian.common.zxing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.eims.shundian.R;
import com.eims.shundian.common.zxing.common.Scanner;
import com.eims.shundian.common.zxing.result.URIResult;
import com.mylhyl.crlayout.SwipeRefreshWebView;


/**
 * URI显示
 */
public class UriActivity extends BasicActivity {
    private SwipeRefreshWebView swipeRefreshWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uri);
        String uri = ((URIResult) getIntent().getSerializableExtra(Scanner.Scan.RESULT)).getUri();
        swipeRefreshWebView = (SwipeRefreshWebView) findViewById(R.id.webView);
        swipeRefreshWebView.getScrollView().loadUrl(uri);
        swipeRefreshWebView.getScrollView().setWebViewClient(new SampleWebViewClient());
    }

    private class SampleWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            swipeRefreshWebView.autoRefresh();
            return true;
        }
    }

    public static void gotoActivity(Activity activity, Bundle bundle) {
        activity.startActivity(new Intent(activity, UriActivity.class).putExtras(bundle));
    }
}

package com.canadore.mobileapp.yourfitness;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by gagan on 3/3/2018.
 */

public class fb extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fbdesign);
        WebView myWebView = (WebView) findViewById(R.id.fburl);
        myWebView.loadUrl("http://www.facebook.com");
    }

}

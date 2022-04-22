package com.goddes.egypyte.settingsEG;

import static com.goddes.egypyte.activity.EG.navControllerEG;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.goddes.egypyte.R;
import com.goddes.egypyte.activity.EG;

public class WebSetEG {

    private EG eg;
    public static ValueCallback<Uri> csgsa;
    public static Uri nhdfs = null;
    public static ValueCallback<Uri[]> nhfsr;
    public static String as;
    public static final int cacs = 1;

    public WebSetEG(EG eg) {
        this.eg = eg;
    }

    public void setWebEG(WebView webViewFullAppEG) {

        webViewFullAppEG.getSettings().setJavaScriptEnabled(true);
        webViewFullAppEG.getSettings().setDomStorageEnabled(true);
        webViewFullAppEG.getSettings().setLoadWithOverviewMode(true);
        webViewFullAppEG.clearCache(false);
        webViewFullAppEG.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webViewFullAppEG, true);
        webViewFullAppEG.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (url.contains(DecodeEG.decodeEG("ZXJyb3I9YXBwYWZBczNm")) || url.contains(DecodeEG.decodeEG("ZGlzYWJsZWQuaHRtbA=="))) {

                    navControllerEG.navigate(R.id.fragmentButtEG);
                    Log.d("weq","boot");
                }
            }
        });
        webViewFullAppEG.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView view,
                                             ValueCallback<Uri[]> filePath,
                                             FileChooserParams fileChooserParams) {
                if (nhfsr != null) {
                    nhfsr.onReceiveValue(null);
                }
                nhfsr = filePath;
                Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
                contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
                contentSelectionIntent.setType("*/*");
                Intent[] intentArray = new Intent[0];
                Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
                chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
                chooserIntent.putExtra(Intent.EXTRA_TITLE, DecodeEG.decodeEG("U2VsZWN0IE9wdGlvbjo="));
                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
                eg.startActivityForResult(chooserIntent, 1);
                return true;
            }
        });
    }
}

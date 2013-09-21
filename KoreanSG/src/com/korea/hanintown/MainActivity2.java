package com.korea.hanintown;

import org.apache.http.util.EncodingUtils;

import com.korea.hanintown.DYActivity.JavaScriptInterface;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.view.Menu;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends DYActivity {

	WebView webView;
	ProgressDialog pd = null;

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		try
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main_activity2);

			webView = (WebView) findViewById(R.id.webView);
			webView.getSettings().setJavaScriptEnabled(true);

			pd = ProgressDialog.show(this, "", "·ÎµùÁß...",true);

			webView.setWebViewClient(new WebViewClient() {
				
				@Override
				public boolean shouldOverrideUrlLoading(WebView view, String url) {
					// TODO Auto-generated method stub
					return super.shouldOverrideUrlLoading(view, url);
				}
				
				@Override
				public void onPageFinished(WebView view, String url) {

					if(pd.isShowing()&&pd!=null)
					{
						pd.dismiss();
					}
				}
			});

			webView.setWebChromeClient(new WebChromeClient() {

			});

			//webView.addJavascriptInterface(new JavaScriptInterface(this), "Android");

			//	    		String url = "web/mobile/board/BoardItemList.php";
			//	    	    String postData = "categoryID=&boardName=" + boardName + "&osType=" + getOSType();

			//	    	    webView.postUrl( serverURL + url , EncodingUtils.getBytes(postData, "base64"));
			webView.loadUrl("http://www.hanintownsg.com/web/mobile/main.php");

		}
		catch( Exception ex )
		{
			writeLog( ex.getMessage() );
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}

}

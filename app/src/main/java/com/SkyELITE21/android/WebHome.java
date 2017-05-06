package com.SkyELITE21.android;
import android.os.*;
import android.webkit.*;
import android.app.*;

public class WebHome extends Activity
{
	private WebView wv;
	private WebSettings ws;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.web_layout);
		wv = (WebView)findViewById(R.id.WebLayout);
		ws = wv.getSettings();
		wv.loadUrl(InitializeData.HOME_URL);
		ws.setJavaScriptEnabled(true);
		ws.setAppCacheEnabled(true);
		ws.setCacheMode(ws.LOAD_CACHE_ELSE_NETWORK);
		ws.setBuiltInZoomControls(true);
		ws.setAllowContentAccess(true);
		ws.setAllowFileAccess(true);
		ws.setAllowFileAccessFromFileURLs(true);
		ws.setAllowUniversalAccessFromFileURLs(true);
		ws.setDatabaseEnabled(true);
		ws.setGeolocationEnabled(true);
		ws.setPluginState(WebSettings.PluginState.ON);
		ws.setRenderPriority(WebSettings.RenderPriority.HIGH);
		ws.setSaveFormData(true);
		ws.setSavePassword(true);
		ws.setUserAgentString("SkyELITE21");
		ws.setUseWideViewPort(true);
		wv.setWebViewClient(new WebHomeClient());
	}
	class WebHomeClient extends WebViewClient
	{

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request)
		{
			// TODO: Implement this method
			return super.shouldOverrideUrlLoading(view, request);
		}
		
	}
	class WebHomeChromeClient extends WebChromeClient
	{
		
	}
}

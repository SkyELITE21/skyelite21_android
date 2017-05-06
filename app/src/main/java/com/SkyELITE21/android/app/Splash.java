package com.SkyELITE21.android.app;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;

public class Splash extends Activity
{
	public void displaySplashThenLaunch(long ms,int res,Class clazz)
	{
		setContentView(res);
		final Class clazz2 = clazz;
		new Handler().postDelayed(new Runnable(){
				@Override
				public void run() {
					/* Create an Intent that will start the Menu-Activity. */
					Intent mainIntent = new Intent(getApplicationContext(),clazz2);
					startActivity(mainIntent);
					finish();
				}
			}, ms);
	}
}

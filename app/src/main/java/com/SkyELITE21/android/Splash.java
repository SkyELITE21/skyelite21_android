package com.SkyELITE21.android;
import android.app.*;
import android.content.*;
import android.os.*;
import com.SkyELITE21.android.app.*;

public class Splash extends com.SkyELITE21.android.app.Splash
{
	long TIME = 10000;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		displaySplashThenLaunch(TIME,R.layout.splash,InitializeData.class);
	}
}

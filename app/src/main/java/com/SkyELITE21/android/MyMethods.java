package com.SkyELITE21.android;

import android.app.*;
import android.content.*;

public class MyMethods
{
	public MyMethods()
	{
		
	}
	public static void launchActivity(Context context,Class c0)
	{
		context.startActivity(new Intent(context,c0));
	}
	public static void finishActivity(Activity activity)
	{
		activity.finish();
	}
	public static void finishActivities(Activity activity[])
	{
		int length = activity.length;
		for(int i = 0;i < length; i++)
		{
			activity[i].finish();
		}
	}
}

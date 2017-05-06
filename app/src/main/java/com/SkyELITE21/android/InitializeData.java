package com.SkyELITE21.android;
import android.app.*;
import android.os.*;
import android.content.*;

public class InitializeData extends Activity
{
	public static final String HOME_URL = "http://skyelite21.weebly.com",
	GITHUB_URL = "https://github.com/SkyELITE21";
	private SharedPreferences sp;
	private SharedPreferences.Editor spe;
	private boolean isFirstTime;
	private String ift = "isFirstTime",rf = "runFrequency";
	private long runFrequency;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		sp = getSharedPreferences(getPackageName(),MODE_PRIVATE);
		spe = sp.edit();
		isFirstTime = sp.getBoolean(ift,false);
		runFrequency = sp.getLong(rf,0);
		if(isFirstTime == false)
		{
			spe.putLong(rf,runFrequency++);
			spe.commit();
			startActivity(new Intent(this,WebHome.class));
			finish();
		}
		else
		{
			spe.putBoolean(ift,false);
			spe.putLong(rf,runFrequency++);
			spe.commit();
			startActivity(new Intent(this,WebHome.class));
			finish();
		}
	}
}

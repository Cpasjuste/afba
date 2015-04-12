package com.greatlittleapps.afba;

import android.os.Bundle;
import fr.mydedibox.libarcade.activity.romListActivity;
import fr.mydedibox.libarcade.preferences.EmuPreferences;

public class MainActivity extends romListActivity 
{
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
		Compatibility compatList = new Compatibility();
		this.Init( "aFBA", compatList.list );
		EmuPreferences.DATA_URL = "http://android.mydedibox.fr/afba/afba_data.zip";
		
		super.onCreate(savedInstanceState);
		
		if( !prefs.GetDataOk() )
     	{
         	dialogdownloadPreviews();
     	}
    }
}

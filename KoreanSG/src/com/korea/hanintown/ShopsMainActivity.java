package com.korea.hanintown;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class ShopsMainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	try
    	{
    		super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_shops_main);
            
            TabHost tabHost = getTabHost();
            
            TabSpec categorySpec = tabHost.newTabSpec("�з���");
            categorySpec.setIndicator("�з���");
            Intent categoryIntent = new Intent(this, ShopsByCategoryActivity.class);
            categorySpec.setContent(categoryIntent);
            
            TabSpec menuSpec = tabHost.newTabSpec("�޴���");
            menuSpec.setIndicator("�޴���");
            Intent menuIntent = new Intent(this, ShopsByMenuActivity.class);
            menuSpec.setContent(menuIntent);
            
            tabHost.addTab(categorySpec); 
            tabHost.addTab(menuSpec);
            
//            for (int i = 0; i < tabHost.getTabWidget().getTabCount(); i++) {
//                tabHost.getTabWidget().getChildAt(i).getLayoutParams().height = 33;
//            }
    	}
    	catch( Exception ex )
    	{
    		System.out.println( ex.getMessage() );
    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_shops_main, menu);
        return true;
    }
    
    public void goBack( View v )
    {
    	finish();
    }
}

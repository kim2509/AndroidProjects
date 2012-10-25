package com.krking;

import org.json.JSONObject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.Toast;

public class BaseFragment extends Fragment
{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	
	public void showToastMessage( String message )
	{
		Toast.makeText( getActivity(), message, Toast.LENGTH_LONG).show();
	}
	
	public void writeLog( String log )
	{
		Log.i("KRKing", log );
	}
	
	public void execTransReturningString( String url, JSONObject request )
	{
		new TransactionTaskReturningString( this, url ).execute( request );
	}
	
	public void execTransReturningString( String url, int requestCode, JSONObject request )
	{
		new TransactionTaskReturningString( this, url, requestCode ).execute( request );
	}
	
	public void doPostTransaction( String result )
	{
		
	}
	
	public void doPostTransaction( int requestCode, String result )
	{
		
	}
}

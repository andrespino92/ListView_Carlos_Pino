package com.example.claselistview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment2 extends Fragment 
{
	TextView tv;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) 
	{
		View rootView = inflater.inflate(R.layout.fragment2, container, false);
		tv = (TextView)rootView.findViewById(R.id.textView1);
		
		tv.setText(getArguments().getString("ele"));

		return rootView;
	}

}

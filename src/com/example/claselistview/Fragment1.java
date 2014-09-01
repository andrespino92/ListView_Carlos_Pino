package com.example.claselistview;

import java.util.ArrayList;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Fragment1 extends Fragment {

	private ListView lista;
    private String[] materias = {"algoritmia", "calculo", "fisica", "algebra Lineal", "estructura de datos", 
                                "compiladores", "optmizacion", "movil", "Bajo la Web", "Proyecto final"};
    private Fragment2 f2;
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) 
	{
		final View rootView = inflater.inflate(R.layout.fragment1, container, false);

		lista = (ListView)rootView.findViewById(R.id.listView1);
		ArrayAdapter<String> adaptador = new ArrayAdapter<String>(rootView.getContext(), android.R.layout.simple_list_item_activated_1, materias);

		lista.setAdapter(adaptador);
		f2 = new Fragment2();
		
		lista.setOnItemClickListener(new OnItemClickListener(){
			 
		    @Override
		    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) 
		    {
		        // TODO Auto-generated method stub
		        Toast.makeText(rootView.getContext(), "Ha pulsado el item " + position, Toast.LENGTH_SHORT).show();
		        Bundle args = new Bundle();
		        args.putString("ele", materias[position]);
		        f2.setArguments(args);
		        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
				ft.replace(R.id.container, f2).addToBackStack("f2").commit();
		 
		    }
		 
		});

		return rootView;	
	}

}

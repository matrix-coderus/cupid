package com.vediconex.www;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SelectCustomerActivity extends Activity {
	
	private ListView list;
	private ArrayAdapter<String> adapter;
	private List<String> customerNames;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_customer);
		customerNames = new ArrayList<String>();
		populateCustomerNames();
		
		list = (ListView)findViewById(R.id.listView_selectCustomer);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, customerNames);
		
		list.setAdapter(adapter);
	}
	
	private void populateCustomerNames() {
		for (Customer c : Containers.customerList) {
			customerNames.add(c.getName()+" "+c.getSurname());
		}
	}
}

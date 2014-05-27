package com.vediconex.www;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HomePageActivity extends Activity implements OnClickListener {
	
	private Button products, addUser, listUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        
        products = (Button)findViewById(R.id.btnProducts);
        addUser = (Button)findViewById(R.id.btnAddCustomer);
        listUsers = (Button)findViewById(R.id.btnListCustomers);
        
        products.setOnClickListener(this);
        addUser.setOnClickListener(this);
        listUsers.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		Intent i;
		int buttonId = v.getId();
		
		System.out.println(buttonId);
		
		switch(buttonId) {
		case R.id.btnProducts:
		break;
		case R.id.btnAddCustomer: i = new Intent(this, AddCustomerActivity.class);
		startActivity(i);
		break;
		case R.id.btnListCustomers: 
		break;
		default: Toast.makeText(this, "Experience errors try again", Toast.LENGTH_SHORT).show();
		}
		
	}
}

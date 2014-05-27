package com.vediconex.www;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddCustomerActivity extends Activity implements OnClickListener {
	
	private EditText firstname;
	private EditText lastname;
	private Button register;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_customer);
		
		firstname = (EditText)findViewById(R.id.edit_txt_firstname);
		lastname = (EditText)findViewById(R.id.edit_txt_last_name);
		register = (Button)findViewById(R.id.btnRegister);
		
		register.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		String firstNameEntered = firstname.getText().toString();
		String lastNameEntered = lastname.getText().toString();
		
		if (firstNameEntered.length()<1) {
			firstname.setError("First name can't be blank");
		}
		if (firstNameEntered.length()>25) {
			firstname.setError("First name cannot be more than 25 chars");
		}
		if (lastNameEntered.length()<1) {
			lastname.setError("Last name can't be blank");
		}
		if (lastNameEntered.length()>25) {
			lastname.setError("Last name cannot be more than 25 chars");
		}
		
		if ((firstNameEntered.length()>0 && lastNameEntered.length()>0)) {
			Customer customer = new Customer(firstNameEntered, lastNameEntered, 1000.00, new Basket());
			Containers.customerList.add(customer);
			Toast.makeText(this, "Customer has been added", Toast.LENGTH_SHORT).show();
		}
	
		
		
	}
	
	
	
}

package com.vediconex.www.test;

import com.vediconex.www.AddCustomerActivity;

import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;
import com.vediconex.www.AddCustomerActivity;
import com.vediconex.www.Containers;
import com.vediconex.www.R;

import android.test.ActivityInstrumentationTestCase2;

public class AddCustomerActivityModel extends
		ActivityInstrumentationTestCase2<AddCustomerActivity> {

	protected EditText firstname;
	protected EditText lastname;
	protected Button registerBtn;
	protected AddCustomerActivity activity;
	protected Solo solo;

	public AddCustomerActivityModel() {
		super(AddCustomerActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		setActivityInitialTouchMode(false);
		activity = getActivity();
		solo = new Solo(getInstrumentation(), activity);
		firstname = (EditText)activity.findViewById(R.id.edit_txt_firstname);
		lastname = (EditText)activity.findViewById(R.id.edit_txt_last_name);
		registerBtn = (Button)activity.findViewById(R.id.btnRegister);
		Containers.customerList.clear();
	}
	
	
	
	protected void fillForm(String first, String last) {
		solo.enterText(firstname, first);
		solo.enterText(lastname, last);
		solo.clickOnButton(solo.getString(R.string.register_customer_btn));
	}
	

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

}

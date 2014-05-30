package com.vediconex.www.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;
import com.vediconex.www.AddCustomerActivity;
import com.vediconex.www.Containers;
import com.vediconex.www.R;

public class AddCustomerActivityTest extends
		ActivityInstrumentationTestCase2<AddCustomerActivity> {
	
	private EditText firstname;
	private EditText lastname;
	private Button registerBtn;
	private AddCustomerActivity activity;
	private Solo solo;

	public AddCustomerActivityTest() {
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
	
	public void testPreconditions() {
		assertNotNull(activity);
		assertNotNull(firstname);
		assertNotNull(lastname);
		assertNotNull(registerBtn);
	}
	
	private void fillForm(String first, String last) {
		solo.enterText(firstname, first);
		solo.enterText(lastname, last);
		solo.clickOnButton(solo.getString(R.string.register_customer_btn));
	}
	
	public void testUserRegisters() {
		fillForm("Karl", "Jenkins");
		assertEquals(1, Containers.customerList.size());
	}
	
	public void testFirstnameCannotBeBlank() {
		fillForm("", "Jenkins");
		assertEquals(0, Containers.customerList.size());
	}
	
	public void testLastnameCannotBeBlank() {
		fillForm("Karl", "");
		assertEquals(0, Containers.customerList.size());
	}
	
	
	

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	
	
	

}

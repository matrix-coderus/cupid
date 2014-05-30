package com.vediconex.www.test;

import com.vediconex.www.Containers;


public class AddCustomerActivityTest extends AddCustomerActivityModel {

	public AddCustomerActivityTest() {
		super();
	}

	public void testPreconditions() {
		assertNotNull(activity);
		assertNotNull(firstname);
		assertNotNull(lastname);
		assertNotNull(registerBtn);
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
	
	public void testToastMessageConfirmation() {
		fillForm("Karl", "Jenkins");
		assertTrue(solo.searchText("Customer has been added"));
	}
	
	public void testFirstNameMaxCharValidation() {
		fillForm("abcdefghijklmnopqrstuvwxyz", "Jenkins");
		assertEquals(0, Containers.customerList.size());
		assertFalse(solo.searchText("Customer has been added"));
	}
	
	public void testLastNameMaxCharValidation() {
		fillForm("Karl","abcdefghijklmnopqrstuvwxyz");
		assertEquals(0, Containers.customerList.size());
		assertFalse(solo.searchText("Customer has been added"));
	}

}

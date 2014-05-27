package com.vediconex.www;

public class Customer {
	
	private String name;
	private String surname;
	private double accountBal;
	private Basket shoppingBasket;
	
	public Customer(String name, String surname, double accountBal,
			Basket shoppingBasket) {
		super();
		this.name = name;
		this.surname = surname;
		this.accountBal = accountBal;
		this.shoppingBasket = shoppingBasket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getAccountBal() {
		return accountBal;
	}

	public void setAccountBal(double accountBal) {
		this.accountBal = accountBal;
	}

	public Basket getShoppingBasket() {
		return shoppingBasket;
	}

	public void setShoppingBasket(Basket shoppingBasket) {
		this.shoppingBasket = shoppingBasket;
	}	

}

package com.redhat;


public class Order {
	private String name;
	private int qty;
	private double price;

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public Order() {
	}
}
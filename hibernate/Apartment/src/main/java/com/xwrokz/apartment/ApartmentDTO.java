package com.xwrokz.apartment;

public class ApartmentDTO {

	private int id;
	private String name;
	private int noOfFlats;
	private float price;
	
	public ApartmentDTO() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfFlats() {
		return noOfFlats;
	}
	public void setNoOfFlats(int noOfFlats) {
		this.noOfFlats = noOfFlats;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}

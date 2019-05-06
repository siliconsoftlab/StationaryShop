package com.stationaryshop.dto;

public class Item {
private int id;
private String type;
private float unitPrice;
private int count;


public Item(int id, String type, float unitPrice, int count) {
	super();
	this.id = id;
	this.type = type;
	this.unitPrice = unitPrice;
	this.count = count;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public float getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(float unitPrice) {
	this.unitPrice = unitPrice;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
@Override
public String toString() {
	return "Item [id=" + id + ", type=" + type + ", unitPrice=" + unitPrice + ", count=" + count + "]";
}

}

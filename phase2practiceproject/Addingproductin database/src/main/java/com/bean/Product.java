package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products1")
public class Product {
@Id
private int id;
private String name;
private float price;
public int getPid() {
	return id;
}
public void setPid(int pid) {
	this.id = pid;
}
public String getPname() {
	return name;
}
public void setPname(String pname) {
	this.name = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() { 
	return "Product [pid=" + id + ", pname=" + name + ", price=" + price + "]";
}

}
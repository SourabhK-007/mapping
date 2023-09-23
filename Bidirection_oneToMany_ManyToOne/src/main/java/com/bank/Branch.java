package com.bank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Branch {
@Id@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private String name;
private String address;
private String ifsc;

@ManyToOne
private Bank banks;

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

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getifsc() {
	return ifsc;
}

public void setifsc(String ifsc) {
	this.ifsc = ifsc;
}

public Bank getBanks() {
	return banks;
}

public void setBanks(Bank banks) {
	this.banks = banks;
}



}

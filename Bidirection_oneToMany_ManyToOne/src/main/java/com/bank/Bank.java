package com.bank;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private	String name;
	private	String website;
	private	 long ph;
	private	int nobranch;

	@OneToMany
	private	List<Branch> branches;

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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public long getPh() {
		return ph;
	}

	public void setPh(long ph) {
		this.ph = ph;
	}

	public int getNobranch() {
		return nobranch;
	}

	public void setNobranch(int nobranch) {
		this.nobranch = nobranch;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}


}

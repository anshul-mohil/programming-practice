package com.anshul.cci.callcenter.model;

public class Employee {

	private final Rank rank;
	private Boolean status = true;

	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Rank getRank() {
		return rank;
	}

	public Employee(Rank rank) {
		super();
		this.rank = rank;
	}

}

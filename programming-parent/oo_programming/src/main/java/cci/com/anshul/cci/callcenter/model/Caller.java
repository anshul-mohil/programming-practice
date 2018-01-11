package com.anshul.cci.callcenter.model;

public class Caller {

	private final String name, id, issue;

	public Caller(String name, String id, String issue) {
		this.name = name;
		this.id = id;
		this.issue = issue;

	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getIssue() {
		return issue;
	}
	
}

package com.springcore.ci;

import java.util.List;

public class Person {

	private String name;
	private int personId;
	private List<String> phoneno;

	public Person(String name, int personId, List<String> phoneno) {
		super();
		this.name = name;
		this.personId = personId;
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", phones=" + phoneno + "]";
	}

}

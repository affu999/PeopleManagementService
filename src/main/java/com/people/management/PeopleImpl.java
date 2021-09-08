package com.people.management;

public class PeopleImpl implements People {

	private String name = "Affan";
	private String gender = "Male";
	private int age = 22;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getGender() {
		
		return gender;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

}

//http://localhost:8082/PeopleManagementService/services/PeopleImpl?wsdl

// https://www.youtube.com/watch?v=11iGyrvBhzc

// https://www.youtube.com/watch?v=1TympcH1fJ0

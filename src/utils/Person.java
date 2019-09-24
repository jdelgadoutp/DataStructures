package utils;

import cap1.arrays.HashTable;

public class Person {

	// Step 1. Create attributes

	private String document;
	private String name;
	private String phone;

	// Step 1.1. Create Constructor

	public Person(String document, String name, String phone) {
		this.document = document;
		this.name = name;
		this.phone = phone;
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean assertArrayEquals(Person[] person1, Person[] person2) {

		boolean response = false;
		HashTable hash = new HashTable(13);
		if (person1[hash.FuntionHash(this.document)].document
				.equals(person2[hash.FuntionHash(this.document)].document)) {
			if (person1[hash.FuntionHash(this.document)].name.equals(person2[hash.FuntionHash(this.document)].name)) {
				if (person1[hash.FuntionHash(this.document)].phone
						.equals(person2[hash.FuntionHash(this.document)].phone)) {
					response = true;
				}
			}

		}
		return response;
	}

	// Step 2.2. Create CRUD methods
}

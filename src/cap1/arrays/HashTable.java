package cap1.arrays;

import java.util.StringTokenizer;
import java.util.function.DoubleConsumer;

import javax.swing.text.Document;

import utils.Person;

public class HashTable {

	// Step 1. Create attributes

	private Person[] elements;
	private float chargefactor;
	private int size;

	// Step 1.1. Create Constructor

	public HashTable(int newsize) {
		this.size = newsize;
		this.chargefactor = 0;
		this.elements = new Person[newsize];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public Person[] getElements() {
		return elements;
	}

	public void setElements(Person[] elements) {
		this.elements = elements;
	}

	public float getChangefactor() {
		return chargefactor;
	}

	public void setChangefactor(float changefactor) {
		this.chargefactor = changefactor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// Step 2.2. Create CRUD methods

	public int FuntionHash(String document) {

		Integer par1 = (Integer.parseInt(document)) % 100;
		Integer par2 = (Integer.parseInt(document)) / 100 % 100;
		Integer par3 = (Integer.parseInt(document)) / 100 / 100 % 100;
		Integer par4 = (Integer.parseInt(document)) / 100 / 100 / 100 % 100;
		Integer par5 = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 % 100;
		Integer par6 = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;
		Integer par7 = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;

		return ((par1 + par2 + par3 + par4 + par5 + par6 + par7) % this.size);

	}

	public Person[] InserTableHash(String document, String name, String phone) {
		Person newperson = new Person(document, name, phone);
		this.elements[FuntionHash(document)] = newperson;
		this.setChangefactor(getChangefactor() + (float) 7.69);
		return this.elements;
	}

	public Person[] DeleteTableHash(String document) {
		this.elements[FuntionHash(document)] = null;
		this.setChangefactor(getChangefactor() - (float) 7.69);
		return this.elements;
	}

	public String SearchTableHash(String document) {
		String found = "";
		if (this.elements[FuntionHash(document)].getDocument().equals(document)) {
			found = document;
		}
		return found;
	}

	public Person[] UpdateHashTable(String document, String name, String phone) {
		this.elements[FuntionHash(document)].setName(name);
		this.elements[FuntionHash(document)].setPhone(phone);
		return this.elements;
	}

	public void ListHashTable(String document1,String document2,String document3) {
		System.out.println("-----  List persons  -------");
		System.out.println(this.elements[FuntionHash(document1)].getDocument()+ "," + this.elements[FuntionHash(document1)].getName()+ "," +this.elements[FuntionHash(document1)].getPhone());
		System.out.println(this.elements[FuntionHash(document2)].getDocument()+ "," + this.elements[FuntionHash(document2)].getName()+ "," +this.elements[FuntionHash(document2)].getPhone());
		System.out.println(this.elements[FuntionHash(document3)].getDocument()+ "," + this.elements[FuntionHash(document3)].getName()+ "," +this.elements[FuntionHash(document3)].getPhone());
	}

}

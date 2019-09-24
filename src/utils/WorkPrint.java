package utils;

import java.util.Date;

import cap1.arrays.HashTable;

public class WorkPrint {

	private String name;
	private String state;
	private String proprietor;
	private String port;
	private int pages;
	private float size;
	private String send;

	public WorkPrint(String name, String state, String proprietor, String port, int pages, float size, String send) {
		this.name = name;
		this.state = state;
		this.proprietor = proprietor;
		this.port = port;
		this.pages = pages;
		this.size = size;
		this.send = send;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProprietor() {
		return proprietor;
	}

	public void setProprietor(String proprietor) {
		this.proprietor = proprietor;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getSend() {
		return send;
	}

	public void setSend(String send) {
		this.send = send;
	}

	
}

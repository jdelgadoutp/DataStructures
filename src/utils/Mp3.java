package utils;

public class Mp3 {

	// Step 1. Create attributes

	private String author;
	private String file;
	private String name;
	private String trackNo;

	// Step 1.1. Create Constructor

	public Mp3(String author, String file, String name, String trackNo) {
		this.author = author;
		this.file = file;
		this.name = name;
		this.trackNo = trackNo;
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrackNo() {
		return trackNo;
	}

	public void setTrackNo(String trackNo) {
		this.trackNo = trackNo;
	}

	// Step 2.2. Create CRUD methods
}

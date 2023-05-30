package com.filestructure.model;

public class File {

	private String filename;
	private int size;
	public File(String filename, int size) {
		super();
		this.filename = filename;
		this.size = size;
	}
	public String getFilename() {
		return filename;
	}
	public int getSize() {
		return size;
	}
	
	public String getInformation() {
		return "Filename: " + this.filename + " Size: " + this.getSize();
	}
	
	
	
	
}

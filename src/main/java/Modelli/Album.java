package Modelli;

import java.util.ArrayList;
import java.util.List;

public class Album {

	private String author;
	private List<String> songs;
	private int year;
	private String title;

	public Album(String author, List<String> songs, int year, String title) {
		this.author = author;
		this.songs = new ArrayList<String>();
		this.year = year;
		this.title = title;

	}

	public String getAuthor() {
		return author;
	}

	public List<String> getSongs() {
		return songs;
	}

	public int getYear() {
		return year;
	}

	public String getTitle() {
		return title;
	}
}

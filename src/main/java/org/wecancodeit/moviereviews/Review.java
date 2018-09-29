package org.wecancodeit.moviereviews;

public class Review {
	private long Id;
	private String title;
	private String content;
	private String imageUrl;
	private String category;
	
	public Review(long Id, String title) {
		this.Id = Id;
		this.title = title;
	}
	
	public long getId() {
		return Id;
	}
}

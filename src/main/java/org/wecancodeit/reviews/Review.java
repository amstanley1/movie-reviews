package org.wecancodeit.reviews;

public class Review {
	private long Id;
	private String title;
	private String content;
	private String imageUrl;
	private String category;
	
	public Review(long Id, String title, String content, String imageUrl, String category) {
		this.Id = Id;
		this.title = title;
		this.content = content;
		this.imageUrl = imageUrl;
		this.category = category;
	}
	
	public long getId() {
		return Id;
	}
	
	public String getTitle() {
		return title;
	}
		
	public String getContent() {
		return content;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public String getCategory() {
		return category;
	}
}

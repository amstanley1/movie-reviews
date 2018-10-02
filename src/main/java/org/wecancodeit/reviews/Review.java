package org.wecancodeit.reviews;

import java.util.Collection;

public class Review {
	private long Id;
	private String title;
	private String content;
	private String imageUrl;
	private String category;
	private Collection<String> tags;
	
	public Review(long Id, String title, String content, String imageUrl, String category, Collection<String> tags) {
		this.Id = Id;
		this.title = title;
		this.content = content;
		this.imageUrl = imageUrl;
		this.category = category;
		this.tags = tags;
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
	
	public Collection<String> getTags() {
		return tags;
	}
}

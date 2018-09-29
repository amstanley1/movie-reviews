package org.wecancodeit.moviereviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;



@Repository
public class MovieReviewRepository {
	private Map<Long, Review> reviewList = new HashMap<Long, Review>();
	
	public MovieReviewRepository() {
		Review hellraiser = new Review(1L, "Hellraiser");
		Review ladybird = new Review(2L, "Ladybird");
		Review jurassicWorld = new Review(3L, "Jurassic World");
		
		reviewList.put(hellraiser.getId(),hellraiser);
		reviewList.put(ladybird.getId(),ladybird);
		reviewList.put(jurassicWorld.getId(),jurassicWorld);
	}
	
	public MovieReviewRepository(Review...reviews) {
		for(Review review:reviews) {
			reviewList.put(review.getId(), review);
		}
	}
	
	public Review findOne(long reviewId) {
		return reviewList.get(reviewId);
	}
	
	public Collection<Review> findAll() {
		return reviewList.values();
	}
}

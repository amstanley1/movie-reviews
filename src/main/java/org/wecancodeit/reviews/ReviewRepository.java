package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;



@Repository
public class ReviewRepository {
	private Map<Long, Review> reviewList = new HashMap<Long, Review>();
	
	public ReviewRepository() {
		Review hellraiser = new Review(1L, "Hellraiser", "test content","jurassicworld.jpg","horror");
		Review ladybird = new Review(2L, "The Last Jedi","we are testing content","lastjedi.png","drama");
		Review jurassicWorld = new Review(3L, "Jurassic World","testing content...","jurassicworld.jpg","action");
		
		reviewList.put(hellraiser.getId(),hellraiser);
		reviewList.put(ladybird.getId(),ladybird);
		reviewList.put(jurassicWorld.getId(),jurassicWorld);
	}
	
	public ReviewRepository(Review...reviews) {
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

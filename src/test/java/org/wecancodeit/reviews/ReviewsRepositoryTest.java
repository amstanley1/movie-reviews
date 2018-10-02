package org.wecancodeit.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.wecancodeit.reviews.ReviewRepository;
import org.wecancodeit.reviews.Review;



public class ReviewsRepositoryTest {
	
	ReviewRepository underTest;
	private long firstReviewId = 1L;
	private Review firstReview = new Review(firstReviewId, "","","","", new ArrayList<String>());
	private long secondReviewId = 2L;
	private Review secondReview = new Review(secondReviewId, "","","","", new ArrayList<String>());
	
	
	@Test
	public void shouldFindAReview() {
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat(result, is(firstReview));
	}
	
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));
	}
	
}

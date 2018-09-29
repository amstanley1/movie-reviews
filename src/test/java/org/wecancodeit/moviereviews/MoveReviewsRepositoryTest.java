package org.wecancodeit.moviereviews;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;



public class MoveReviewsRepositoryTest {
	
	MovieReviewRepository underTest;
	private long firstReviewId = 1L;
	private Review firstReview = new Review(firstReviewId, "");
	private long secondReviewId = 2L;
	private Review secondReview = new Review(secondReviewId, "");
	
	
	@Test
	public void shouldFindAReview() {
		underTest = new MovieReviewRepository(firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat(result, is(firstReview));
	}
	
	@Test
	public void shouldFindAllReviews() {
		underTest = new MovieReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));
	}
	
}

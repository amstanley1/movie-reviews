package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	private Map<Long, Review> reviewList = new HashMap<Long, Review>();

	public ReviewRepository() {
		Review girlOnTheTrain = new Review(1L, "The Girl on the Train",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus vitae diam dictum, tincidunt felis nec, sodales magna. Mauris fermentum tellus vitae tempor sagittis. Suspendisse potenti. Donec nec laoreet odio, sed faucibus purus. Duis congue ut mauris nec facilisis. Morbi feugiat magna ultricies nulla aliquet vehicula. Proin est nibh, congue non bibendum quis, dapibus in turpis. Integer placerat felis ut elit vestibulum vehicula id non erat. Integer et ex eget metus porta cursus sit amet non turpis. Morbi felis lectus, aliquam vel felis quis, efficitur luctus ante. Phasellus et porttitor nisi. Maecenas ultricies neque eu odio sollicitudin pretium. Mauris aliquet scelerisque mi, eu sagittis libero sollicitudin sit amet. Aliquam eu metus gravida, bibendum ipsum sit amet, dictum sem. Integer accumsan tortor sed sem euismod, id lacinia felis tempus. Fusce ornare vulputate purus, et scelerisque elit fermentum in.",
				"girlonthetrain.jpg", "Thriller");
		Review lastJedi = new Review(2L, "Star Wars: The Last Jedi",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus vitae diam dictum, tincidunt felis nec, sodales magna. Mauris fermentum tellus vitae tempor sagittis. Suspendisse potenti. Donec nec laoreet odio, sed faucibus purus. Duis congue ut mauris nec facilisis. Morbi feugiat magna ultricies nulla aliquet vehicula. Proin est nibh, congue non bibendum quis, dapibus in turpis. Integer placerat felis ut elit vestibulum vehicula id non erat. Integer et ex eget metus porta cursus sit amet non turpis. Morbi felis lectus, aliquam vel felis quis, efficitur luctus ante. Phasellus et porttitor nisi. Maecenas ultricies neque eu odio sollicitudin pretium. Mauris aliquet scelerisque mi, eu sagittis libero sollicitudin sit amet. Aliquam eu metus gravida, bibendum ipsum sit amet, dictum sem. Integer accumsan tortor sed sem euismod, id lacinia felis tempus. Fusce ornare vulputate purus, et scelerisque elit fermentum in.",
				"lastjedi.png", "Action");
		Review theWitch = new Review(3L, "The Witch",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse justo magna, ullamcorper at malesuada et, facilisis tempus sem. Ut tempor nisl et malesuada hendrerit. Duis magna ligula, convallis sed justo vitae, sollicitudin auctor felis. Nulla mattis volutpat massa, vitae convallis tellus porta vitae. Donec eros nisi, sodales nec venenatis sed, tincidunt in tellus. Nullam dignissim velit lacus, id congue tortor malesuada a. Sed imperdiet dictum tellus, sed suscipit ligula suscipit tempus. Suspendisse semper tellus et odio interdum interdum. Pellentesque ut scelerisque nulla. Donec turpis justo, vehicula non erat quis, imperdiet condimentum purus. Donec molestie mauris at ex viverra porttitor. Proin eros tellus, scelerisque eu cursus eget, sodales at ex. Praesent et consectetur dolor, eget volutpat orci. Donec blandit facilisis orci in varius. Fusce varius diam volutpat facilisis tincidunt. Nulla pharetra venenatis odio, quis mattis nibh hendrerit a.",
				"thewitch.jpg", "Horror");
		Review jurassicWorld = new Review(4L, "Jurassic World",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla bibendum sem in leo pretium vestibulum. Donec fringilla, lorem vitae gravida pellentesque, massa dolor hendrerit est, sed facilisis risus erat quis quam. Donec tincidunt leo at elit gravida varius. Nullam non molestie nunc, quis convallis libero. Donec pharetra sapien lorem, eu sollicitudin felis dictum quis. Aliquam tempus justo mi, et pulvinar lorem rutrum at. Nullam tristique ligula ac eros accumsan faucibus. Sed hendrerit augue at mollis sollicitudin. Mauris sodales turpis sed tortor imperdiet, eget pretium felis convallis. Pellentesque aliquam tempor magna, sed faucibus orci ullamcorper eget. Donec lacinia molestie neque a commodo. Pellentesque libero ipsum, aliquam ac maximus suscipit, rutrum eu sapien. Integer at lectus vitae diam rutrum porta non sit amet neque. Integer sem nibh, vulputate nec odio non, tempor euismod tellus.",
				"jurassicworld.jpg", "Action");
		Review gameNight = new Review(5L, "Game Night",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum in lorem ipsum. Nullam posuere fermentum eros, eget lacinia ligula vulputate quis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean non maximus nisl. Nullam volutpat erat ante, id condimentum justo sagittis non. Cras tempus velit metus. Nulla id facilisis est, sodales vulputate est.",
				"gamenight.jpg", "Comedy");
		Review titanic = new Review(6L, "Titanic",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum ut massa eu magna auctor blandit vel quis leo. Duis vestibulum lacinia accumsan. Suspendisse nec purus aliquet, sollicitudin justo ut, lobortis velit. Nam cursus id magna eu bibendum. Nulla gravida molestie justo hendrerit consequat. Sed euismod ex ut porttitor porttitor. Aenean consequat ante quis tellus aliquam, eget accumsan sapien porta. Aliquam vitae orci commodo sapien sagittis bibendum sed in urna.",
				"titanic.jpg", "Drama");
		Review bridesmaids = new Review(7L, "Bridesmaids",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum est ex, efficitur tincidunt fermentum id, scelerisque sit amet lorem. Vestibulum dignissim quis enim sed consequat. Aenean molestie ligula sit amet massa convallis egestas. Mauris urna purus, tempus sit amet erat a, facilisis maximus augue. Mauris ante orci, ultricies ac lectus semper, scelerisque vulputate velit. Vestibulum a nisl risus. Aliquam viverra erat vel nulla tincidunt hendrerit.t",
				"bridesmaids.jpg", "Comedy");
		Review theCabinInTheWoods = new Review(8L, "The Cabin in the Woods",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis a faucibus ante. Praesent sed mattis lectus. Nunc ut tristique nisl. Proin id fringilla diam. Sed iaculis nisi vel rutrum auctor. Duis congue libero aliquam, porttitor nisl in, faucibus urna. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aliquam convallis, urna eget aliquam sagittis, turpis justo consequat tortor, et dictum odio est et erat.",
				"cabininthewoods.jpg", "Horror");
		Review ladyBird = new Review(9L, "Lady Bird",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus imperdiet, urna sed pharetra dignissim, sem urna rutrum metus, eget ornare tortor felis in libero. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Duis pretium, lectus eu consectetur tempus, nibh eros semper urna, vitae aliquet risus velit vitae nisi. Integer condimentum volutpat velit ut consectetur. In vulputate ut ex vel laoreet. Integer blandit diam dolor, eget cursus ante condimentum et. Maecenas ut consequat lorem, eu fringilla ex. Ut mattis placerat auctor. Nunc ut felis laoreet, scelerisque libero ut, molestie magna. Sed a elit nunc.",
				"ladybird.jpg", "Drama");

		reviewList.put(girlOnTheTrain.getId(), girlOnTheTrain);
		reviewList.put(lastJedi.getId(), lastJedi);
		reviewList.put(theWitch.getId(), theWitch);
		reviewList.put(jurassicWorld.getId(), jurassicWorld);
		reviewList.put(gameNight.getId(), gameNight);
		reviewList.put(titanic.getId(), titanic);
		reviewList.put(bridesmaids.getId(), bridesmaids);
		reviewList.put(theCabinInTheWoods.getId(), theCabinInTheWoods);
		reviewList.put(ladyBird.getId(), ladyBird);

	}

	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
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

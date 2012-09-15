package loostra.entities;


/*
 * Rating is like a review, however it does not include text 
 * explaining the rating.  It's something we could use with 
 * more than just the user, for instance a rating on a job
 * 
 * A review would be different as it would include text, or 
 * could include text (optional vs mandatory) and would allow
 * users to read others reviews.
 */
class Rating {

	private int RaterID;

	private Double Rating;

	public Double getRating() {
		return Rating;
	}

	public void setRating(Double rating) {
		Rating = rating;
	}
}
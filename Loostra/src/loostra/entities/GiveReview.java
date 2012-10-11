package loostra.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class GiveReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "skillRequest_id", unique = true, nullable = false)
	private int reviewID;

	@ManyToOne
	private User reviewer;

	@ManyToOne
	private Give reviewedSkill;

	private String reviewText;

	public int getReviewID() {
		return reviewID;
	}

	public void setReviewID(int reviewID) {
		this.reviewID = reviewID;
	}

	public User getReviewer() {
		return reviewer;
	}

	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}

	public Give getReviewedSkill() {
		return reviewedSkill;
	}

	public void setReviewedSkill(Give reviewedSkill) {
		this.reviewedSkill = reviewedSkill;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
}

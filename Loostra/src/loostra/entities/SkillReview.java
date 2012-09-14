package loostra.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SkillReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "skillRequest_id", unique = true, nullable = false)
	private int reviewID;

	@ManyToOne
	private User reviewer;

	@ManyToOne
	private Skill reviewedSkill;

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

	public Skill getReviewedSkill() {
		return reviewedSkill;
	}

	public void setReviewedSkill(Skill reviewedSkill) {
		this.reviewedSkill = reviewedSkill;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
}

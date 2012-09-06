package loostra.entities;

import java.util.List;

import javax.persistence.Entity;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DecimalDV;

@Entity
public class User {
	
	private int UserId;
	
	private String UserDisplayName;
	
	private List<Comment> PageComment;
	
	private List<User> Following;
	
	private List<User> Followers;
	
	private List<Rating> UserRating;
	
	public String getUserDisplayName() {
		return UserDisplayName;
	}

	public void setUserDisplayName(String userDisplayName) {
		UserDisplayName = userDisplayName;
	}

	public List<Comment> getPageComment() {
		return PageComment;
	}

	public void setPageComment(List<Comment> pageComment) {
		PageComment = pageComment;
	}

	public List<User> getFollowing() {
		return Following;
	}

	public void setFollowing(List<User> following) {
		Following = following;
	}

	public List<User> getFollowers() {
		return Followers;
	}

	public void setFollowers(List<User> followers) {
		Followers = followers;
	}

	public List<Rating> getUserRating() {
		return UserRating;
	}

	public void setUserRating(List<Rating> userRating) {
		UserRating = userRating;
	}

	public double getAverageRating()
	{

		return 0.0;
	}

}

class Rating
{
	
	private int RaterID;
	
	private Double Rating;

	public Double getRating() {
		return Rating;
	}

	public void setRating(Double rating) {
		Rating = rating;
	}
}

class Comment
{
	
	private int CommenterID;
	
	private int CommentID;
	
	private String CommenterDisplayName;
	
	private String Comment;

	public String getCommenterDisplayName() {
		return CommenterDisplayName;
	}

	public void setCommenterDisplayName(String commenterDisplayName) {
		CommenterDisplayName = commenterDisplayName;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}
}

package loostra.entities;

class Comment {

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

package loostra.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "skillRequests")
public class SkillRequest implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skillRequest_id", unique = true, nullable = false)
    private int skillRequestId;
	
	@ManyToOne(optional = false)
	private User requester;
	
	@ManyToOne(optional = false)
	private User skillGiver;
	
	@ManyToOne(optional = false)
	private Skill requestedSkill;

	public int getSkillRequestId() {
		return skillRequestId;
	}

	public void setSkillRequestId(int skillRequestId) {
		this.skillRequestId = skillRequestId;
	}

	public User getRequester() {
		return requester;
	}

	public void setRequester(User requester) {
		this.requester = requester;
	}

	public User getSkillGiver() {
		return skillGiver;
	}

	public void setSkillGiver(User skillGiver) {
		this.skillGiver = skillGiver;
	}

	public Skill getRequestedSkill() {
		return requestedSkill;
	}

	public void setRequestedSkill(Skill requestedSkill) {
		this.requestedSkill = requestedSkill;
	}
	
	
}

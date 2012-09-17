package loostra.entities;

import javax.persistence.Entity;

@Entity
public class Want {
	private String name;
	
	private String description;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void addDescription(String description){
		this.description = description;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
}

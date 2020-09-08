package www.study.com.party.model;

import lombok.Data;

@Data
public class ContactPointVO {
	private String typeName;
	private String contactPoint;
	
	@Override
	public String toString() {
		return "ContactPointVO [typeName=" + typeName + ", contactPoint=" + contactPoint + "]";
	}	
}

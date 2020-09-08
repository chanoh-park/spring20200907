package www.study.com.party.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContactPointVO {
	private int partyId;
	private String typeName;
	private String contactPoint;
	
	public ContactPointVO(String typeName, String contactPoint) {
		this.typeName = typeName;
		this.contactPoint = contactPoint;
	}

	@Override
	public String toString() {
		return "ContactPointVO [typeName=" + typeName + ", contactPoint=" + contactPoint + "]";
	}

	public void setId(int id) {
		this.partyId = id;
	}	
}

package www.study.com.party.model;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrganizationVO extends PartyVO {
	private long salesTot;
	
	public OrganizationVO(String name, Date birthDate, long salesTot) {
		super(name, birthDate);
		this.salesTot = salesTot;
	}
	
	@Override
	public String toString() {
		return "OrganizationVO [salesTot=" + salesTot + ", toString()=" + super.toString() + "]";
	}

}

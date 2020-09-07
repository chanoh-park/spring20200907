package www.study.com.orm.party.model;

public class OrganizationVO extends PartyVO {
	private long salesTot;

	@Override
	public String toString() {
		return "OrganizationVO [salesTot=" + salesTot + ", toString()=" + super.toString() + "]";
	}
	
}

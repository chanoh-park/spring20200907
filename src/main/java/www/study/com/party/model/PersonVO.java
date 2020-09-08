package www.study.com.party.model;

public class PersonVO extends PartyVO {
	private enum Gender{mail, femail}
	private Gender gender;
	
	@Override
	public String toString() {
		return "PersonVO [gender=" + gender + ", toString()=" + super.toString() + "]";
	}
}

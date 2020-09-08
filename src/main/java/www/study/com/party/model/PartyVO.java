package www.study.com.party.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public abstract class PartyVO {
	private int id;
	private String name;
	private Date birthDate;
	
	/** 연락처 목록 */
	private List<ContactPointVO> listContactPoint;
	
	/** 개인화 서비스 처리 용도 목록  */
	private List<HashTagVO> listHashTag;
	
	public List<ContactPointVO> getListContactPoint() {
		return listContactPoint;
	}
	
	public List<HashTagVO> getlistHashTag() {
		return listHashTag;
	}
	
	@Override
	public String toString() {
		return "SimpleVO [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
}

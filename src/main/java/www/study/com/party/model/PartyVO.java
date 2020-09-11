package www.study.com.party.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * POJO plain(순전한) old java object
 * Default Constructor 필수 있어야합니다.
 * get~, set~ 함수가 있어야 함
 */

@Data
@NoArgsConstructor
public class PartyVO {
	private int id;
	private String name;
	private Date birthDate;
		
	public PartyVO(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
		listContactPoint = new ArrayList<>();
	}
	
	public void addContactPoint(ContactPointVO obj) {
		obj.setId(id);
		listContactPoint.add(obj);
	}
	
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

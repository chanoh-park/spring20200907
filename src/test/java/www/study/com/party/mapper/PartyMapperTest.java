package www.study.com.party.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import www.study.com.party.mapper.PartyMapper;
import www.study.com.party.model.ContactPointVO;
import www.study.com.party.model.HashTagVO;
import www.study.com.party.model.PartyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class PartyMapperTest {

	@Setter(onMethod_ = @Autowired)
	private PartyMapper mapper;
	
	@Test
	public void testGetAll() {
		System.out.println("getAll()");
		List<PartyVO> listParty = mapper.getAll();
		
		for (PartyVO party : listParty) {
			System.out.println(party);
		}
	}
	
	@Test
	public void testGetAllWithContactPoint() {
		System.out.println("getAllWithContactPoint()");
		List<PartyVO> listParty = mapper.getAllWithContactPoint();
		
		for (PartyVO party : listParty) {
			System.out.println(party);
			for (ContactPointVO cp : party.getListContactPoint()) {
				System.out.println(cp);
			}
		}
	}
	
	@Test
	public void testGetAllWithContactPointWithoutLoss() {
		System.out.println("getAllWithContactPointWithoutLoss()");
		List<PartyVO> listParty = mapper.getAllWithContactPointWithoutLoss();
		
		for (PartyVO party : listParty) {
			System.out.println(party);
			for (ContactPointVO cp : party.getListContactPoint()) {
				System.out.println(cp);
			}
		}
	}
	
	@Test
	public void testGetAllWithContactPointWithoutLossdAndPersonalService() {
		System.out.println("getAllWithContactPointWithoutLossdAndPersonalService()");
		List<PartyVO> listParty = mapper.getAllWithContactPointWithoutLossdAndPersonalService();
		
		for (PartyVO party : listParty) {
			System.out.println(party);
			for (HashTagVO tag : party.getlistHashTag()) {
				System.out.println(tag);
			}
		}
	}
}

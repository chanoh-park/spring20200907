package www.study.com.party.mapper;

import java.util.List;

import www.study.com.party.model.PartyVO;

public interface PartyMapper {
	public List<PartyVO> getAll();
	
	public List<PartyVO> getAllWithContactPoint();

	public List<PartyVO> getAllWithContactPointWithoutLoss();
	
	public List<PartyVO> getAllWithContactPointWithoutLossdAndPersonalService();
	
	public List<PartyVO> getAllPerson();
}

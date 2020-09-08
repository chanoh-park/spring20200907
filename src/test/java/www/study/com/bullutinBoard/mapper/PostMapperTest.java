package www.study.com.bullutinBoard.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import www.study.com.bullutinBoard.model.ReplyVO;
import www.study.com.party.mapper.PartyMapper;
import www.study.com.party.model.ContactPointVO;
import www.study.com.party.model.HashTagVO;
import www.study.com.party.model.PartyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class PostMapperTest {

	@Setter(onMethod_ = @Autowired)
	private PostMapper mapper;
	
	@Test
	public void testGetAll() {
		System.out.println("testGetAll()");
		List<ReplyVO> listPost = mapper.getAll();
		
		for (ReplyVO reply : listPost) {
			System.out.println(reply);
		}
	}
	
	@Test
	public void testGetAllReply() {
		System.out.println("testGetAllReply()");
		List<ReplyVO> listPost = mapper.getAllReply();
		
		for (ReplyVO reply : listPost) {
			System.out.print(reply);
			System.out.println(reply.getWriter());
		}
	}
}

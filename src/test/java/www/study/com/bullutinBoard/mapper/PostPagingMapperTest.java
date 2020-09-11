package www.study.com.bullutinBoard.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import www.study.com.bullutinBoard.model.ReplyVO;
import www.study.com.framework.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class PostPagingMapperTest {
	@Autowired
	private PostMapper mapper;

	@Test
	public void testGetPostByPaging() {
		try {
			System.out.println("\ntestGetPostByPaging()");
			List<ReplyVO> listSimple = mapper.getPostByPaging(new Criteria(20, 10));
			listSimple.forEach(simple -> {
				System.out.print(simple);
				System.out.println(simple.getWriter());
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

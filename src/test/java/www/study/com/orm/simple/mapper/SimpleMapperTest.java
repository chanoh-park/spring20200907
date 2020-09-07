package www.study.com.orm.simple.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import www.study.com.orm.simple.model.SimpleVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SimpleMapperTest {

	@Setter(onMethod_ = @Autowired)
	private SimpleMapper mapper;
	
	@Test
	public void test() {
		List<SimpleVO> listSimple = mapper.getAll();
		
		for (SimpleVO simple : listSimple) {
			System.out.println(simple);
		}
	}

}

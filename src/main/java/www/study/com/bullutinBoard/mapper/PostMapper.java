package www.study.com.bullutinBoard.mapper;

import java.util.List;

import www.study.com.bullutinBoard.model.PostVO;
import www.study.com.bullutinBoard.model.ReplyVO;
import www.study.com.framework.model.Criteria;

public interface PostMapper {
	public List<ReplyVO> getAll();
	
	public List<ReplyVO> getAllReply();
	
	public int insertPost(PostVO obj);
	
	public int insertReply(ReplyVO obj);
	
	public ReplyVO findById(String hierarchyId);
	
	public int updatePost(PostVO post);
	
	public void removePost(PostVO post);
	
	public int countTotalPost(Criteria criteria);

	public List<ReplyVO> getPostByPaging(Criteria criteria);
}

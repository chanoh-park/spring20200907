package www.study.com.bullutinBoard.mapper;

import java.util.List;

import www.study.com.bullutinBoard.model.PostVO;
import www.study.com.bullutinBoard.model.ReplyVO;

public interface PostMapper {
	public List<ReplyVO> getAll();
	public List<ReplyVO> getAllReply();
	
	public int insertPost(PostVO obj);
	public int insertReply(ReplyVO obj);
}

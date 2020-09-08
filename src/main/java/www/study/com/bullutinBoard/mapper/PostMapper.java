package www.study.com.bullutinBoard.mapper;

import java.util.List;

import www.study.com.bullutinBoard.model.ReplyVO;

public interface PostMapper {
	public List<ReplyVO> getAll();
	public List<ReplyVO> getAllReply();
}

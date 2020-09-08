package www.study.com.bullutinBoard.model;

import java.util.List;

import lombok.Data;
import www.study.com.party.model.PartyVO;

@Data
public class ReplyVO {
	private int id;
	private PartyVO writer;
	private String content;

	@Override
	public String toString() {
		return "ReplyVO [id=" + id + ", writer=" + writer + ", content=" + content + "]";
	}
}

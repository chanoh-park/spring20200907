package www.study.com.bullutinBoard.model;

import lombok.NoArgsConstructor;
import www.study.com.party.model.PartyVO;

@NoArgsConstructor
public class PostVO extends ReplyVO {
	private String title;
	private BoardVO board;
	
	public PostVO(PartyVO writer, String content, String title, BoardVO board) {
		super(null, writer, content);
		this.title = title;
		this.board = board;
	}
	
	@Override
	public String toString() {
		return "PostVO [title=" + title + ", board=" + board + "]";
	}
}

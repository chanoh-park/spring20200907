package www.study.com.bullutinBoard.model;

public class PostVO extends ReplyVO {
	private String title;
	private BoardVO board;
	
	@Override
	public String toString() {
		return "PostVO [title=" + title + ", board=" + board + "]";
	}
}

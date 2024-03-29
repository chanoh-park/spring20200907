package www.study.com.bullutinBoard.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import www.study.com.party.model.PartyVO;

@Data
@NoArgsConstructor
public class ReplyVO {
	private static final char HID_DELI = '-';
	@Getter
	private String hierarchyId;
	private PartyVO writer;
	@Getter
	private String content;
	private ReplyVO parent;

	public ReplyVO(ReplyVO parent, PartyVO writer, String content) {
		this.parent = parent;
		this.writer = writer;
		this.content = content;
	}
	
	public char getHidDeli() {
		return HID_DELI;
	}
	
	public PartyVO getWriter() {
		return writer;
	}

	public ReplyVO getParent() {
		return parent;
	}

	public void setHierarchyId(String hierarchyId) {
		this.hierarchyId = hierarchyId;
	}
	
	protected String toSimpleString() {
		return "hierarchyId="+hierarchyId;
	}
	
	@Override
	public String toString() {
		return "ReplyVO [hierarchyId=" + hierarchyId + ", writer=" + writer + ", content=" + content + "]";
	}
}

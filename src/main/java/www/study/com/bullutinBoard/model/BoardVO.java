package www.study.com.bullutinBoard.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardVO {
	private int id;
	private String name;
	
	public BoardVO(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

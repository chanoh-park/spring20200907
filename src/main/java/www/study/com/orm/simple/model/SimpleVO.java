package www.study.com.orm.simple.model;

import java.util.Date;

import lombok.Data;

@Data
public class SimpleVO {
	private int id;
	private String name;
	private Date birthDate;
}

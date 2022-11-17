package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Free {
	private Long freeNo;
	private String writer;
	private String title;
	private String content;
	private String ip;
	private Long hit;
}

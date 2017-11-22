package hk.lab5.rd.dtos;

public class NoticeDto {

	private int ansseq;
	private String category;
	private String nick;
	private String regdate;
	private String title;
	private String content;
	private String sort;
	private int parent;
	private String reply;
	
	public NoticeDto() {
		super();
	}

	public NoticeDto(int ansseq, String category, String nick, String regdate, String title, String content,
			String sort, int parent, String reply) {
		super();
		this.ansseq = ansseq;
		this.category = category;
		this.nick = nick;
		this.regdate = regdate;
		this.title = title;
		this.content = content;
		this.sort = sort;
		this.parent = parent;
		this.reply = reply;
	}

	@Override
	public String toString() {
		return "NoticeDto [ansseq=" + ansseq + ", category=" + category + ", nick=" + nick + ", regdate=" + regdate
				+ ", title=" + title + ", content=" + content + ", sort=" + sort + ", parent=" + parent + ", reply="
				+ reply + "]";
	}

	public int getAnsseq() {
		return ansseq;
	}

	public void setAnsseq(int ansseq) {
		this.ansseq = ansseq;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}
	
	
	
	
}

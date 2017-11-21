package hk.lab5.rd.dtos;

public class PageDto {

	private int pageseq;
	private int diseq;
	private String regdate;
	private String nick;
	private String title;
	private String content;
	private String weather;
	private String mood;
	private String del;

	public PageDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PageDto [pageseq=" + pageseq + ", diseq=" + diseq + ", regdate=" + regdate + ", nick=" + nick
				+ ", title=" + title + ", content=" + content + ", weather=" + weather + ", mood=" + mood + ", del="
				+ del + "]";
	}

	public PageDto(int pageseq, int diseq, String regdate, String nick, String title, String content, String weather,
			String mood, String del) {
		super();
		this.pageseq = pageseq;
		this.diseq = diseq;
		this.regdate = regdate;
		this.nick = nick;
		this.title = title;
		this.content = content;
		this.weather = weather;
		this.mood = mood;
		this.del = del;
	}

	public int getPageseq() {
		return pageseq;
	}

	public void setPageseq(int pageseq) {
		this.pageseq = pageseq;
	}

	public int getDiseq() {
		return diseq;
	}

	public void setDiseq(int diseq) {
		this.diseq = diseq;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
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

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public String getDel() {
		return del;
	}

	public void setDel(String del) {
		this.del = del;
	}
	
	
}
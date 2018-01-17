public class GeneralInfo {

	private String titleName;
	private String genreName;
	private String authorName;
	private String edition;
	private int year = 0;

	GeneralInfo(String title, String genre, String author, int year) {
		titleName = title;
		genreName = genre;
		authorName = author;
		this.year = year;
	}

	public String getTitleName() {
		return titleName;
	}

	public String getGenreName() {
		return genreName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getEdition(){
		return edition;
	}

	public int getYear() {
		return year;
	}

	public void setTitleName(){
		this.titleName = titleName;
	}

	public void setAuthorName() {this.authorName = authorName;}

}

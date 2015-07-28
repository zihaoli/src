package movie;

public class Movie {
	private String name;
	private int movieCode;//电影代码
	public static final int NEW_MOVIE =1 ;//代表新电影
	public static final int CHILDEN_MOVIE=2;//代表儿童电影
	public static final int R_MOVIE =3;//代表普通电影
	public Movie() {}
	public Movie(String name) {
		this.name = name;
	}
	public void setMovieCode(int movieCode) {
		this.movieCode = movieCode;
	}
	public int getMovieCode() {
		return movieCode;
	}
	public String getName() {
		return name;
	}
	

}

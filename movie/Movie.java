package movie;

public class Movie {
	private String name;
	private int movieCode;//��Ӱ����
	public static final int NEW_MOVIE =1 ;//�����µ�Ӱ
	public static final int CHILDEN_MOVIE=2;//�����ͯ��Ӱ
	public static final int R_MOVIE =3;//������ͨ��Ӱ
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

package movie.version5;

public class Movie {
	private String name;
	private Price price;
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
	/**
	 * �����Ǯ
	 * @param totalprice�ܼ�Ǯ
	 * @param rental TODO
	 * @return
	 */
	public 	double getPrice(int days) {
			switch (this.getMovieCode()) {
			case Movie.NEW_MOVIE:
				price = new Newmovieprice();
				break;
			case Movie.CHILDEN_MOVIE:
				price = new ChildenMoviePrice();
				break;
			case Movie.R_MOVIE:
				price = new RmoviePrice();
				break;
			}
			return price.getprice(days);
		}
	/**
	 * �������
	 * @param days ��������˶�����
	 * @return ���ػ���
	 */
		int getFre(int days) {
			
		return price.getfre(days);
		}
}

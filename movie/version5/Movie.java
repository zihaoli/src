package movie.version5;

public class Movie {
	private String name;
	private Price price;
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
	/**
	 * 计算价钱
	 * @param totalprice总价钱
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
	 * 计算积分
	 * @param days 传入租借了多少天
	 * @return 返回积分
	 */
		int getFre(int days) {
			
		return price.getfre(days);
		}
}

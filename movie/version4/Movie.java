package movie.version4;

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
	/**
	 * 计算价钱
	 * @param totalprice总价钱
	 * @param rental TODO
	 * @return
	 */
		double getPrice(int days) {
			double totalprice=0;
			switch (this.getMovieCode()) {
			case Movie.NEW_MOVIE:
				totalprice += days * 3;
				break;
			case Movie.CHILDEN_MOVIE:
				
				if (days <= 3) {
					totalprice += 1.5;
				} else {
					totalprice += (days - 3) * 1.5 + 1.5;
				}
				break;
			case Movie.R_MOVIE:
				
				if (days <= 2) {
					totalprice += 2;
				} else {
					totalprice += (days- 2) *2+ 1.5;
				}
				break;
			}
			return totalprice;
		}
	/**
	 * 计算积分
	 * @param days 传入租借了多少天
	 * @return 返回积分
	 */
		int getFre(int days) {
			
			if (this.getMovieCode() == Movie.NEW_MOVIE&&days>1)
			return 2;
			return 1;
		}
}

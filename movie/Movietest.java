package movie;

public class Movietest {
	public static void main(String[] args) {
		//创建影片
		Movie m1 = new Movie("喜洋洋");
		m1.setMovieCode(Movie.CHILDEN_MOVIE);
		Movie m2 = new Movie("复仇者2");
		m2.setMovieCode(Movie.NEW_MOVIE);
		Movie m3 = new Movie("普通电影");
		m3.setMovieCode(Movie.R_MOVIE);
		
		Customer c1 = new Customer("张三");
		Rental r1 = new Rental(m1, 1);
		Rental r2 = new Rental(m2, 1);
		Rental r3 = new Rental(m3,1);
		
		c1.addRental(r1);
		c1.addRental(r2);
		c1.addRental(r3);
		c1.printMessage();
		
	}

}

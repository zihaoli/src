package movie;

public class Movietest {
	public static void main(String[] args) {
		//����ӰƬ
		Movie m1 = new Movie("ϲ����");
		m1.setMovieCode(Movie.CHILDEN_MOVIE);
		Movie m2 = new Movie("������2");
		m2.setMovieCode(Movie.NEW_MOVIE);
		Movie m3 = new Movie("��ͨ��Ӱ");
		m3.setMovieCode(Movie.R_MOVIE);
		
		Customer c1 = new Customer("����");
		Rental r1 = new Rental(m1, 1);
		Rental r2 = new Rental(m2, 1);
		Rental r3 = new Rental(m3,1);
		
		c1.addRental(r1);
		c1.addRental(r2);
		c1.addRental(r3);
		c1.printMessage();
		
	}

}

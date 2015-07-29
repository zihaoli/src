package movie.version3;



public class MyArrayListTest {

	public static void main(String[] args) {
		Movie m1 = new Movie("儿童电影");
		m1.setMovieCode(Movie.CHILDEN_MOVIE);
		Movie m2 = new Movie("好新的电影啊");
		m2.setMovieCode(Movie.NEW_MOVIE);
		Movie m3 = new Movie("普通到死的电影");
		m3.setMovieCode(Movie.R_MOVIE);
		
		Rental r1 = new Rental(m1,1);
		Rental r2 = new Rental(m2,1);
		Rental r3 = new Rental(m3,1);
		
		MyArrayList list1 = new MyArrayList();
		list1.add(m1); list1.add(m2); list1.add(m3);
		
	
		
		MyArrayList list2 = new MyArrayList();
		list2.add(r1); list2.add(r2); list2.add(r3);
		
		
		System.out.println(list2.get(2));
		
			System.out.println("=========================");
		Iterator itor = list2.iterator();
		while (!itor.isDone()) {
			Rental rr = (Rental)itor.getCurrent();
			System.out.println(rr);
			itor.next();	
		}
		System.out.println("=========================");
		
		Customer c1 = new Customer("张三");
		c1.addRental(r2); c1.addRental(r3);
		c1.addRental(r1);
		c1.printMessage();
		
		
	}

}

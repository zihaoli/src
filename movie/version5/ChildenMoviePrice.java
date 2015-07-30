package movie.version5;

public class ChildenMoviePrice extends Price {

	@Override
	public double getprice(int days) {
		// TODO Auto-generated method stub
		if (days <= 3) {
			return 1.5;
		} else {
			return (days - 3) * 1.5 + 1.5;
		}
	}
	public int getfre(int days){
		return 1;
	}

}

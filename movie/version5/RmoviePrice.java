package movie.version5;

public class RmoviePrice extends Price {

	@Override
	public double getprice(int days) {
		// TODO Auto-generated method stub
		if (days <= 2) {
			return 2;
		} else {
			return (days- 2) *2+ 1.5;
		}
	}
	public int getfre(int days){
		return 1;
	}

}

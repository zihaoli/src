package movie.version5;

public class Newmovieprice extends Price {
	public double getprice(int days) {
		return days * 3;
	}
	public int getFre(int days) {
	     if(days>1)
	    	 return 2;
	     return 1;
	}
}

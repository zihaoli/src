package movie.version5;

public class Rental {
	private Movie movie;//租了哪个电影
	private int days;
	public Rental(){}
	public Rental(Movie movie, int days) {
		super();
		this.movie = movie;
		this.days = days;  
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public String toString() {
		
		return movie.getName()+","+ "租了"+this.days+"天";
	}
}

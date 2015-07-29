package movie;

public class Customer {
	private String name;
	private Rental[] rs = new Rental[5];//容器，多个租赁
	private int index = 0;

	public Customer() {
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rs[index++] = rental;
	}

	// 打印金额，积分情况
	public void printMessage() {
		double totalprice = 0;
		//double result = 0;
		int fre = 0;
		for (int i = 0; i < index; i++) { // 小于index，因为不是rs全部放满的
			
			//Rental r = rs[i];
			switch (rs[i].getMovie().getMovieCode()) {
			case Movie.NEW_MOVIE:
				
				totalprice += rs[i].getDays() * 3;
				break;
			case Movie.CHILDEN_MOVIE:
				
				if (rs[i].getDays() <= 3) {
					totalprice += 1.5;
				} else {
					totalprice += (rs[i].getDays() - 3) * 1.5 + 1.5;
				}
				break;
			case Movie.R_MOVIE:
				
				if (rs[i].getDays() <= 2) {
					totalprice += 2;
				} else {
					totalprice += (rs[i].getDays() - 2) *2+ 1.5;
				}
				break;
			}
			
			
			//totalprice += result;
			fre++;
		
			if (rs[i].getMovie().getMovieCode() == Movie.NEW_MOVIE&&rs[i].getDays()>1)
				fre++;
			System.out.println(totalprice);
		}
		System.out.println("你所消费的金额是" + totalprice + "元");
		System.out.println("你的积分是" + fre);

	}

}

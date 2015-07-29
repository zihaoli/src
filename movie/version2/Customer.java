package movie.version2;

public class Customer {
	private String name;
	private MyArrayList list = new MyArrayList();//创建一个容器


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
		list.add(rental);
	}

	// 打印金额，积分情况
	public void printMessage() {
		double totalprice = 0;
		//double result = 0;
		int fre = 0;
		Iterator iterator = list.iterator();// 获取迭代器
		while (!iterator.isDone()) {
			Rental r = (Rental)iterator.getCurrent();
			switch (r.getMovie().getMovieCode()) {
			case Movie.NEW_MOVIE:
				totalprice += r.getDays() * 3;
				break;
			case Movie.CHILDEN_MOVIE:
				
				if (r.getDays() <= 3) {
					totalprice += 1.5;
				} else {
					totalprice += (r.getDays() - 3) * 1.5 + 1.5;
				}
				break;
			case Movie.R_MOVIE:
				
				if (r.getDays() <= 2) {
					totalprice += 2;
				} else {
					totalprice += (r.getDays() - 2) *2+ 1.5;
				}
				break;
			}
			//totalprice += result;
			fre++;
			if (r.getMovie().getMovieCode() == Movie.NEW_MOVIE&&r.getDays()>1)
				fre++;
			iterator.next();
			//System.out.println(totalprice);
		}
		
		Iterator itor = list.iterator();
		
		System.out.println("你租借的电视分别是:");
		while (!itor.isDone()) {
			Rental r = (Rental) itor.getCurrent();
			System.out.println(r);
			itor.next();
		}
		
		System.out.println(this.name+"你所消费的金额是" + totalprice + "元");
		System.out.println("你的积分是" + fre);

	}

}

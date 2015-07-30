package movie.version5;

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
		int fre = 0;
		Iterator iterator = list.iterator();// 获取迭代器
		while (!iterator.isDone()) {
			Rental r = (Rental)iterator.getCurrent();
			totalprice+= r.getMovie().getPrice(r.getDays());
			fre += r.getMovie().getFre(r.getDays());
			iterator.next();
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

package movie.version3;

public class Customer {
	private String name;
	private MyArrayList list = new MyArrayList();//����һ������


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

	// ��ӡ���������
	public void printMessage() {
		double totalprice = 0;
		//double result = 0;
		int fre = 0;
		Iterator iterator = list.iterator();// ��ȡ������
		while (!iterator.isDone()) {
			Rental r = (Rental)iterator.getCurrent();
			totalprice = getPrice(totalprice, r);
			fre = getFre(fre, r);
			iterator.next();
		}
		
		Iterator itor = list.iterator();
		
		System.out.println("�����ĵ��ӷֱ���:");
		while (!itor.isDone()) {
			Rental r = (Rental) itor.getCurrent();
			System.out.println(r);
			itor.next();
		}
		
		System.out.println(this.name+"�������ѵĽ����" + totalprice + "Ԫ");
		System.out.println("��Ļ�����" + fre);

	}
/**
 * �������
 * @param fre
 * @param r
 * @return
 */
	private int getFre(int fre, Rental r) {
		fre++;
		if (r.getMovie().getMovieCode() == Movie.NEW_MOVIE&&r.getDays()>1)
			fre++;
		return fre;
	}
/**
 * �����Ǯ
 * @param totalprice�ܼ�Ǯ
 * @param r
 * @return
 */
	private double getPrice(double totalprice, Rental r) {
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
		return totalprice;
	}

}

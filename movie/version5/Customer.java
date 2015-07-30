package movie.version5;

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
		int fre = 0;
		Iterator iterator = list.iterator();// ��ȡ������
		while (!iterator.isDone()) {
			Rental r = (Rental)iterator.getCurrent();
			totalprice+= r.getMovie().getPrice(r.getDays());
			fre += r.getMovie().getFre(r.getDays());
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

}

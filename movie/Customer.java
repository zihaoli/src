package movie;

public class Customer {
	private String name;
	private Rental[] rs = new Rental[5];//�������������
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

	// ��ӡ���������
	public void printMessage() {
		double totalprice = 0;
		//double result = 0;
		int fre = 0;
		for (int i = 0; i < index; i++) { // С��index����Ϊ����rsȫ��������
			
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
		System.out.println("�������ѵĽ����" + totalprice + "Ԫ");
		System.out.println("��Ļ�����" + fre);

	}

}

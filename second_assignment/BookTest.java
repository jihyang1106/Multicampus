
public class BookTest {
	public static void main(String[] args) {

		Book b = new Book(1, "�ڹ� ���α׷���", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�");
		Book b1 = new Book(2, "�ڹٽ�ũ��Ʈ", "�̸���", 30000, 2020, "�������ǻ�");
		Book b2 = new Book(3, "HTML/CSS", "������", 18000, 2021, "�������ǻ�");

		System.out.println("������ȣ" + "\t" + "������" + "\t\t" + "����" + "\t" + "����" + "\t" + "������" + "\t" + "���ǻ�");
		System.out.println("--------------------------------------------------------");

		System.out.println("B" + b.toString());
		System.out.println("B" + b1.toString());
		System.out.println("B" + b2.toString());
		System.out.println();

		System.out.println(
				"������ȣ" + "\t" + "������" + "\t" + "������" + "\t" + "����" + "\t" + "���࿬��" + "\t" + "���ǻ�" + "\t" + "�����");
		System.out.println("--------------------------------------------------------");

		Magazine m = new Magazine(1, "�ڹ� ����", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�", 5);
		Magazine m1 = new Magazine(2, "�� ����", "�̸���", 30000, 2020, "�������ǻ�", 7);
		Magazine m2 = new Magazine(3, "���� ����", "������", 18000, 2021, "�������ǻ�", 9);

		System.out.println("M" + m.toString());
		System.out.println("M" + m1.toString());
		System.out.println("M" + m2.toString());
		System.out.println();

	}
}

class Book { // ���� ������ ������ Book Ŭ���� ����
	int bookNo = 0;
	String bookTitle = "";
	String bookAuthor = "";
	int bookYear = 0;
	int bookPrice = 0;
	String bookPublisher = "";

	Book() { // �Ű����� ���� ������(Magazine�ڼ�Ŭ������ ���ؼ�)
	}

	// �Ű������� �ִ� ������
	Book(int num, String title, String author, int year, int price, String publisher) { // �Ű����� �ִ� ������
		this.bookNo = num;
		this.bookTitle = title;
		this.bookAuthor = author;
		this.bookYear = year;
		this.bookPrice = price;
		this.bookPublisher = publisher;
	}

	@Override // ����������� ���� toString()
	public String toString() {
		return "00" + bookNo + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookYear + "\t" + bookPrice + "\t"
				+ bookPublisher;
	}
}

class Magazine extends Book { // BookŬ������ ��ӹ޴� Magazine Ŭ����
	int month; // ��� ����

	// �Ű������� �ִ� ������
	Magazine(int num, String title, String author, int year, int price, String publisher, int month) {
		super(num, title, author, year, price, publisher);
		this.month = month;
	}

	@Override // ����������� ���� toString()
	public String toString() {
		return super.toString() + "\t  " + month;

	}

}

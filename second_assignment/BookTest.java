
public class BookTest {
	public static void main(String[] args) {

		Book b = new Book(1, "자바 프로그래밍", "홍길동", 25000, 2021, "멀티출판사");
		Book b1 = new Book(2, "자바스크립트", "이몽룡", 30000, 2020, "서울출판사");
		Book b2 = new Book(3, "HTML/CSS", "성춘향", 18000, 2021, "강남출판사");

		System.out.println("도서번호" + "\t" + "도서명" + "\t\t" + "저자" + "\t" + "가격" + "\t" + "발행일" + "\t" + "출판사");
		System.out.println("--------------------------------------------------------");

		System.out.println("B" + b.toString());
		System.out.println("B" + b1.toString());
		System.out.println("B" + b2.toString());
		System.out.println();

		System.out.println(
				"잡지번호" + "\t" + "잡지명" + "\t" + "발행인" + "\t" + "가격" + "\t" + "발행연도" + "\t" + "출판사" + "\t" + "발행월");
		System.out.println("--------------------------------------------------------");

		Magazine m = new Magazine(1, "자바 월드", "홍길동", 25000, 2021, "멀티출판사", 5);
		Magazine m1 = new Magazine(2, "웹 월드", "이몽룡", 30000, 2020, "서울출판사", 7);
		Magazine m2 = new Magazine(3, "게임 월드", "성춘향", 18000, 2021, "강남출판사", 9);

		System.out.println("M" + m.toString());
		System.out.println("M" + m1.toString());
		System.out.println("M" + m2.toString());
		System.out.println();

	}
}

class Book { // 도서 정보를 저장할 Book 클래스 생성
	int bookNo = 0;
	String bookTitle = "";
	String bookAuthor = "";
	int bookYear = 0;
	int bookPrice = 0;
	String bookPublisher = "";

	Book() { // 매개변수 없는 생성자(Magazine자손클래스를 위해서)
	}

	// 매개변수가 있는 생성자
	Book(int num, String title, String author, int year, int price, String publisher) { // 매개변수 있는 생성자
		this.bookNo = num;
		this.bookTitle = title;
		this.bookAuthor = author;
		this.bookYear = year;
		this.bookPrice = price;
		this.bookPublisher = publisher;
	}

	@Override // 데이터출력을 위한 toString()
	public String toString() {
		return "00" + bookNo + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookYear + "\t" + bookPrice + "\t"
				+ bookPublisher;
	}
}

class Magazine extends Book { // Book클래스를 상속받는 Magazine 클래스
	int month; // 멤버 변수

	// 매개변수가 있는 생성자
	Magazine(int num, String title, String author, int year, int price, String publisher, int month) {
		super(num, title, author, year, price, publisher);
		this.month = month;
	}

	@Override // 데이터출력을 위한 toString()
	public String toString() {
		return super.toString() + "\t  " + month;

	}

}

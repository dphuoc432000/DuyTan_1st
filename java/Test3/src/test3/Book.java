package test3;

public class Book {
	public String title, author;
	public int page;
	public double price;
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Book(String title, String author, int page, double price) {
		this.title = title;
		this.author = author;
		this.page = page;
		this.price = price;
	}
	public Book() {
	}
	public double updatePrice(double rate){
		System.out.println("How much discount? ");
		price = price - (price * rate);
		return rate;
	}
	public String toString()
	{
		return "Book{tile = " + title + ",author= " + author + ",pages= " + page + ",price= " +
				price + "}";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book t1 = new Book();
		t1.title = "Think fast think slow";
		t1.author = "Daniel";
		t1.page = 613;
		t1.price = 239000;
		System.out.println("Please input thee title of book: \n" + t1.title);
		System.out.println("book's author: \n" + t1.author);
		System.out.println("book's total pages: \n" + t1.page);
		System.out.println("book's price: \n" + t1.price);
		System.out.println("The book's information: "+ t1.toString());
		System.out.println(t1.updatePrice(0.1));
		System.out.println("After update price, the book's information: " + t1.toString());
	}

}

package usingConstructor;

public class Book{
	private String title;
	private String author;
	private int pageCount;
	private  float price;
	
	// constructor overloading
	public Book() {
		// no argument Constructor
		title="wings";
		author="am";
		pageCount=50;
		price=103.2f;
	}
	
	
//	public Book(String mytitle,String myauthor,int mypageCount,float myPrice) {
//		title=mytitle;
//		author=myauthor;
//		pageCount=mypageCount;
//		price=myPrice;
//		
//	}
		
	public Book(String title, String author, int pageCount, float price) {

		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
		this.price = price;
	}


	public Book(float price,String author, int pageCount, String title ) {
	
		this.author = author;
		this.pageCount = pageCount;
		this.title = title;
		this.price = price;
	}
	public Book(float price,String author ) {
		
		this.author = author;
		this.price = price;
	}


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
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

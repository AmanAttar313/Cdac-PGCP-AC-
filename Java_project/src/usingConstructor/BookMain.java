package usingConstructor;

public class BookMain {
	public static void main(String[] args) {
		Book b=new Book();
		Book bk=new Book("good days bad days","aman",10,22.5f);
		Book bk2=new Book(102.f,"abc",10,"don");
		Book bk3=new Book(455,"aq");
		b.setTitle("pagal aqsa");
		b.setPrice(1000.45f);
		b.setAuthor("aman");
		b.setPageCount(711);
		
		System.out.println("Title : "+b.getTitle());
		System.out.println("Price : "+b.getPrice());
		System.out.println("Author : "+b.getAuthor());
		System.out.println("Page Count : "+b.getPageCount());
		
		System.out.println(bk3);
		
		
		
	}
}
 
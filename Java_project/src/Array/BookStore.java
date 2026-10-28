package Array;

public class BookStore {
	private static Book[] allBooks=new Book[4];
	static{
		Book firstBook=new Book();
		allBooks[0]=firstBook;
		allBooks[1]=new Book("Go corona go","AMAN",252,200.35f);
		allBooks[2]=new Book(2005.35f,"don",562,"heaven");
		allBooks[3]=new Book(2005.35f,"queen",562,"king");
	}
	public static Book getFirstBook() {
		return allBooks[0];
	}
	public static Book getLastBook() {
		int size=allBooks.length;
		int lastIndex=size-1;
		return allBooks[lastIndex];
	}
	
	public static Book getBookAt(int index) {
		int size=allBooks.length;
		int lastIndex=size-1;
		if(index<0 || index>lastIndex) {
			return null;
			
		}
		return allBooks[index];
		
	}
}
package Array;

public class BookStoreMain {
	public static void main(String[] args) {
		Book bookFirst=BookStore.getFirstBook();
		System.out.println("First Book : "+bookFirst.getTitle());
		
		Book bookLast=BookStore.getLastBook();
		System.out.println("Last Book : "+bookLast.getTitle());
		
		Book currentBook=BookStore.getBookAt(2);
		if(currentBook !=null) {
			System.out.println(currentBook.getTitle());
		}else {
			System.out.println("unable to find book at given position");
		}
	}
}

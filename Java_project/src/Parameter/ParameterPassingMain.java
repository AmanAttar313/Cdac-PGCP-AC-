package Parameter;

public class ParameterPassingMain {
	private static void changeIndex(int idx) {
		idx=10;
	}

	public static void changeBookTItle(Book currentBook) {
		currentBook.setTitle("Rainy days");
	}
	public static void main(String[] args) {
		int index=7;
		
		System.out.println("index before change : "+index);
		changeIndex(index);
		System.out.println("index before change : "+index);
		
		//====================================================
		System.out.println("//====================================================");
		
		Book myBook=new Book();
		System.out.println("Book title before chnage : "+myBook.getTitle());
		changeBookTItle(myBook);
		System.out.println("Book title before chnage : "+myBook.getTitle());
		

	}

}

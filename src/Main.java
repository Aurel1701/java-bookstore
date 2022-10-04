
public class Main {

	public static void main(String[] args) {
		String isbn = "2736491872634";
		String title = "La ragazza della neve";
		String author = "Tullia Raspini ";
		float price = 15.99f;
		boolean availability = true;
		int disponibility = 44;
		String language = "ita";
		
		String book = title + " " + "di" + " " +  author;
		System.out.println(book);
		float sale = price / 100 * 20;
		System.out.println(sale);
		System.out.println(price - sale);
	}

}

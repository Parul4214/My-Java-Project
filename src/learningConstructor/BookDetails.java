//A user goes to library to borrow books. The library has 10 books.  
//The user can borrow max 3 books. 
//Ensure same book is not issued twice.

package learningConstructor;

public class BookDetails {
	// Class level variables has been declared for class BookDetails

	String bookName;
	String authorName;
	boolean isBookIssued;

	// parameterized constructor

	public BookDetails(String nameOfBook, String nameOfAuthor) {

		bookName = nameOfBook;
		authorName = nameOfAuthor;

	}
}

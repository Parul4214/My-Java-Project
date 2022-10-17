//A user goes to library to borrow books. The library has 10 books.  
//The user can borrow max 3 books. 
//Ensure same book is not issued twice.

package learningConstructor;

import java.util.Scanner;

public class BookLibraryMain {

	public static void main(String[] args) {

		BookDetails romeoAndJuliet = new BookDetails("Romeo and Juliet", "Shakespere");
		BookDetails peaceOfMind = new BookDetails("Peace of Mind", "Allen");
		BookDetails homeBody = new BookDetails("Home Body", "Rupi Kaur");
		BookDetails twoStates = new BookDetails("Two States", "Chetan Bhagat");
		BookDetails halfGirlfriend = new BookDetails("Half Girlfriend", "Chetan Bhagat");
		BookDetails oliverTwist = new BookDetails("Oliver Twist", "Charles Dickens");
		BookDetails macbeth = new BookDetails("Macbeth", "Shakespere");
		BookDetails harrypotter1 = new BookDetails("Harry Potter and the Sorcere's Stone", "J K Rowling");
		BookDetails malgudyDays = new BookDetails("Malgudy Days", "R K Narayan");
		BookDetails alchemist = new BookDetails("Alchemist", "Paulo Coehlo");

		// Array of Objects
		BookDetails[] bookDetails = { romeoAndJuliet, peaceOfMind, homeBody, twoStates, halfGirlfriend, oliverTwist,
				macbeth, harrypotter1, malgudyDays, alchemist };
		Scanner sc = new Scanner(System.in);
		int bookCount = 0;
		do {

			System.out.println("Which book do you want to be issued");
			String requiredBookName = sc.nextLine();

			System.out.println("Who is the author");
			String bookAuthor = sc.nextLine();

			// iterating over the array
			for (int i = 0; i < bookDetails.length; i++) {
				if (requiredBookName.equalsIgnoreCase(bookDetails[i].bookName)
						&& bookAuthor.equalsIgnoreCase(bookDetails[i].authorName) && !bookDetails[i].isBookIssued) {
					bookDetails[i].isBookIssued = true;
					System.out.println(bookDetails[i].bookName + " is issued");
					bookCount++;

					System.out.println("\nBooks issued :" + bookCount);
					System.out.println((3 - bookCount) + " more books can be issued\n");

					break;
				} else if (requiredBookName.equalsIgnoreCase(bookDetails[i].bookName)
						&& bookAuthor.equalsIgnoreCase(bookDetails[i].authorName) && (bookDetails[i].isBookIssued)) {

					System.out.println("This Book is already issued");
					break;

				} else if ((!(requiredBookName.equals(bookDetails[i].bookName))
						|| !(bookAuthor.equals(bookDetails[i].authorName))) && i + 1 == bookDetails.length) {
					System.out.println("Sorry, this book is not available");
				}

			}

		} while (bookCount < 3);

	}

}

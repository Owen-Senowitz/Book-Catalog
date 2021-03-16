package assg3_senowitzo19;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * @author Owen - Senowitz
 * class that demos the book class and BookNotFoundException
 */
public class BookDemo {
	static Book books[];
	static int size;
	/**
	 * loads the file and puts each each book into there respected book ids
	 * @param filename
	 */
	public static void loadFile(String filename) {
		/**
		 * creates a scanner that reads the file
		 * while the file is open we are splitting the each line up and then within each line we are saving the bookId, title, isbn, author, and genre
		 */
		try {
			Scanner reader = new Scanner(new File(filename));

			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				String split[] = line.split("\\s+");
				books[size++] = new Book(Integer.valueOf(split[0]), split[1], split[2], split[3], split[4].charAt(0));
			}
			// closes the reader
			reader.close();
		}
		/**
		 * if the file is not found then we print a error message and exit the program
		 */
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	/**
	 * runs the demo portion of the program with the outputs and errors for book not found
	 * @param args
	 */
	public static void main(String[] args) {
		// creates a new array with 50 books
		books = new Book[50];
		// sets the size to 0
		size = 0;
		// the string of the filename that we are reading the books from
		String filename = "catalog.txt";
		// runs the loadFile method with the filename
		loadFile(filename);
		// creates a new book id object
		int bookId;
		// creates a scanner that receives the input from the user
		Scanner input = new Scanner(System.in);
		/**
		 * Asks the user what book id they would like to print
		 */
		while (true) {
			System.out.print("\nEnter book ID: ");
			bookId = input.nextInt();
			if(bookId == 0) {
				System.exit(0);
			}
			/**
			 * try to retrieve the book with the entered id
			 */
			try {
				int index = Book.bookSearch(books, size, bookId);
				System.out.println(books[index]);
			}
			/**
			 * if the book id does not equal a book in the catalog.txt then we print the BookNotFoundException
			 */
			catch (BookNotFoundException e) {
				System.out.println(e.getMessage());
			}
			input.close();
		}
	}
}


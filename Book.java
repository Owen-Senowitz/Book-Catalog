package assg3_senowitzo19;

/**
 * @author Owen - Senowitz
 * class that has all the methods for printing, constructing and book searching
 */
public class Book {
	/**
	 * initializes all the variables
	 */
	private int bookId;
	private String title;
	private String isbn;
	private String author;
	private char genre;
	/**
	 * creates the structure for the book object
	 * @param bookId
	 * @param title
	 * @param isbn
	 * @param author
	 * @param genre
	 */
	public Book(int bookId, String title, String isbn, String author, char genre) {
		this.bookId = bookId;
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.genre = genre;
	}
	/**
	 * gets the bookId
	 * @return bookId
	 */
	public int getBookId() {
		return bookId;
	}
	/**
	 * sets the bookId
	 * @param bookId
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * gets the title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * sets the title
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * gets the isbn
	 * @return isbn
	 */
	public String getISBN() {
		return isbn;
	}
	/**
	 * sets the isbn
	 * @param isbn
	 */
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * gets the author
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * sets the author
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * gets the genre
	 * @return genre
	 */
	public char getGenre() {
		return genre;
	}
	/**
	 * sets the genre
	 * @param genre
	 */
	public void setGenre(char genre) {
		this.genre = genre;
	}
	/**
	 * shows the output for each book when its bookId is inputed
	 */
	@Override
	public String toString() {
		String print = "Book id: " + bookId + ", Title: " + title + ", ISBN: " + isbn + ", Author: " + author + ", ";
		if (genre == 'F') {
			print += "Fiction";
		}
		else if (genre == 'N') {
			print += "Non-fiction";
		}
		return print;
	}
	/**
	 * searches for the correct book with the bookId
	 * if the book is not found then we throw the BookNotFoundException
	 * @param books
	 * @param size
	 * @param bookId
	 * @return i the number of which book to output
	 */
	public static int bookSearch(Book books[], int size, int bookId) {
		for (int i = 0; i < size; i++) {
			if (books[i].getBookId() == bookId) {
				return i;
			}
		}
		throw new BookNotFoundException("No such book.");
	}
}

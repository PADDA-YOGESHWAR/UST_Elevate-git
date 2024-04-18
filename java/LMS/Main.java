import java.io.*; 
import java.util.*; 
 
class Book implements Serializable { 
    private String ISBN; 
    private String title; 
    private String author; 
    private double price; 
    private boolean availability; 
    private String genre; 
 
    public Book(String ISBN, String title, String author, double price, boolean 
availability, String genre) { 
        this.ISBN = ISBN; 
        this.title = title; 
        this.author = author; 
        this.price = price; 
        this.availability = availability; 
        this.genre = genre; 
    } 
 
    // Getters and Setters 
    public String getISBN() { 
        return ISBN; 
    } 
 
    public String getTitle() { 
        return title; 
    } 
 
    public String getAuthor() { 
        return author; 
    } 
 
    public double getPrice() { 
        return price; 
    } 
 
    public boolean isAvailable() { 
        return availability; 
    } 
 
    public void setAvailability(boolean availability) { 
        this.availability = availability; 
    } 
 
    public String getGenre() { 
        return genre; 
    } 
 
    // toString method 
    @Override 
    public String toString() { 
        return "Book{" + 
                "ISBN='" + ISBN + '\'' + 
                ", title='" + title + '\'' + 
                ", author='" + author + '\'' + 
                ", price=" + price + 
                ", availability=" + availability + 
                ", genre='" + genre + '\'' + 
                '}'; 
    } 
} 
 
class Library implements Serializable { 
    private List<Book> books; 
    private String name; 
    private String address; 
 
    public Library(String name, String address) { 
        this.books = new ArrayList<>(); 
        this.name = name; 
        this.address = address; 
    } 
 
    // Getters and Setters 
    public String getName() { 
        return name; 
    } 
 
    public String getAddress() { 
        return address; 
    } 
 
    // Methods 
    public void addBook(Book book) { 
        books.add(book); 
    } 
 
    public void removeBook(String ISBN) throws BookNotFoundException { 
        boolean removed = false; 
        for (Iterator<Book> iterator = books.iterator(); iterator.hasNext(); ) { 
            Book book = iterator.next(); 
            if (book.getISBN().equals(ISBN)) { 
                iterator.remove(); 
                removed = true; 
                break; 
            } 
        } 
        if (!removed) { 
            throw new BookNotFoundException("Book with ISBN " + ISBN + " not found."); 
        } 
    } 
 
    public List<Book> searchByAuthor(String author) { 
        List<Book> result = new ArrayList<>(); 
        for (Book book : books) { 
            if (book.getAuthor().equalsIgnoreCase(author)) { 
                result.add(book); 
            } 
        } 
        return result; 
    } 
 
    public List<Book> searchByGenre(String genre) { 
        List<Book> result = new ArrayList<>(); 
        for (Book book : books) { 
            if (book.getGenre().equalsIgnoreCase(genre)) { 
                result.add(book); 
            } 
        } 
        return result; 
    } 
 
    public void displayAvailableBooks() { 
        System.out.println("Available Books:"); 
        for (Book book : books) { 
            if (book.isAvailable()) { 
                System.out.println(book); 
            } 
        } 
    } 
 
    public void borrowBook(String ISBN) throws BookNotFoundException, 
NotEnoughBooksException { 
        Book bookToBorrow = null; 
        for (Book book : books) { 
            if (book.getISBN().equals(ISBN)) { 
                bookToBorrow = book; 
                break; 
            } 
        } 
        if (bookToBorrow == null) { 
            throw new BookNotFoundException("Book with ISBN " + ISBN + " not found."); 
        } 
        if (!bookToBorrow.isAvailable()) { 
            throw new NotEnoughBooksException("Book " + bookToBorrow.getTitle() + " is not available for borrowing."); 
        } 
        bookToBorrow.setAvailability(false); 
    } 
 
    public void returnBook(String ISBN) throws BookNotFoundException { 
        Book bookToReturn = null; 
        for (Book book : books) { 
            if (book.getISBN().equals(ISBN)) { 
                bookToReturn = book; 
                break; 
            } 
        } 
        if (bookToReturn == null) { 
            throw new BookNotFoundException("Book with ISBN " + ISBN + " not found."); 
        } 
        bookToReturn.setAvailability(true); 
    } 
 
    public List<Book> getBooks() { 
        return books; 
    } 
} 
 
class Member implements Serializable { 
    private String memberID; 
    private String name; 
    private List<Book> borrowedBooks; 
 
    public Member(String memberID, String name) { 
        this.memberID = memberID; 
        this.name = name; 
        this.borrowedBooks = new ArrayList<>(); 
    } 
 
    // Getters and Setters 
    public String getMemberID() { 
        return memberID; 
    } 
 
    public String getName() { 
        return name; 
    } 
 
    public List<Book> getBorrowedBooks() { 
        return borrowedBooks; 
    } 
 
    // Methods 
    public void borrowBook(Book book) { 
        borrowedBooks.add(book); 
    } 
 
    public void returnBook(Book book) { 
        borrowedBooks.remove(book); 
    } 
 
    public void displayBorrowedBooks() { 
        System.out.println("Borrowed Books by " + name + ":"); 
        for (Book book : borrowedBooks) { 
            System.out.println(book); 
        } 
    } 
} 
 
class SerializationHandler { 
    public void serializeLibrary(Library library, String fileName) { 
        try (ObjectOutputStream oos = new ObjectOutputStream(new 
FileOutputStream(fileName))) { 
            oos.writeObject(library); 
            System.out.println("Library serialized successfully."); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
 
    public Library deserializeLibrary(String fileName) { 
        Library library = null; 
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) 
{ 
            library = (Library) ois.readObject(); 
            System.out.println("Library deserialized successfully."); 
        } catch (IOException | ClassNotFoundException e) { 
            e.printStackTrace(); 
        } 
        return library; 
    } 
} 
 
class BookNotFoundException extends Exception { 
    public BookNotFoundException(String message) { 
        super(message); 
    } 
} 
 
class NotEnoughBooksException extends Exception { 
    public NotEnoughBooksException(String message) { 
        super(message); 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        Library library = new Library("My Library", "123 Main St, City"); 
        SerializationHandler handler = new SerializationHandler(); 
 
        while (true) { 
            System.out.println("\n1. Add Book"); 
            System.out.println("2. Remove Book"); 
            System.out.println("3. Search By Author"); 
            System.out.println("4. Search By Genre"); 
            System.out.println("5. Display Available Books"); 
            System.out.println("6. Borrow Book"); 
            System.out.println("7. Return Book"); 
            System.out.println("8. Serialize Library"); 
            System.out.println("9. Deserialize Library"); 
            System.out.println("10. Exit"); 
            System.out.print("Enter your choice: "); 
            int choice = scanner.nextInt(); 
            scanner.nextLine(); // Consume newline character 
 
            switch (choice) { 
                case 1: 
                    // Add Book 
                    System.out.print("Enter ISBN: "); 
                    String isbn = scanner.nextLine(); 
                    System.out.print("Enter title: "); 
                    String title = scanner.nextLine(); 
                    System.out.print("Enter author: "); 
                    String author = scanner.nextLine(); 
                    System.out.print("Enter price: "); 
                    double price = scanner.nextDouble(); 
                    scanner.nextLine(); // Consume newline character 
                    System.out.print("Enter genre: "); 
                    String genre = scanner.nextLine(); 
                    Book newBook = new Book(isbn, title, author, price, true, genre); 
                    library.addBook(newBook); 
                    break; 
                case 2: 
                    // Remove Book 
                    System.out.print("Enter ISBN of book to remove: "); 
                    String isbnToRemove = scanner.nextLine(); 
                    try { 
                        library.removeBook(isbnToRemove); 
                        System.out.println("Book with ISBN " + isbnToRemove + " removed successfully."); 
                    } catch (BookNotFoundException e) { 
                        System.out.println(e.getMessage()); 
                    } 
                    break; 
                case 3: 
                    // Search By Author 
                    System.out.print("Enter author name to search: "); 
                    String authorToSearch = scanner.nextLine(); 
                    List<Book> booksByAuthor = library.searchByAuthor(authorToSearch); 
                    if (booksByAuthor.isEmpty()) { 
                        System.out.println("No books found by author " + authorToSearch); 
                    } else { 
                        System.out.println("Books by author " + authorToSearch + ":"); 
                        for (Book book : booksByAuthor) { 
                            System.out.println(book); 
                        } 
                    } 
                    break; 
                case 4: 
                    // Search By Genre 
                    System.out.print("Enter genre to search: "); 
                    String genreToSearch = scanner.nextLine(); 
                    List<Book> booksByGenre = library.searchByGenre(genreToSearch); 
                    if (booksByGenre.isEmpty()) { 
                        System.out.println("No books found in genre " + genreToSearch); 
                    } else { 
                        System.out.println("Books in genre " + genreToSearch + ":"); 
                        for (Book book : booksByGenre) { 
                            System.out.println(book); 
                        } 
                    } 
                    break; 
                case 5: 
                    // Display Available Books 
                    library.displayAvailableBooks(); 
                    break; 
                case 6: 
                    // Borrow Book 
                    System.out.print("Enter ISBN of book to borrow: "); 
                    String isbnToBorrow = scanner.nextLine(); 
                    try { 
                        library.borrowBook(isbnToBorrow); 
                        System.out.println("Book with ISBN " + isbnToBorrow + " borrowed successfully."); 
                    } catch (BookNotFoundException | NotEnoughBooksException e) { 
                        System.out.println(e.getMessage()); 
                    } 
                    break; 
                case 7: 
                    // Return Book 
                    System.out.print("Enter ISBN of book to return: "); 
                    String isbnToReturn = scanner.nextLine(); 
                    try { 
                        library.returnBook(isbnToReturn); 
                        System.out.println("Book with ISBN " + isbnToReturn + " returned successfully."); 
                    } catch (BookNotFoundException e) { 
                        System.out.println(e.getMessage()); 
                    } 
                    break; 
                case 8: 
                    // Serialize Library 
                    System.out.print("Enter filename to save library: "); 
                    String filenameSerialize = scanner.nextLine(); 
                    handler.serializeLibrary(library, filenameSerialize); 
                    break; 
                case 9: 
                    // Deserialize Library 
                    System.out.print("Enter filename to load library: "); 
                    String filenameDeserialize = scanner.nextLine(); 
                    library = handler.deserializeLibrary(filenameDeserialize); 
                    break; 
                case 10: 
                    System.out.println("Exiting..."); 
                    System.exit(0); 
                default: 
                    System.out.println("Invalid choice. Please enter a number between 1 and 10."); 
            } 
        } 
    } 
} 
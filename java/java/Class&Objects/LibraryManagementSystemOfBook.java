 class Book {
    private int id;
    private String name;
    private double price;
    private String author;

    public Book(int id, String name, double price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void showBookDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", Author: " + author);
    }
}


 class Library {
    private Book[] books = new Book[10];
    private int count = 0;

    // Add new books (varargs)
    public void addNewBooks(Book... newBooks) {
        for (Book b : newBooks) {
            if (count >= books.length) {
                System.out.println("Library is full. Cannot add more books.");
                return;
            }
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (books[i].getId() == b.getId()) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                books[count++] = b;
            } else {
                System.out.println("Duplicate Book ID " + b.getId() + " not allowed.");
            }
        }
    }

    // Show all books
    public void showBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }
        for (int i = 0; i < count; i++) {
            books[i].showBookDetails();
        }
    }

    // Get book by ID
    public Book getBookByName(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                return books[i];
            }
        }
        return null;
    }

    // Sort and return books by price
    public Book[] getBookSortedByPrice() {
        Book[] sorted = new Book[count];
        for (int i = 0; i < count; i++) {
            sorted[i] = books[i];
        }
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i].getPrice() > sorted[j].getPrice()) {
                    Book temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

    // Delete book by ID and shift array
    public Book deleteBookById(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                Book deletedBook = books[i];
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--count] = null;
                return deletedBook;
            }
        }
        return null;
    }

    // Find books with same price
    public Book[] findBooksByPrice() {
        int matchCount = 0;
        Book[] matches = new Book[count];
        for (int i = 0; i < count; i++) {
            double priceToMatch = books[i].getPrice();
            int priceMatches = 0;
            for (int j = 0; j < count; j++) {
                if (i != j && books[j].getPrice() == priceToMatch) {
                    priceMatches++;
                }
            }
            if (priceMatches > 0) {
                boolean alreadyAdded = false;
                for (int k = 0; k < matchCount; k++) {
                    if (matches[k].getId() == books[i].getId()) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) {
                    matches[matchCount++] = books[i];
                }
            }
        }

        Book[] result = new Book[matchCount];
        for (int i = 0; i < matchCount; i++) {
            result[i] = matches[i];
        }
        return result;
    }
 }

public class LibraryManagementSystemOfBook{
	public static void main(String[] args){

        Library lib = new Library();

        Book b1 = new Book(1, "harry potter", 500, "j.k. Rowlling");
        Book b2 = new Book(2, "the Hobbit", 700, "patric");
        Book b3 = new Book(3, "C++ Guide", 500, "john doe");
        Book b4 = new Book(4, "DSA", 900, "my me");

        // Add books
        lib.addNewBooks(b1, b2, b3, b4);

        // Show all books
        System.out.println("All Books:");
        lib.showBooks();

        // Get book by ID
        System.out.println("\nGet Book by ID 2:");
        Book result = lib.getBookByName(2);
        if (result != null)
            result.showBookDetails();
        else
            System.out.println("Book not found.");

        // Sorted books by price
        System.out.println("\nBooks Sorted by Price:");
        Book[] sorted = lib.getBookSortedByPrice();
        for (Book b : sorted)
            b.showBookDetails();

        // Delete book by ID
        System.out.println("\nDeleting Book with ID 3:");
        Book deleted = lib.deleteBookById(3);
        if (deleted != null)
            deleted.showBookDetails();
        else
            System.out.println("Book not found to delete.");

        // Show after deletion
        System.out.println("\nBooks After Deletion:");
        lib.showBooks();

        // Find books with same price
        System.out.println("\nBooks with Same Price:");
        Book[] samePriceBooks = lib.findBooksByPrice();
        for (Book b : samePriceBooks)
            b.showBookDetails();
    


	}
}
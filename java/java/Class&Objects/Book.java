import.until.java;
pulic class Book{
    static int totalNoOfBooks; // Static variable to track total number of books
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    // Static block to initialize the static variable
    static {
        totalNoOfBooks = 0;
    }

    // Instance initialization block
    {
        totalNoOfBooks++;
    }

    // Constructor with all parameters
    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // Default value
    }

    // Constructor with only ISBN (other values default to "Unknown")
    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    // Static method to get the total number of books
    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    // Method to borrow a book
    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed.");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book!");
        }
    }

    // Method to return a book
    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed it! Please leave a review.");
        } else {
            System.out.println("This book is already in the library.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Book designOfThings = new Books("1", "Design", "Author");
        Book myBook = new Book("2");

        System.out.println("Total number of books: " + Books.getTotalNoOfBooks());

        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();

        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}

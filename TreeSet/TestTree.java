import java.util.*;

public class TestTree { 
    public static void main(String[] args) {
        new TestTree().go();
    }

    /**
     * Create three new Book objects and add them to a TreeSet
     */
    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("What is The What");
        Book b3 = new Book("The Other Book");        

        TreeSet<Book> tree = new TreeSet<Book>(); // TreeSet elements must be Comparable
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book implements Comparable {
    String title;
    // constructor
    public Book(String t) {
        title = t;
    }

    // @Override
    public int compareTo(Object b) {
        Book book = (Book) b; // cast compared-to object to type Book
        return (title.compareTo(book.title));
    }
}
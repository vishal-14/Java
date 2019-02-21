//1. Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
import java.util.*;

interface  Person {
    void getPerson();
}
class Librarian implements Person {
    String librarianName;
    int librarianID;

    Librarian(String name, int id) {
        this.librarianName = name;
        this.librarianID = id;
    }

    // Interface method definition
    public void getPerson() {
        System.out.println("Name: " + librarianName);
        System.out.println("ID: " + librarianID);
    }
}
class Member implements Person {
    String memberName;
    int memberID;

    Member(String name, int id) {
        memberName = name;
        memberID = id;
    }

    // Interface method definition
    public void getPerson() {
        System.out.println("Name: " + memberName);
        System.out.println("ID: " + memberID);
    }

}
class Book {
    String bookName;
    String bookAuthor;
    float bookPrice;

    Book(String name, String author, float price) {
        bookName = name;
        bookAuthor = author;
        bookPrice = price;
    }

    void getBookDetails() {
        System.out.println("Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: " + bookPrice);
    }
}

class Library {
    private String libraryLocation;
    private ArrayList<Book> booksInLibrary;
    private ArrayList<Member> membersOfLibrary;
    private Librarian librarian;

    public String getLibraryLocation() {
        return libraryLocation;
    }

    public void setLibraryLocation(String libraryLocation) {
        this.libraryLocation = libraryLocation;
    }

    public ArrayList<Book> getBooksInLibrary() {
        return booksInLibrary;
    }

    public void setBooksInLibrary(ArrayList<Book> booksInLibrary) {
        this.booksInLibrary = booksInLibrary;
    }

    public ArrayList<Member> getMembersOfLibrary() {
        return membersOfLibrary;
    }

    public void setMembersOfLibrary(ArrayList<Member> membersOfLibrary) {
        this.membersOfLibrary = membersOfLibrary;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    void getLibraryDetails() {
        System.out.println("Details of LIBRARY");
        System.out.println("Location: " + libraryLocation);
        System.out.println("Libranian:");
        librarian.getPerson();
        System.out.println("Members:");
        for (Member m : membersOfLibrary)
            m.getPerson();
        System.out.println("Books:");
        for (Book b : booksInLibrary)
            b.getBookDetails();
    }
}



public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.setLibraryLocation("Greater Noida");
        Book b1 = new Book("Head First Java", "X", 100.0f);
        Book b3 = new Book("Head First Design Patterns", "Y", 200.0f);
        Book b2 = new Book("Head First HTML5 Programming", "Z", 300.0f);
        Book b4 = new Book("Head First HTML & CSS", "T", 400.0f);
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        lib.setBooksInLibrary(bookList);
        Librarian librarian = new Librarian("Vishal", 1001);
        lib.setLibrarian(librarian);
        Member m1 = new Member("Nik", 100);
        Member m2 = new Member("Rob", 101);
        Member m3 = new Member("Ali", 102);
        ArrayList<Member> memberList = new ArrayList<>();
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);
        lib.setMembersOfLibrary(memberList);
        lib.getLibraryDetails();
    }
}

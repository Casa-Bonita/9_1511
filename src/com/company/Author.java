package com.company;
import java.util.ArrayList;

public class Author {
    private String authorName;
    private String authorSurname;
    private int birth;
    private ArrayList<String> listBooks;
    private String inputBook;

    public Author(String name, String surname, int birth, ArrayList<String> listBooks) {
        this.authorName = name;
        this.authorSurname = surname;
        this.birth = birth;
        this.listBooks = listBooks;
    }

    public String getName() {
        return authorName;
    }

    public String getSurname() {
        return authorSurname;
    }

    public int getBirth() {
        return birth;
    }

    public String getBook(int index) {
        return listBooks.get(index);
    }

    public int getBooksCount(){
        return listBooks.size();
    }

    public void addBook(String book) {
        listBooks.add(book);
    }

    public void removeBook(String book) {
        listBooks.remove(book);
    }

    public void printBooks() {
        for (int j = 0; j < getBooksCount(); j++) {
            if (j != getBooksCount() - 1) {
                System.out.print(getBook(j) + ", ");
            } else {
                System.out.println(getBook(j));
            }
        }
    }

}
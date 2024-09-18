package com.qa;

public class Book extends Art {

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


   int pages;
   String genre;
   String author;





    public Book(String creator, String title, String dateMade, String countryMade, int pages, String genre, String author) {
        super(creator, title, dateMade, countryMade);
        this.pages = pages;
        this.genre = genre;
        this.author = author;
    }

    @Override
    public String toString(){
        return this.
    }
}




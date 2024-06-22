package com.spring.BookReservations.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "blurb")
    private String blurb;
    @Column(name = "ISBN")
    private String ISBN;
    @Column(name = "picture")
    private String picture;
    @Column(name = "pages")
    private int pageCount;
    @Column(name = "genre")
    private String genre;

    public Book() {
    }
    public Book(String title, String blurb, String ISBN, String picture, int pageCount, String genre) {
        this.title = title;
        this.blurb = blurb;
        this.ISBN = ISBN;
        this.picture = picture;
        this.pageCount = pageCount;
        this.genre = genre;
    }
    public Book(int id, String title, String blurb, String ISBN, String picture, int pageCount, String genre) {
        this.id = id;
        this.title = title;
        this.blurb = blurb;
        this.ISBN = ISBN;
        this.picture = picture;
        this.pageCount = pageCount;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", blurb='" + blurb + '\'' +
                ", ISBN=" + ISBN +
                ", picture='" + picture + '\'' +
                ", pageCount=" + pageCount +
                ", genre='" + genre + '\'' +
                '}';
    }
}

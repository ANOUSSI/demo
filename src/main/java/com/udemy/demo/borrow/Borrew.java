package com.udemy.demo.borrow;

import com.udemy.demo.book.Book;
import com.udemy.demo.user.User;

import java.time.LocalDate;

public class Borrew {
    private Book book;
    private User borrewer;
    private  User lender;
    private LocalDate asDate;
    private  LocalDate closeDate;

    public LocalDate getAsDate() {
        return asDate;
    }

    public LocalDate getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(LocalDate closeDate) {
        this.closeDate = closeDate;
    }

    public void setAsDate(LocalDate asDate) {
        this.asDate = asDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getBorrewer() {
        return borrewer;
    }

    public void setBorrewer(User borrewer) {
        this.borrewer = borrewer;
    }

    public User getLender() {
        return lender;
    }

    public void setLender(User lender) {
        this.lender = lender;
    }
}

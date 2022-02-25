package com.udemy.demo.book;

import javax.validation.constraints.NotBlank;

public class Book {
    @NotBlank
    private String title;
    private  Category cotegory;
private  BookStatus bookStatus;

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCotegory() {
        return cotegory;
    }

    public void setCotegory(Category cotegory) {
        this.cotegory = cotegory;
    }
}

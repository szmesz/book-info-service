package com.epam.bookinfoservice.controller;

import com.epam.bookinfoservice.model.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookResource {

    @RequestMapping(value = "/{bookId}", produces={"application/json"})
    public Book getBookInformation(@PathVariable("bookId") String bookId) {
        return new Book(bookId, "Game Of Thrones", "book description");
    }
}

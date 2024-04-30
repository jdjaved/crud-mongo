package com.mongo.service;

import com.mongo.model.BookModel;
import com.mongo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) { this.bookRepository = bookRepository; }

    public List<BookModel> getAllBooks() {
        return bookRepository.findAll();
    }

    public BookModel getBookById(String id) {
        return bookRepository.findById(id).orElse(null);
    }

    public BookModel saveBook(BookModel book) {
        return bookRepository.save(book);
    }

    public void deleteBookById(String id) {
        bookRepository.deleteById(id);
    }
}

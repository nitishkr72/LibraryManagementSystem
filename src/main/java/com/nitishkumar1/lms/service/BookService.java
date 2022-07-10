package com.nitishkumar1.lms.service;

import com.nitishkumar1.lms.model.Book;
import com.nitishkumar1.lms.model.Student;
import com.nitishkumar1.lms.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    public final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> findAllBooks() {
        return bookRepo.findAll();
    }

    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public void deleteBookById(Long id) {
        bookRepo.deleteBookById(id);
    }

    public List<Book> findBookIssuedByStudentId(Long id) {
        return bookRepo.findBookByStudentId(id);
    }

    public List<Book> findBookOverdueByStudentId(Long id) {
        return bookRepo.findBookOverdueByStudentId(id);
    }

    public List<Book> findAllIssuedBook() {
        return bookRepo.findAllBookIssued();
    }

    public List<Book> searchBook(String keyword) {
        return bookRepo.search(keyword);
    }



}

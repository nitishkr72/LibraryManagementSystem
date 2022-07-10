package com.nitishkumar1.lms.controller;

import com.nitishkumar1.lms.model.Book;
import com.nitishkumar1.lms.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.findAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book newBook = bookService.addBook(book);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }

    @GetMapping("/search/{keyword}")
    public ResponseEntity<List<Book>> searchBook(@PathVariable("keyword") String keyword) {
        List<Book> book = bookService.searchBook(keyword);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBookById(@PathVariable("id") Long id) {
        bookService.deleteBookById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/find/books/{sid}")
    public ResponseEntity<List<Book>> searchBookByStudentId(@PathVariable("sid") Long sid) {
        List<Book> books = bookService.findBookIssuedByStudentId(sid);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("find/overdue/{sid}")
    public ResponseEntity<List<Book>> searchBookOverdueByStudentId(@PathVariable("sid") Long sid) {
        List<Book> books = bookService.findBookOverdueByStudentId(sid);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/find/all")
    public ResponseEntity<List<Book>> searchBooksIssued() {
        List<Book> books = bookService.findAllIssuedBook();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}

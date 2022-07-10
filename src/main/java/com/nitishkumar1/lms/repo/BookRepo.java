package com.nitishkumar1.lms.repo;

import com.nitishkumar1.lms.model.Book;
import com.nitishkumar1.lms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookRepo extends JpaRepository<Book, Long> {

    @Query(
            value = "SELECT * FROM book WHERE name LIKE %?1%" + " OR isbn LIKE %?1%" + " OR category LIKE %?1%",
            nativeQuery = true
    )
    List<Book> search(String keyword);

    //--------------------------------------
    @Query(
            value = "SELECT * FROM book WHERE book.id IN (SELECT bookid FROM issued WHERE studentid = id)",
            nativeQuery = true
    )
    List<Book> findBookByStudentId(Long id);

    @Query(
            value = "SELECT * FROM book WHERE book.id IN (SELECT issued.bookid FROM issued WHERE issued.studentid = id and issued.overdue > 0)",
            nativeQuery = true
    )
    List<Book> findBookOverdueByStudentId(Long id);

    @Query(
            value = "SELECT * FROM book WHERE book.id IN (SELECT issued.bookid from issued)",
            nativeQuery = true
    )
    List<Book> findAllBookIssued();


    //--------------------------------------

    @Transactional
    void deleteBookById(Long id);
}

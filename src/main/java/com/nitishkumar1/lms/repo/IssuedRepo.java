package com.nitishkumar1.lms.repo;

import com.nitishkumar1.lms.model.Book;
import com.nitishkumar1.lms.model.Issued;
import com.nitishkumar1.lms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IssuedRepo extends JpaRepository<Issued, Long> {
//    @Query(
//            value = "INSERT into issued VALUES (CURDATE(), 0, DATE_ADD(CURDATE(), INTERVAL 15 DAY), bookId, studentId)",
//            nativeQuery = true
//    )
//    Issued addIssuedById(Long studentId, Long bookId);
//-------------------------------------------------
//    @Query(
//            value = "SELECT * FROM book WHERE book.id IN (SELECT bookid FROM issued WHERE studentid = id)",
//            nativeQuery = true
//    )
//    List<Book> findBookByStudentId(Long id);
//
//    @Query(
//            value = "SELECT * FROM book WHERE book.id IN (SELECT issued.bookid FROM issued WHERE issued.studentid = id and issued.overdue > 0)",
//            nativeQuery = true
//    )
//    List<Book> findBookOverdueByStudentId(Long id);
//
//    @Query(
//            value = "SELECT * FROM book WHERE book.id IN (SELECT issued.bookid from issued)",
//            nativeQuery = true
//    )
//    List<Book> findAllBookIssued();
//----------------------------------------------------


    @Transactional
    void deleteIssuedById(Long id);
}

package com.nitishkumar1.lms.repo;

import com.nitishkumar1.lms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {

    @Transactional
    void deleteStudentById(Long id);

    Student findStudentById(Long id);

    @Query(
            value = "SELECT * FROM student WHERE student.id IN (SELECT issued.studentid FROM issued WHERE issued.bookid=id)",
            nativeQuery = true
    )
    List<Student> findAllStudentByBookIssued(Long id);
}

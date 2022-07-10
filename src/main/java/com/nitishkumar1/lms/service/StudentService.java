package com.nitishkumar1.lms.service;

import com.nitishkumar1.lms.model.Student;
import com.nitishkumar1.lms.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> findAllStudents() {
        return studentRepo.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student findStudentById(Long id) {
        return studentRepo.findStudentById(id);
    }

    public void deleteStudent(Long id) {
        studentRepo.deleteStudentById(id);
    }

    public List<Student> findAllStudentByBookIssued(Long book_id) {
        return studentRepo.findAllStudentByBookIssued(book_id);
    }

}

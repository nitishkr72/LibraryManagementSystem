package com.nitishkumar1.lms.service;

import com.nitishkumar1.lms.model.Book;
import com.nitishkumar1.lms.model.Issued;
import com.nitishkumar1.lms.model.Student;
import com.nitishkumar1.lms.repo.IssuedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssuedService {
    private final IssuedRepo issuedRepo;

    @Autowired
    public IssuedService(IssuedRepo issuedRepo) {
        this.issuedRepo = issuedRepo;
    }

//    public Issued addIssuedBookByStudentId(Issued issued) {
//        return issuedRepo.save(issued);
//    }

    public List<Issued> findAllIssuedItems() {
        return issuedRepo.findAll();
    }

    public Issued addIssued(Issued issued) {
        return issuedRepo.save(issued);
    }

//    public List<Book> findBookIssuedByStudentId(Long id) {
//        return issuedRepo.findBookByStudentId(id);
//    }
//
//    public List<Book> findBookOverdueByStudentId(Long id) {
//        return issuedRepo.findBookOverdueByStudentId(id);
//    }
//
//    public List<Book> findAllIssuedBook() {
//        return issuedRepo.findAllBookIssued();
//    }


    public void deleteIssued(Long id) {
        issuedRepo.deleteIssuedById(id);
    }
}

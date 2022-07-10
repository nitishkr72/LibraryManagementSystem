package com.nitishkumar1.lms.controller;

import com.nitishkumar1.lms.model.Book;
import com.nitishkumar1.lms.model.Issued;
import com.nitishkumar1.lms.model.Student;
import com.nitishkumar1.lms.service.IssuedService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/issued")
public class IssuedController {
    private final IssuedService issuedService;

    public IssuedController(IssuedService issuedService) {
        this.issuedService = issuedService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Issued>> getAllIssued() {
        List<Issued> issuedsItems = issuedService.findAllIssuedItems();
        return new ResponseEntity<>(issuedsItems, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Issued> addIssuedItems(@RequestBody Issued issued) {
        Issued issuedItem = issuedService.addIssued(issued);
        return new ResponseEntity<>(issuedItem, HttpStatus.CREATED);
    }




    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteIssuedItems(@PathVariable("id") Long id) {
        issuedService.deleteIssued(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

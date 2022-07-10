package com.nitishkumar1.lms.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "issued")
public class Issued implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;
    @Column(name = "bookid")
    private long bookid;
    @Column(name = "studentid")
    private long studentid;
    @Column(name = "borrowDate")
    private LocalDate borrowDate;
    @Column(name = "submitDate")
    private LocalDate submitDate;
    @Column(name = "overdue")
    private int overdue;

    public Issued() {
    }

    public Issued(long bookid, long studentid, LocalDate borrowDate, LocalDate submitDate, int overdue) {
        this.bookid = bookid;
        this.studentid = studentid;
        this.borrowDate = borrowDate;
        this.submitDate = submitDate;
        this.overdue = overdue;
    }

    public long getBookid() {
        return bookid;
    }

    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    public long getStudentid() {
        return studentid;
    }

    public void setStudentid(long studentid) {
        this.studentid = studentid;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(LocalDate submitDate) {
        this.submitDate = submitDate;
    }

    public int getOverdue() {
        return overdue;
    }

    public void setOverdue(int overdue) {
        this.overdue = overdue;
    }

    @Override
    public String toString() {
        return "Issued{" +
                "bookid=" + bookid +
                ", studentid=" + studentid +
                ", borrowDate=" + borrowDate +
                ", submitDate=" + submitDate +
                ", overdue=" + overdue +
                '}';
    }
}

package com.nitishkumar1.lms.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "rollNumber", nullable = false, updatable = false)
    private String rollNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "department")
    private String department;
    @Column(name = "address")
    private String address;
    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dob;
    @Temporal(TemporalType.DATE)
    @Column(name = "subscriptionExpiryDate")
    private Date subscriptionExpiryDate;
    @Column(name = "phoneNumber")
    private Long phoneNumber;
    @Column(name = "photo")
    private String photo;

    public Student() {
    }

    public Student(
            String name, String rollNumber, String email,
            String department, String address, Date dob,
            Date subscriptionExpiryDate, Long phoneNumber, String photo) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.email = email;
        this.department = department;
        this.address = address;
        this.dob = dob;
        this.subscriptionExpiryDate = subscriptionExpiryDate;
        this.phoneNumber = phoneNumber;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getSubscriptionExpiryDate() {
        return subscriptionExpiryDate;
    }

    public void setSubscriptionExpiryDate(Date subscriptionExpiryDate) {
        this.subscriptionExpiryDate = subscriptionExpiryDate;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                ", subscriptionExpiryDate=" + subscriptionExpiryDate +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

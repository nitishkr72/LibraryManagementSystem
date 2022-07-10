package com.nitishkumar1.lms.service;

import com.nitishkumar1.lms.model.Admin;
import com.nitishkumar1.lms.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepo adminRepo;

    @Autowired
    public AdminService(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }

    public Admin addAdmin(Admin admin) {
        return adminRepo.save(admin);
    }

    public void deleteAdmin(Long id) {
        adminRepo.deleteAdminById(id);
    }


}

package com.nitishkumar1.lms.repo;

import com.nitishkumar1.lms.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface AdminRepo extends JpaRepository<Admin, Long> {

    @Transactional
    void deleteAdminById(Long id);
}

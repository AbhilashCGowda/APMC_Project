package com.internship.APMCproject.Repository;

import com.internship.APMCproject.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
}

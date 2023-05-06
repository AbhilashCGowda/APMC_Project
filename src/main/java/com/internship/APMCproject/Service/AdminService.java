package com.internship.APMCproject.Service;

import com.internship.APMCproject.Entity.Admin;
import com.internship.APMCproject.Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminRepo;

    public Object AddAdmin(Admin admin){                                //to add
        var admindata = adminRepo.save(admin);
        return admindata;
    }


    public List<Admin> GetAdmin(){

        return adminRepo.findAll();
    }

    public String UpdateAdmin(Admin obj, Integer userid){

        var admin=adminRepo.findById(userid).orElseThrow(()-> new RuntimeException("Admin not found"));
        admin.setName(obj.getName());
        admin.setMobile(obj.getMobile());
        admin.setPassword(obj.getPassword());
        adminRepo.save(admin);
        return  "Updated Successfully";
    }

    public String DeleteAdmin(Integer userid)
    {
        var admin =adminRepo.findById(userid).orElseThrow(()->new RuntimeException("User not found"));
        adminRepo.delete(admin);
        return "Deleted Successfully";
    }


}

package com.internship.APMCproject.Controller;

import com.internship.APMCproject.Entity.Admin;
import com.internship.APMCproject.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/Admin/AddAdmin")
    public ResponseEntity<?> CreateAdmin(@RequestBody Admin admin){
        return  new ResponseEntity<>(adminService.AddAdmin(admin), HttpStatus.OK);
    }

    @GetMapping("/Admin/GetAdmin")
    public ResponseEntity<?> GetAdmin(){
        return  new ResponseEntity<>(adminService.GetAdmin(), HttpStatus.OK);
    }

    @PutMapping("/Admin/UpdateAdmin/{userid}")
    public ResponseEntity<?> EditUser(@RequestBody Admin obj, @PathVariable Integer userid) {
        var result = adminService.UpdateAdmin(obj,userid);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    @DeleteMapping("/Admin/DeleteAdmin/{userid}")
    public ResponseEntity<String>DeleteAdmin(@PathVariable Integer userid)
    {
        return new ResponseEntity<>(adminService.DeleteAdmin(userid),HttpStatus.OK);
    }
}

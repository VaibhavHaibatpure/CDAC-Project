package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.beans.Staff;
import com.demo.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping
    public ResponseEntity<List<Staff>> getAllStaff() {
        List<Staff> staffList = staffService.getAllStaff();
        return ResponseEntity.ok(staffList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Staff> getById(@PathVariable long id) {
        Staff staff = staffService.getById(id);
        if (staff != null) {
            return ResponseEntity.ok(staff);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<String> addStaff(@RequestBody Staff staff) {
        int result = staffService.addStaff(staff);
        if (result > 0) {
            return ResponseEntity.ok("Staff added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateStaff(@PathVariable long id, @RequestBody Staff staff) {
        staff.setStaffId(id);
        int result = staffService.modifyStaff(staff);
        if (result > 0) {
            return ResponseEntity.ok("Staff updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStaff(@PathVariable long id) {
        staffService.deleteById(id);
        return ResponseEntity.ok("Staff deleted successfully");
    }
}

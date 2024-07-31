package com.demo.controller;

import com.demo.beans.Subjects;
import com.demo.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectsController {

    @Autowired
    private SubjectsService subjectService;

    @GetMapping
    public List<Subjects> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subjects> getSubjectById(@PathVariable("id") Long id) {
        Subjects subject = subjectService.getSubjectById(id);
        if (subject == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(subject);
    }
    
    
    @GetMapping("/classes/staff/{staffid}")
    public ResponseEntity<List<Subjects>> getSubjectByStaffId(@PathVariable("staffid") String staffid){
    	List<Subjects> subject=subjectService.getSubjectsByStaffId(staffid);
    	if (subject == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(subject);
    }
    

    @PostMapping
    public Subjects createSubject(@RequestBody Subjects subject) {
        return subjectService.saveSubject(subject);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Subjects> updateSubject(@PathVariable("id") Long id, @RequestBody Subjects subject) {
        Subjects existingSubject = subjectService.getSubjectById(id);
        if (existingSubject == null) {
            return ResponseEntity.notFound().build();
        }
        subject.setSubjectId(id);
        return ResponseEntity.ok(subjectService.saveSubject(subject));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubject(@PathVariable("id") Long id) {
        if (subjectService.getSubjectById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        subjectService.deleteSubject(id);
        return ResponseEntity.noContent().build();
    }
}

package com.Student_Assignment.ATdev.Controller;

import com.Student_Assignment.ATdev.Domain.Student;
import com.Student_Assignment.ATdev.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/")
public class StudentController {

    @Autowired
    private StudentService service;

    //endpoint to add a student to the table
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student ){
        return service.saveStudent(student);
    }

    //endpoint to add a list to students
    @PostMapping("/bunch")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return service.saveStudents(students);
    }

    //endpoint to find all students
    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return service.getStudents();
    }


    //endpoint to find a student by id
    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    //endpoint to find a student by name
    @GetMapping("/studentByName/{fullName}")
    public Student findStudentByName(@PathVariable String fullName){

        return service.getStudentByName(fullName);
    }

    //endpoint to update the student info
    @PutMapping ("/update")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    //endpoint to delete a student record
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return service.deleteStudent(id);
    }
}


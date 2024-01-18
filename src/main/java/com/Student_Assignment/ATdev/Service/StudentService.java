package com.Student_Assignment.ATdev.Service;

import com.Student_Assignment.ATdev.Domain.Student;
import com.Student_Assignment.ATdev.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    //saving a student
    public Student saveStudent(Student student){
        return repository.save(student);
    }

    //saving a list of students
    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }

    //finding a student by id
    public Student getStudentById(int id){
        return repository.findById(id).orElse(null);
    }

    //finding a student by Name
    public Student getStudentByName(String fullName){
        return repository.findByFullName(fullName);
    }

    //deleting a student
    public String deleteStudent(int id){
        repository.deleteById(id);
        return "Student with: "+id+" Id is removed!!";
    }

    //updating a student
    public Student updateStudent(Student student){
        Student existingstudent =repository.findById(student.getRollNo()).orElse(null);
        existingstudent.setFullName(student.getFullName());
        existingstudent.setBranch(student.getBranch());
        existingstudent.setAge(student.getAge());
        existingstudent.setContactInfo(student.getContactInfo());
        return repository.save((existingstudent));
    }

    //finding all the students
    public List<Student> getStudents() {
        return  repository.findAll();
    }
}

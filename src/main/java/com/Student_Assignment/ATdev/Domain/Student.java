package com.Student_Assignment.ATdev.Domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "atdev_student_tbl")
public class Student {

    @Id
    //To set the initial value for auto increment to start from
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "atdev_student_tbl_seq")
    @SequenceGenerator(name = "atdev_student_tbl_seq", sequenceName = "atdev_student_tbl_seq", initialValue = 101, allocationSize = 1)
    //@GeneratedValue annotation uses the default strategy used by Spring Boot.
    @Column(name = "roll_no")
    private int rollNo;
    @Column(name = "student_name")
    private String fullName;
    @Column(name = "branch")
    private String branch;
    @Column(name = "age")
    private  int age;
    @Column(name = "contact_info")
    private long contactInfo;

}

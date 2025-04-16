package com.codewithteja.spring_data_jpa_ex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Student {
    @Id
    private int rollNo;
    private String name;
    private int marks;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getRollNo() {

        return rollNo;
    }

    public void setRollNo(int rollNo) {

        this.rollNo = rollNo;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {

        this.marks = marks;
    }

}

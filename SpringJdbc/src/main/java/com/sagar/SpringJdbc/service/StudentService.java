package com.sagar.SpringJdbc.service;

import com.sagar.SpringJdbc.model.Student;
import com.sagar.SpringJdbc.repository.StudetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudetRepository repository;

    public StudetRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(StudetRepository repository) {
        this.repository = repository;
    }

    public void addStudent(Student student) {
        System.out.println("Student is added");
    }


    public void save(Student student) {
        repository.save(student);
    }

    public List<Student> findAll() {
        return repository.findAll();
    }
}

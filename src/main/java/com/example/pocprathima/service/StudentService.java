package com.example.pocprathima.service;

import com.example.pocprathima.entity.Student;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class StudentService {


    static final String SQL = "SELECT * FROM <table> where id = :id";
    @PersistenceContext
    private EntityManager entityManager;


    public List<Student> getAll(){
        String tableName = "student";
        String SQLX = SQL.replaceAll("<table>", tableName);
        Query nativeQuery = entityManager.createNativeQuery(SQLX, Student.class);
        nativeQuery.setParameter("id", 1);
        return nativeQuery.getResultList();

    }
}

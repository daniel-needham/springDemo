package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//generic type is = <class that we are using with db, type of primary key>
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

package com.QM.app.student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<StudentH2DB, Long> {

    List<StudentH2DB> findAll();

}

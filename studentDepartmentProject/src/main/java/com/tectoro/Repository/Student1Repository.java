package com.tectoro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.model.Student1;
@Repository
public interface Student1Repository extends JpaRepository<Student1, Integer>{

}

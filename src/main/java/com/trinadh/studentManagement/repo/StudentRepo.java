package com.trinadh.studentManagement.repo;

import com.trinadh.studentManagement.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Students,Integer> {

}

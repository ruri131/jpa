package com.example.testjpa.Repository;

import com.example.testjpa.pojo.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Integer> {


}

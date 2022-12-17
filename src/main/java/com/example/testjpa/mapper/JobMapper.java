package com.example.testjpa.mapper;

import com.example.testjpa.pojo.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobMapper extends JpaRepository<Job, Integer> {


}

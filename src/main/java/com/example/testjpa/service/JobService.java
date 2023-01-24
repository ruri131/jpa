package com.example.testjpa.service;

import com.example.testjpa.pojo.Job;

import java.util.List;
import java.util.Optional;

public interface JobService {

    List<Job> findAll();

    Job getReferenceById(Integer id);

    Optional<Job> findById(Integer id);

    Job save(Job job);

}

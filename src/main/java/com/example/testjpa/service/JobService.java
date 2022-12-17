package com.example.testjpa.service;

import com.example.testjpa.pojo.Job;

import java.util.List;

public interface JobService {

    List<Job> findAll();

    Job getReferenceById(Integer id);


    Job save(Job job);

}

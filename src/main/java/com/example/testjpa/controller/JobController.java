package com.example.testjpa.controller;

import com.example.testjpa.pojo.Job;
import com.example.testjpa.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/job2")
    public List<Job> findAll() {

        return jobService.findAll();
    }

    @GetMapping("/job2/{id}")
    public String getReferenceById(@PathVariable("id") Integer id) {

        return jobService.getReferenceById(id).toString();
    }

    @PostMapping("/job2/save")
    public String save(("id") Integer id) {

        return jobService.getReferenceById(id).toString();
    }
}

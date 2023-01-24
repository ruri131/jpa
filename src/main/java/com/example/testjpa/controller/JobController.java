package com.example.testjpa.controller;

import com.example.testjpa.pojo.Job;
import com.example.testjpa.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(value = "http://localhost:8080")
@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/job2")
    public List<Job> findAll() {

        return jobService.findAll();
    }

    @GetMapping("/job2/{id}")
    public Optional<Job> findById(@PathVariable("id") Integer id) {

        return jobService.findById(id);
    }

    @PostMapping("/job2/save")
    //insert / update
    public Job save(@RequestBody Job job) {

        return jobService.save(job);
    }
}

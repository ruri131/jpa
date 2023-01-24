package com.example.testjpa.serviceimpl;

import com.example.testjpa.Repository.JobRepository;
import com.example.testjpa.pojo.Job;
import com.example.testjpa.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public Job getReferenceById(Integer id) {
        return jobRepository.getReferenceById(id);
    }

    @Override
    @Query("SELECT job from Job job WHERE job.id =?1")
    public Optional<Job> findById(Integer id) {
        return jobRepository.findById(id);
    }

    @Override
    public Job save(Job job) {
        return jobRepository.save(job);

    }
}

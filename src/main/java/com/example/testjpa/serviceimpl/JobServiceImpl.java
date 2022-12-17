package com.example.testjpa.serviceimpl;

import com.example.testjpa.mapper.JobMapper;
import com.example.testjpa.pojo.Job;
import com.example.testjpa.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public List<Job> findAll() {
        return jobMapper.findAll();
    }

    @Override
    public Job getReferenceById(Integer id) {
        return jobMapper.getReferenceById(id);
    }

    @Override
    public Job save(Job job) {
        return jobMapper.save(job);
    }
}

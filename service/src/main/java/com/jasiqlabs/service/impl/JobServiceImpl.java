//package com.jasiqlabs.service;
//import com.jasiqlabs.controller.dto.JobResponse;
//import com.jasiqlabs.domain.Job;
//import com.jasiqlabs.repository.JobRepository;
//import org.springframework.stereotype.Service;
//import java.util.List;
//@Service
//public class JobServiceImpl implements JobService {
//    private final JobRepository jobRepository;
//    public JobServiceImpl(JobRepository jobRepository) {
//        this.jobRepository = jobRepository;
//    }
//
//    public JobRepository getJobRepository() {
//        return jobRepository;
//    }
//
//    @Override
//    public JobResponse addJob(Job job) {
//        return jobRepository.save(job);
//    }
//    @Override
//    public List<JobResponse> getAllJobs() {
//        return jobRepository.findAll();
//    }
//    @Override
//    public JobResponse getJobById(Long id) {
//        return jobRepository.findById(id).orElseThrow(() -> new RuntimeException("Job not found"));
//    }
//    @Override
//    public void deleteJob(Long id) {
//        jobRepository.deleteById(id);
//    }
package com.jasiqlabs.service.impl;
import com.jasiqlabs.domain.Job;
import com.jasiqlabs.domain.dto.JobResponse;
import com.jasiqlabs.repository.JobRepository;
import com.jasiqlabs.service.JobService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public JobResponse addJob(Job job) {
        Job savedJob = jobRepository.save(job);   // Save entity
        return new JobResponse(savedJob);         // Convert entity → DTO
    }

    @Override
    public List<JobResponse> getAllJobs() {
        return jobRepository.findAll().stream()
                .map(JobResponse::new)            // Convert each Job → JobResponse
                .collect(Collectors.toList());
    }

    @Override
    public JobResponse getJobById(Long id) {
        Job job = jobRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found with id: " + id));
        return new JobResponse(job);              // Convert entity → DTO
    }

    @Override
    public void deleteJob(Long id) {
        jobRepository.deleteById(id);             // Just delete, no return
    }
}



//package com.jasiqlabs.service;
//import com.jasiqlabs.domain.Job;
//import java.util.List;
//public interface JobService {
//    Job addJob(Job job);
//    List<Job> getAllJobs();
//    Job getJobById(Long id);
//    void deleteJob(Long id);
//}


package com.jasiqlabs.service;

import com.jasiqlabs.domain.Job;
import com.jasiqlabs.domain.dto.JobResponse;

import java.util.List;

public interface JobService {
    JobResponse addJob(Job job);
    List<JobResponse> getAllJobs();
    JobResponse getJobById(Long id);
    void deleteJob(Long id);
}



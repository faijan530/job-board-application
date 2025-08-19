//package com.jasiqlabs.controller;
//import com.jasiqlabs.domain.Job;
//import com.jasiqlabs.service.JobService;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//@RestController
//@RequestMapping("/api/jobs")
//public class JobController {
//    private final JobService jobService;
//    public JobController(JobService jobService) {
//        this.jobService = jobService;
//    }
//    @PostMapping
//    public Job createJob(@RequestBody Job job) {
//        return jobService.addJob(job);
//    }
//    @GetMapping
//    public List<Job> getAllJobs() {
//        return jobService.getAllJobs();
//    }
//    @GetMapping("/{id}")
//    public Job getJob(@PathVariable Long id) {
//        return jobService.getJobById(id);
//    }
//    @DeleteMapping("/{id}")
//    public void deleteJob(@PathVariable Long id) {
//        jobService.deleteJob(id);
//    }
//}
//

package com.jasiqlabs.controller;

import com.jasiqlabs.domain.Job;
import com.jasiqlabs.domain.dto.JobResponse;
import com.jasiqlabs.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public JobResponse createJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }

    @GetMapping
    public List<JobResponse> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public JobResponse getJob(@PathVariable Long id) {
        return jobService.getJobById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
    }
}


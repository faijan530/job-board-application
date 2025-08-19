package com.jasiqlabs.controller;
import com.jasiqlabs.domain.dto.JobResponse;
import com.jasiqlabs.service.JobSearchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobPublicController {

    private final JobSearchService jobSearchService;

    public JobPublicController(JobSearchService jobSearchService) {
        this.jobSearchService = jobSearchService;
    }

    @GetMapping
    public List<JobResponse> searchJobs(
            @RequestParam(required = false) String location,
            @RequestParam(required = false) String skills,
            @RequestParam(required = false) String keyword) {
        return jobSearchService.search(location, skills, keyword);
    }

    @GetMapping("/{id}")
    public JobResponse getJobById(@PathVariable Long id) {
        return jobSearchService.getById(id);
    }
}


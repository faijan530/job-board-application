package com.jasiqlabs.service.impl;
import com.jasiqlabs.domain.Job;
import com.jasiqlabs.domain.dto.JobResponse;
import com.jasiqlabs.repository.JobRepository;
import com.jasiqlabs.service.JobSearchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobSearchServiceImpl implements JobSearchService {

    private final JobRepository jobRepository;

    public JobSearchServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<JobResponse> search(String location, String skills, String keyword) {
        // Fetch all jobs and filter manually (for now; later you can use DB queries)
        return jobRepository.findAll().stream()
                .filter(job -> (location == null || job.getLocation().equalsIgnoreCase(location)))
                .filter(job -> (skills == null || job.getSkills().toLowerCase().contains(skills.toLowerCase())))
                .filter(job -> (keyword == null ||
                        job.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                        job.getDescription().toLowerCase().contains(keyword.toLowerCase())))
                .map(JobResponse::new) // map Job → JobResponse
                .collect(Collectors.toList());
    }

    @Override
    public JobResponse getById(Long id) {
        Job job = jobRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found with id: " + id));
        return new JobResponse(job);
    }
}


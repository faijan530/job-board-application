//package com.jasiqlabs.service;
//import com.jasiqlabs.controller.dto.JobResponse;
//import java.util.List;
//
//public interface JobSearchService {
//    List<JobResponse> search(String location, String skills, String keyword);
//    JobResponse getById(Long id);
//}


package com.jasiqlabs.service;
import com.jasiqlabs.domain.dto.JobResponse;

import java.util.List;

public interface JobSearchService {

    // Search jobs using filters (location, skills, keyword)
    List<JobResponse> search(String location, String skills, String keyword);

    // Get a single job by ID (returns DTO instead of entity)
    JobResponse getById(Long id);
}


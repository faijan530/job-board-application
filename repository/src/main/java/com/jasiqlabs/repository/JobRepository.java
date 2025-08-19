//package com.jasiqlabs.repository;
//import com.jasiqlabs.domain.Job;
//import java.util.List;
//import java.util.Optional;
//public interface JobRepository {
//    Job save(Job job);
//    List<Job> findAll();
//    Optional<Job> findById(Long id);
//    void deleteById(Long id);
//}
//
////

package com.jasiqlabs.repository;

import com.jasiqlabs.domain.Job;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

    @Query("SELECT j FROM Job j WHERE " +
            "(:location IS NULL OR LOWER(j.location) LIKE LOWER(CONCAT('%', :location, '%'))) AND " +
            "(:skills IS NULL OR LOWER(j.skills) LIKE LOWER(CONCAT('%', :skills, '%'))) AND " +
            "(:keyword IS NULL OR LOWER(j.title) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(j.description) LIKE LOWER(CONCAT('%', :keyword, '%')))")
    List<Job> searchJobs(@Param("location") String location,
                         @Param("skills") String skills,
                         @Param("keyword") String keyword);
}


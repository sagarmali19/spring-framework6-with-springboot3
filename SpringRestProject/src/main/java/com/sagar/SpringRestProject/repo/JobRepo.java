package com.sagar.SpringRestProject.repo;

import com.sagar.SpringRestProject.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

}

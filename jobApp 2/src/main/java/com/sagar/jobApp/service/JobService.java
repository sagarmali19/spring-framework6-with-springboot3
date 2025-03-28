package com.sagar.jobApp.service;

import com.sagar.jobApp.model.JobPost;
import com.sagar.jobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
	@Autowired
	public JobRepo repo;

	//method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return repo.returnAllJobPosts();
	}

	// ***************************************************************************

	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);
	
	}


	public JobPost getJob(int postId) {
		return repo.getJob(postId);
	}

	public void updateJob(JobPost job) {
		repo.updateJob(job);
	}

	public void deleteJob(int postId) {
		repo.deleteJob(postId);
	}
}

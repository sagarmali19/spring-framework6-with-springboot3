package com.sagar.jobApp.repo;

import com.sagar.jobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

	// arrayList to store JobPost objects
	List<JobPost> jobs = new ArrayList<>(Arrays.asList(
				new JobPost(1, "Java Developer"),
				new JobPost(2, "Angular developer"),
				new JobPost(3, "React Developer")
		));

	// method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return jobs;
	}

	// method to save a job post object into arrayList
	public void addJobPost(JobPost job) {
		jobs.add(job);
	}

	public JobPost getJob(int postId) {
		for(JobPost job : jobs){
			if(job.getPostId() == postId){
				return job;
			}
		}
		return null;
	}

	public void updateJob(JobPost job) {
		for(JobPost jobPost : jobs){
			if(job.getPostId() == jobPost.getPostId()){
				jobPost.setPostId(job.getPostId());
				jobPost.setPostProfile(job.getPostProfile());
			}
		}
	}

	public void deleteJob(int postId) {
		for(JobPost jobPost : jobs){
			if(postId == jobPost.getPostId()){
				jobs.remove(jobPost);
			}
		}
	}
}

package com.sagar.jobApp;

import com.sagar.jobApp.model.JobPost;
import com.sagar.jobApp.repo.JobRepo;
import com.sagar.jobApp.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {
    private JobService jobService;

    public JobRestController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("jobPost")
    public List<JobPost> getAllJobPosts(){
        return jobService.returnAllJobPosts();
    }

    @GetMapping("jobPosts/{postId}")
    public JobPost getAJob(@PathVariable("postId") int postId){
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost job){
        jobService.addJobPost(job);
    }

    @PutMapping("jobPost")
    public void updateJob(@RequestBody JobPost job){
        jobService.updateJob(job);
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId){
        jobService.deleteJob(postId);
        return "Deleted the record";
    }
}

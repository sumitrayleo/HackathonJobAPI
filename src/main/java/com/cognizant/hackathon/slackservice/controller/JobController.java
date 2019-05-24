package com.cognizant.hackathon.slackservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.hackathon.slackservice.dto.JobRequest;
import com.cognizant.hackathon.slackservice.dto.JobStatus;
import com.cognizant.hackathon.slackservice.dto.JobsResponse;
import com.cognizant.hackathon.slackservice.dto.TestResponse;
import com.cognizant.hackathon.slackservice.service.JobService;

@RestController
public class JobController {
	
	@Autowired
	JobService jobService;
	
	@GetMapping(value = "/api/test")
	public TestResponse getResponseTest() {
		return new TestResponse("hello world");
	}
	
	@GetMapping(value = "/api/jobs")
	public JobsResponse getAllAvailableJobs() {
		return jobService.getAllAvailableJobs();
	}
	
	@PostMapping(value = "/api/job/{jobId}")
	public JobStatus triggerJob(@PathVariable String jobId, @RequestBody JobRequest jobRequest) {
		return jobService.triggerJob(jobRequest);
	}

}

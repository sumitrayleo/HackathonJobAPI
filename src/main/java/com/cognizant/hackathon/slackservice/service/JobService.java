package com.cognizant.hackathon.slackservice.service;

import com.cognizant.hackathon.slackservice.dto.JobRequest;
import com.cognizant.hackathon.slackservice.dto.JobStatus;
import com.cognizant.hackathon.slackservice.dto.JobsResponse;

public interface JobService {
	
	public JobsResponse getAllAvailableJobs();
	
	public JobStatus triggerJob(JobRequest jobRequest);

}

package com.cognizant.hackathon.slackservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cognizant.hackathon.slackservice.dto.AvailableJob;
import com.cognizant.hackathon.slackservice.dto.JobRequest;
import com.cognizant.hackathon.slackservice.dto.JobStatus;
import com.cognizant.hackathon.slackservice.dto.JobsResponse;

@Component
public class JobServiceImpl implements JobService {

	@Override
	public JobsResponse getAllAvailableJobs() {
		// read all jobs and return the list 
		// TODO: Now returning dummy data
		return populateData();
	}
	
	//This will be removed
	private JobsResponse populateData() {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("driver", "chromeDriver");
		params.put("testSuite", "REGRESSION");
		AvailableJob job = new AvailableJob("1", "DTS Web", "/home/usr/availablejobs", params);
		
		Map<String, String> params1 = new HashMap<String, String>();
		params1.put("driver", "IE");
		params1.put("testSuite", "SANITY");
		AvailableJob job1 = new AvailableJob("3", "GuestTech Web", "/home/usr/availablejobs", params1);
		
		List<AvailableJob> listOfJobs = new ArrayList<AvailableJob>();
		listOfJobs.add(job);
		listOfJobs.add(job1);
		
		return new JobsResponse(listOfJobs);
	}

	@Override
	public JobStatus triggerJob(JobRequest jobRequest) {
		// TODO Auto-generated method stub
		System.out.println(jobRequest);
		return new JobStatus("COMPLETED", "/home/usr/jobs/report/" + jobRequest.getJobName() + "index.html");
	}

}

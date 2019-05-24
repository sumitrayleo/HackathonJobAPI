package com.cognizant.hackathon.slackservice.dto;

import java.util.List;

public class JobsResponse {
	
	private List<AvailableJob> availableJobs;

	public List<AvailableJob> getAvailableJobs() {
		return availableJobs;
	}

	public void setAvailableJobs(List<AvailableJob> availableJobs) {
		this.availableJobs = availableJobs;
	}

	@Override
	public String toString() {
		return "JobsResponse [availableJobs=" + availableJobs + "]";
	}

	public JobsResponse(List<AvailableJob> availableJobs) {
		super();
		this.availableJobs = availableJobs;
	}
	
}

package com.cognizant.hackathon.slackservice.dto;

import java.util.Map;

public class JobRequest {

	private String jobName;
	private Map<String, String> parameters;
	
	public JobRequest() {
	}

	public JobRequest(String jobName, Map<String, String> parameters) {
		super();
		this.jobName = jobName;
		this.parameters = parameters;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		return "JobRequest [jobName=" + jobName + ", parameters=" + parameters + "]";
	}

}

package com.cognizant.hackathon.slackservice.dto;

public class JobStatus {
	
	private String status;
	private String reportPath;
	
	
	public JobStatus(String status, String reportPath) {
		super();
		this.status = status;
		this.reportPath = reportPath;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getReportPath() {
		return reportPath;
	}


	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}


	@Override
	public String toString() {
		return "JobStatus [status=" + status + ", reportPath=" + reportPath + "]";
	}
	
}

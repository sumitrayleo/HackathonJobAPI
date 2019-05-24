package com.cognizant.hackathon.slackservice.dto;

import java.util.Map;

public class AvailableJob {
	
	private String id;
	private String name;
	private String path;
	private Map<String, String> parameters;
	
	public AvailableJob(String id, String name, String path, Map<String, String> parameters) {
		super();
		this.id = id;
		this.name = name;
		this.path = path;
		this.parameters = parameters;
	}
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Map<String, String> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
	@Override
	public String toString() {
		return "AvailableJob [id=" + id + ", name=" + name + ", path=" + path + ", parameters=" + parameters + "]";
	}
	
}

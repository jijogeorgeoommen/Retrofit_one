package com.example.retrofit_one;

import java.util.List;
import java.io.Serializable;

public class ResponseDTO implements Serializable {
	private String status;
	private List<JobDetailsDTO> jobDetails;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setJobDetails(List<JobDetailsDTO> jobDetails){
		this.jobDetails = jobDetails;
	}

	public List<JobDetailsDTO> getJobDetails(){
		return jobDetails;
	}
}
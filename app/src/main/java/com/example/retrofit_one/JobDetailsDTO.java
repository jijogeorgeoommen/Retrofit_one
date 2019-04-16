package com.example.retrofit_one;

import java.io.Serializable;

public class JobDetailsDTO implements Serializable {
	private String id;
	private String jobtitle;
	private String jobdes;
	private String deadline;
	private String plc;
	private String userid;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setJobtitle(String jobtitle){
		this.jobtitle = jobtitle;
	}

	public String getJobtitle(){
		return jobtitle;
	}

	public void setJobdes(String jobdes){
		this.jobdes = jobdes;
	}

	public String getJobdes(){
		return jobdes;
	}

	public void setDeadline(String deadline){
		this.deadline = deadline;
	}

	public String getDeadline(){
		return deadline;
	}

	public void setPlc(String plc){
		this.plc = plc;
	}

	public String getPlc(){
		return plc;
	}

	public void setUserid(String userid){
		this.userid = userid;
	}

	public String getUserid(){
		return userid;
	}
}
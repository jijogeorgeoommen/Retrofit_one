
package com.example.retrofit_one;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Jobmodel {

    @SerializedName("Job Details")
    private List<JobDetail> jobDetails;
    @SerializedName("Status")
    private String status;

    public List<JobDetail> getJobDetails() {
        return jobDetails;
    }

    public String getStatus() {
        return status;
    }

    public static class Builder {

        private List<JobDetail> jobDetails;
        private String status;

        public Jobmodel.Builder withJobDetails(List<JobDetail> jobDetails) {
            this.jobDetails = jobDetails;
            return this;
        }

        public Jobmodel.Builder withStatus(String status) {
            this.status = status;
            return this;
        }

        public Jobmodel build() {
            Jobmodel jobmodel = new Jobmodel();
            jobmodel.jobDetails = jobDetails;
            jobmodel.status = status;
            return jobmodel;
        }

    }

}

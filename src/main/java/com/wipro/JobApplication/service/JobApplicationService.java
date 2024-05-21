package com.wipro.JobApplication.service;

import com.wipro.JobApplication.model.WiproJobApplication;
import com.wipro.JobApplication.repository.Jobapplicationrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobApplicationService {
    @Autowired
    private Jobapplicationrepo repo;
    public WiproJobApplication addJobApplication(WiproJobApplication jobApplication) {
        return repo.save(jobApplication);
    }

    public List<WiproJobApplication> addJobApplications(List<WiproJobApplication> jobApplication) {
        return repo.saveAll(jobApplication);
    }

    public List<WiproJobApplication> getJobApplications() {
        return repo.findAll();
    }

    public Optional<WiproJobApplication> getJobApplication(int id) {
        return repo.findById(id);
    }

    public String deleteJobApplication(int id) {
        repo.deleteById(id);
        return "Job Application removed !! " + id;
    }


    public WiproJobApplication updateJobApplication(int id, WiproJobApplication updatedJobApplication) {
        if (repo.existsById(id)) {
            WiproJobApplication existingJobApplication = repo.findById(id).get();
            // Update the existing job application with the new data
            existingJobApplication.setJobapplicationid(updatedJobApplication.getJobapplicationid());
            existingJobApplication.setJobtitle(updatedJobApplication.getJobtitle());
            existingJobApplication.setJobdescription(updatedJobApplication.getJobdescription());
            existingJobApplication.setJoblocation(updatedJobApplication.getJoblocation());
            existingJobApplication.setJobtype(updatedJobApplication.getJobtype());
            existingJobApplication.setJobcategory(updatedJobApplication.getJobcategory());
            existingJobApplication.setJobstatus(updatedJobApplication.getJobstatus());
            existingJobApplication.setJobapplicationstartdate(updatedJobApplication.getJobapplicationstartdate());
            existingJobApplication.setJobapplicationenddate(updatedJobApplication.getJobapplicationenddate());
            existingJobApplication.setExperience(updatedJobApplication.getExperience());
            // Add more fields as needed
            return repo.save(existingJobApplication);
        } else {
            throw new IllegalArgumentException("Job Application with ID " + id + " not found.");
        }
    }

}

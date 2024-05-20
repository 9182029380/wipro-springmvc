package com.wipro.JobApplication.service;

import com.wipro.JobApplication.model.WiproJobApplication;
import com.wipro.JobApplication.repository.Jobapplicationrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobApplicationService {
    @Autowired
    private Jobapplicationrepo repo;
    public WiproJobApplication addJobApplication(WiproJobApplication jobApplication) {
        return repo.save(jobApplication);
    }
}

package com.wipro.JobApplication.controller;

import com.wipro.JobApplication.model.WiproJobApplication;

import com.wipro.JobApplication.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wipro")
public class JobapplicationController {
    @Autowired
    public JobApplicationService service;

    @PostMapping("/addjobapplication")
    public WiproJobApplication addJobApplication(@RequestBody WiproJobApplication jobApplication) {
        return service.addJobApplication(jobApplication);
    }
}

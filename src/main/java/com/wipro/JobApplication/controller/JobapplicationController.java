package com.wipro.JobApplication.controller;

import com.wipro.JobApplication.model.WiproJobApplication;

import com.wipro.JobApplication.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/wipro")
public class JobapplicationController {
    @Autowired
    public JobApplicationService service;

    @PostMapping("/addjobapplication")
    public WiproJobApplication addJobApplication(@RequestBody WiproJobApplication jobApplication) {
        return service.addJobApplication(jobApplication);
    }
    @PostMapping("/addjobapplications")
    public List<WiproJobApplication> addJobApplications(@RequestBody List<WiproJobApplication> jobApplication) {
        return service.addJobApplications(jobApplication);
    }
    @GetMapping("/getjobapplications")
    public List<WiproJobApplication> getJobApplications() {
        return service.getJobApplications();
    }
    @GetMapping("/getjobapplication/{id}")
    public Optional<WiproJobApplication> getJobApplication(@PathVariable int id) {
        return service.getJobApplication(id);
    }
    @DeleteMapping("/deletejobapplication/{id}")
    public String deleteJobApplication(@PathVariable int id) {
        return service.deleteJobApplication(id);
    }
    @PutMapping("/updatejobapplication/{id}")
    public WiproJobApplication updateJobApplication(@PathVariable int id, @RequestBody WiproJobApplication jobApplication) {
        return service.updateJobApplication(id, jobApplication);
    }
}

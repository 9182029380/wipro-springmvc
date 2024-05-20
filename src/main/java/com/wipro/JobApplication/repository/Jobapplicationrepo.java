package com.wipro.JobApplication.repository;

import com.wipro.JobApplication.model.WiproJobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Jobapplicationrepo extends JpaRepository<WiproJobApplication,Integer> {
}

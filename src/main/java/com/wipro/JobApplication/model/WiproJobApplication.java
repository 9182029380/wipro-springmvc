package com.wipro.JobApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobapplicationinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WiproJobApplication {
    @Id
    public int  id;
    public String jobapplicationid;
    public String jobtitle;
    public String jobdescription;
    public String joblocation;
    public String jobtype;
    public String jobcategory;
    public String jobstatus;
    public String jobapplicationstartdate;
    public String jobapplicationenddate;
    public String experience;

}

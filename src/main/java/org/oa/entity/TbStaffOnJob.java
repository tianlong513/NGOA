package org.oa.entity;


import java.util.List;

public class TbStaffOnJob {

    private long id;
    private long archivesId;
    private long jobId;
    private List<TbJob> tbJobs;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getArchivesId() {
        return archivesId;
    }

    public void setArchivesId(long archivesId) {
        this.archivesId = archivesId;
    }


    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public List<TbJob> getTbJobs() {
        return tbJobs;
    }

    public void setTbJobs(List<TbJob> tbJobs) {
        this.tbJobs = tbJobs;
    }
}

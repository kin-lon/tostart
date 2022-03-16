package com.tostart.bean;

import java.util.Date;

public class Project extends ProjectKey {
    private String projectName;

    private String projectTag;

    private String projectContent;

    private String projectStatus;

    private Date projectCreatTime;

    private Date projectStartTime;

    private Date projectEndTime;

    private String projectImg;

    private Integer projectGoal;

    private Integer projectProgress;

    private Integer projectSupport;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectTag() {
        return projectTag;
    }

    public void setProjectTag(String projectTag) {
        this.projectTag = projectTag == null ? null : projectTag.trim();
    }

    public String getProjectContent() {
        return projectContent;
    }

    public void setProjectContent(String projectContent) {
        this.projectContent = projectContent == null ? null : projectContent.trim();
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus == null ? null : projectStatus.trim();
    }

    public Date getProjectCreatTime() {
        return projectCreatTime;
    }

    public void setProjectCreatTime(Date projectCreatTime) {
        this.projectCreatTime = projectCreatTime;
    }

    public Date getProjectStartTime() {
        return projectStartTime;
    }

    public void setProjectStartTime(Date projectStartTime) {
        this.projectStartTime = projectStartTime;
    }

    public Date getProjectEndTime() {
        return projectEndTime;
    }

    public void setProjectEndTime(Date projectEndTime) {
        this.projectEndTime = projectEndTime;
    }

    public String getProjectImg() {
        return projectImg;
    }

    public void setProjectImg(String projectImg) {
        this.projectImg = projectImg == null ? null : projectImg.trim();
    }

    public Integer getProjectGoal() {
        return projectGoal;
    }

    public void setProjectGoal(Integer projectGoal) {
        this.projectGoal = projectGoal;
    }

    public Integer getProjectProgress() {
        return projectProgress;
    }

    public void setProjectProgress(Integer projectProgress) {
        this.projectProgress = projectProgress;
    }

    public Integer getProjectSupport() {
        return projectSupport;
    }

    public void setProjectSupport(Integer projectSupport) {
        this.projectSupport = projectSupport;
    }
}
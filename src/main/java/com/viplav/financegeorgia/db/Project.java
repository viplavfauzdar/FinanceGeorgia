package com.viplav.financegeorgia.db;
// Generated Nov 30, 2013 12:39:55 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Project generated by hbm2java
 */
public class Project  implements java.io.Serializable {


     private ProjectId id;
     private String projectName;
     private String summary;
     private String description;
     private String website;
     private String videoUrl;
     private String image1;
     private String image2;
     private String image3;
     private Integer targetAmount;
     private Integer raisedAmount;
     private Integer commission;
     private Byte approved;
     private Date createdate;
     private Date updatedate;
     private Byte deletedind;
     private String category;

    public Project() {
    }

	
    public Project(ProjectId id) {
        this.id = id;
    }
    public Project(ProjectId id, String projectName, String summary, String description, String website, String videoUrl, String image1, String image2, String image3, Integer targetAmount, Integer raisedAmount, Integer commission, Byte approved, Date createdate, Date updatedate, Byte deletedind, String category) {
       this.id = id;
       this.projectName = projectName;
       this.summary = summary;
       this.description = description;
       this.website = website;
       this.videoUrl = videoUrl;
       this.image1 = image1;
       this.image2 = image2;
       this.image3 = image3;
       this.targetAmount = targetAmount;
       this.raisedAmount = raisedAmount;
       this.commission = commission;
       this.approved = approved;
       this.createdate = createdate;
       this.updatedate = updatedate;
       this.deletedind = deletedind;
       this.category = category;
    }
   
    public ProjectId getId() {
        return this.id;
    }
    
    public void setId(ProjectId id) {
        this.id = id;
    }
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }
    
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
    public String getImage1() {
        return this.image1;
    }
    
    public void setImage1(String image1) {
        this.image1 = image1;
    }
    public String getImage2() {
        return this.image2;
    }
    
    public void setImage2(String image2) {
        this.image2 = image2;
    }
    public String getImage3() {
        return this.image3;
    }
    
    public void setImage3(String image3) {
        this.image3 = image3;
    }
    public Integer getTargetAmount() {
        return this.targetAmount;
    }
    
    public void setTargetAmount(Integer targetAmount) {
        this.targetAmount = targetAmount;
    }
    public Integer getRaisedAmount() {
        return this.raisedAmount;
    }
    
    public void setRaisedAmount(Integer raisedAmount) {
        this.raisedAmount = raisedAmount;
    }
    public Integer getCommission() {
        return this.commission;
    }
    
    public void setCommission(Integer commission) {
        this.commission = commission;
    }
    public Byte getApproved() {
        return this.approved;
    }
    
    public void setApproved(Byte approved) {
        this.approved = approved;
    }
    public Date getCreatedate() {
        return this.createdate;
    }
    
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    public Date getUpdatedate() {
        return this.updatedate;
    }
    
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
    public Byte getDeletedind() {
        return this.deletedind;
    }
    
    public void setDeletedind(Byte deletedind) {
        this.deletedind = deletedind;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }




}



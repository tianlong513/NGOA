package org.oa.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TbArchives {

    private long id;
    private String name;
    private String headPortrait;
    private long sex;
    private String mobile;
    private String email;
    private String diploma;
    private String diplomaPictureUrl;
    private String resumeUrl;
    private String honorUrl;
    private Date createDate;
    private Date rzDate;
//    @JsonIgnore
    private List<TbStaffOnJob> tbStaffOnJobList;
    private List<Object> list = new LinkedList<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }


    public long getSex() {
        return sex;
    }

    public void setSex(long sex) {
        this.sex = sex;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }


    public String getDiplomaPictureUrl() {
        return diplomaPictureUrl;
    }

    public void setDiplomaPictureUrl(String diplomaPictureUrl) {
        this.diplomaPictureUrl = diplomaPictureUrl;
    }


    public String getResumeUrl() {
        return resumeUrl;
    }

    public void setResumeUrl(String resumeUrl) {
        this.resumeUrl = resumeUrl;
    }


    public String getHonorUrl() {
        return honorUrl;
    }

    public void setHonorUrl(String honorUrl) {
        this.honorUrl = honorUrl;
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getRzDate() {
        return rzDate;
    }

    public void setRzDate(Date rzDate) {
        this.rzDate = rzDate;
    }

    public List<TbStaffOnJob> getTbStaffOnJobList() {
        return tbStaffOnJobList;
    }

    public void setTbStaffOnJobList(List<TbStaffOnJob> tbStaffOnJobList) {
        this.tbStaffOnJobList = tbStaffOnJobList;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }
}

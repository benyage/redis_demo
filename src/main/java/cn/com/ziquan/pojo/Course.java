package cn.com.ziquan.pojo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Course {
    private BigDecimal courseid;

    private String coursename;

    private BigDecimal planerid;

    private String planername;

    private String editionname;

    private BigDecimal gradeid;

    private BigDecimal sumhour;

    private String courseintro;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date adddatetime;

    private String creationperson;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date creationdate;

    private String usestatus;

    private String standbyyi;

    private String standbyer;

    private String standbysan;

    public BigDecimal getCourseid() {
        return courseid;
    }

    public void setCourseid(BigDecimal courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public BigDecimal getPlanerid() {
        return planerid;
    }

    public void setPlanerid(BigDecimal planerid) {
        this.planerid = planerid;
    }

    public String getPlanername() {
        return planername;
    }

    public void setPlanername(String planername) {
        this.planername = planername == null ? null : planername.trim();
    }

    public String getEditionname() {
        return editionname;
    }

    public void setEditionname(String editionname) {
        this.editionname = editionname == null ? null : editionname.trim();
    }

    public BigDecimal getGradeid() {
        return gradeid;
    }

    public void setGradeid(BigDecimal gradeid) {
        this.gradeid = gradeid;
    }

    public BigDecimal getSumhour() {
        return sumhour;
    }

    public void setSumhour(BigDecimal sumhour) {
        this.sumhour = sumhour;
    }

    public String getCourseintro() {
        return courseintro;
    }

    public void setCourseintro(String courseintro) {
        this.courseintro = courseintro == null ? null : courseintro.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    public Date getAdddatetime() {
        return adddatetime;
    }

    public void setAdddatetime(Date adddatetime) {
        this.adddatetime = adddatetime;
    }

    public String getCreationperson() {
        return creationperson;
    }

    public void setCreationperson(String creationperson) {
        this.creationperson = creationperson == null ? null : creationperson.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public String getUsestatus() {
        return usestatus;
    }

    public void setUsestatus(String usestatus) {
        this.usestatus = usestatus == null ? null : usestatus.trim();
    }

    public String getStandbyyi() {
        return standbyyi;
    }

    public void setStandbyyi(String standbyyi) {
        this.standbyyi = standbyyi == null ? null : standbyyi.trim();
    }

    public String getStandbyer() {
        return standbyer;
    }

    public void setStandbyer(String standbyer) {
        this.standbyer = standbyer == null ? null : standbyer.trim();
    }

    public String getStandbysan() {
        return standbysan;
    }

    public void setStandbysan(String standbysan) {
        this.standbysan = standbysan == null ? null : standbysan.trim();
    }
}
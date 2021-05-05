
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hoang
 */
@XmlRootElement
@XmlType(propOrder = {"name","jobtitle","birthday","marialStatus","gender","hireDate"})
public class Customer {

    private String name;
    private String jobtitle;
    private String birthday;
    private String marialStatus;
    private String gender;
    private String hireDate;

    public Customer() {
    }

    public Customer(String name, String jobtitle, String birthday, String marialStatus, String gender, String hireDate) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.birthday = birthday;
        this.marialStatus = marialStatus;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    @XmlElement
    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getBirthday() {
        return birthday;
    }

    @XmlElement
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMarialStatus() {
        return marialStatus;
    }

    @XmlElement
    public void setMarialStatus(String marialStatus) {
        this.marialStatus = marialStatus;
    }

    public String getGender() {
        return gender;
    }

    @XmlElement
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHireDate() {
        return hireDate;
    }

    @XmlElement
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

}

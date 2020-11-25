package com.studentadvisor;

import com.google.gson.annotations.SerializedName;

public class AdvisorsPojo {

    @SerializedName("designation")
    private String designation;

    @SerializedName("campus_name")
    private String campus_name;

    @SerializedName("department")
    private String department;

    @SerializedName("location")
    private String location;

    @SerializedName("advisor_name")
    private String advisor_name;

    public String getAdvisor_name() {
        return advisor_name;
    }

    public void setAdvisor_name(String advisor_name) {
        this.advisor_name = advisor_name;
    }


    public String getCampus_name() {
        return campus_name;
    }

    public void setCampus_name(String campus_name) {
        this.campus_name = campus_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }




    public AdvisorsPojo() {

    }
}

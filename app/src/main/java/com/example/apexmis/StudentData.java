package com.example.apexmis;

public class StudentData {
    private String name;
    private String program;
    private String[] email;
    private String section;
    private String[] address;
    private String[] previousSchools;
    private long uniRollNum;
    private String rollNum;
    private String puRegNum;
    private int gender;
    private double[] cGPAs;
    private String[] phoneNum;
    private String[] parentName;
    private String[] parentPhoneNum;

    public StudentData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String[] getEmail() {
        return email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String[] getPreviousSchools() {
        return previousSchools;
    }

    public void setPreviousSchools(String[] previousSchools) {
        this.previousSchools = previousSchools;
    }

    public long getUniRollNum() {
        return uniRollNum;
    }

    public void setUniRollNum(long uniRollNum) {
        this.uniRollNum = uniRollNum;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }

    public String getPuRegNum() {
        return puRegNum;
    }

    public void setPuRegNum(String puRegNum) {
        this.puRegNum = puRegNum;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double[] getcGPAs() {
        return cGPAs;
    }

    public void setcGPAs(double[] cGPAs) {
        this.cGPAs = cGPAs;
    }

    public String[] getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String[] phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String[] getParentName() {
        return parentName;
    }

    public void setParentName(String[] parentName) {
        this.parentName = parentName;
    }

    public String[] getParentPhoneNum() {
        return parentPhoneNum;
    }

    public void setParentPhoneNum(String[] parentPhoneNum) {
        this.parentPhoneNum = parentPhoneNum;
    }
}

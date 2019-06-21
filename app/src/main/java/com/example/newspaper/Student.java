package com.example.newspaper;

public class Student {
    private String name;
    private String id;
    private String dept;
    private String batch;
    private String mobileNumber;
    private int profileImage;


    public Student(String name, String id, String dept, String batch, String mobileNumber, int profileImage) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.batch = batch;
        this.mobileNumber = mobileNumber;
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public String getBatch() {
        return batch;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getProfileImage() {
        return profileImage;
    }
}

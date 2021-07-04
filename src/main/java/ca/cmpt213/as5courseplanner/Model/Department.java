package ca.cmpt213.as5courseplanner.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Department {
    private long deptId;
    private String name;
    List<Course> courses;
//    List<CourseOffering> couseOfferings;


    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        Department comparingObj = (Department) obj;
        if (this.name.equalsIgnoreCase(comparingObj.name)) {
            flag = true;
        }
        return flag;
    }

    public Department(String name) {
        this.deptId = deptId;
        this.name = name;
        this.courses = new ArrayList<>();
//        this.couseOfferings = new ArrayList<>();
    }

    public void initiateOtherData(String[] values) {
        Course course = new Course(values[2]);
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

//    public List<CourseOffering> getCouseOfferings() {
//        return couseOfferings;
//    }
}

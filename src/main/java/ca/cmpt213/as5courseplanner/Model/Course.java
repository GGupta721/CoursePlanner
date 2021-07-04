package ca.cmpt213.as5courseplanner.Model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String catalogNumber;
    private List<CourseOffering> courseOfferings;

    //    Section section;
    //    private long courseID;

    public Course(String catalogNumber) {
//        this.courseID = courseID;
        this.catalogNumber = catalogNumber;
        this.courseOfferings = new ArrayList<>();
//        this.section = new Section(type,capacity,size);
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

//    public long getCourseID() {
//        return courseID;
//    }
//    public void setCourseID(long courseID) {
//        this.courseID = courseID;
//    }
}

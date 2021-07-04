package ca.cmpt213.as5courseplanner.Model;

public class CourseOffering {
    private long courseOfferingId;
    private String location;
    private String instructors;
    private String term;
    private long semesterCode;
    private int year;


    public CourseOffering(long courseOfferingId, String location, String instructors, long semesterCode) {
        this.courseOfferingId = courseOfferingId;
        this.location = location;
        this.instructors = instructors;
        this.semesterCode = semesterCode;
        this.term = termExtractor(semesterCode);
        this.year = yearExtractor(semesterCode);
    }

    private String termExtractor(long semesterId) {
        long term = semesterId % 10;
        if (term == 1) {
            return "Spring";
        }
        else if (term == 4) {
            return "Summer";
        }
        else if (term == 7) {
            return "Fall";
        }
        else{
            return "";
        }

    }

    private int yearExtractor(long semesterId) {
        String ID = String.valueOf(semesterId);
        int firstDigit = Integer.parseInt(String.valueOf(ID.charAt(0)));
        int middleDigit = Integer.parseInt(String.valueOf(+ ID.charAt(1) + ID.charAt(2)));
        int year = 1900 + (100 * firstDigit) + middleDigit;
        return year;
    }


}

package ca.cmpt213.as5courseplanner.controllers;


import ca.cmpt213.as5courseplanner.Model.CSVExtractor;
import ca.cmpt213.as5courseplanner.Model.Department;
import ca.cmpt213.as5courseplanner.wrappers.ApiAboutWrapper;
import ca.cmpt213.as5courseplanner.wrappers.ApiDepartmentWrapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class control {

    ApiAboutWrapper aboutWrapper=new ApiAboutWrapper(" Course Planner "," Saqib & Gaurav ");
    File file = new File("data/course_data_2018.csv");
    CSVExtractor extractor = new CSVExtractor();
    List<ApiDepartmentWrapper> departmentWrapperList;
    Iterator<Department> departmentList;
    AtomicLong nextDeptId = new AtomicLong();





    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/api/about")
    public ApiAboutWrapper About(){
        return aboutWrapper;
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/api/dump-model")
    public void DumpModel(){
    }

    @GetMapping("/api/departments")
    public List<ApiDepartmentWrapper> getDepartmentsList(){
        departmentWrapperList = new ArrayList<>();
        extractor = new CSVExtractor();
        extractor.dataExtractor();
        departmentList = extractor.getDepartmentsDatabase();
        while (departmentList.hasNext()) {
            ApiDepartmentWrapper wrapper = ApiDepartmentWrapper.makeADepartmentWrapper(nextDeptId.incrementAndGet(), departmentList.next().getName());
            departmentWrapperList.add(wrapper);
        }
        return departmentWrapperList;
    }




}

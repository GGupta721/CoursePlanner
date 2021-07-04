package ca.cmpt213.as5courseplanner.wrappers;

public class ApiDepartmentWrapper {
    public long deptId;
    public String name;

    public static ApiDepartmentWrapper makeADepartmentWrapper (long id, String name) {
        ApiDepartmentWrapper wrapper = new ApiDepartmentWrapper();
        wrapper.deptId = id;
        wrapper.name = name;
        return wrapper;
    }
}
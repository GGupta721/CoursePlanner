package ca.cmpt213.as5courseplanner.Model;
import java.io.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

public class CSVExtractor{
    private List<Department> departmentsDatabase;

    public void dataExtractor() {
        File file = new File("data/course_data_2018.csv");

        departmentsDatabase = new ArrayList<Department>() {
            /*@Override
            public boolean contains(Object o) {
                return this.equals(o);
            }*/

            @Override
            public int indexOf(Object o) {
                if (o instanceof String) {
                    for (int i = 0; i < this.size(); i++) {
                        String comparingObj = (String) o;
                        if (comparingObj.equalsIgnoreCase(departmentsDatabase.get(i).getName())) {
                            return i;
                        }
                    }
                }
                return -1;
            }
        };

        String[] values;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader inputStream = new BufferedReader(fileReader);
            String line = inputStream.readLine();
            while ((line = inputStream.readLine()) != null) {
                values = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                int indexOfDept = departmentsDatabase.indexOf(values[1]);
                System.out.println(line);
                if (indexOfDept > -1) {
                    Department departmentToAdd = departmentsDatabase.get(indexOfDept);
                } else {
                    Department departmentToAdd = new Department(values[1]);
//                    departmentToAdd.initiateOtherData(values);

                    departmentsDatabase.add(departmentToAdd);
                }
            }
            inputStream.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Iterator<Department> getDepartmentsDatabase() {
        Iterator<Department> departmentIterator = departmentsDatabase.iterator();
        return departmentIterator;
    }
}

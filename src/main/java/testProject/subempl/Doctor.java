package testProject.subempl;

import testProject.Parrent.Employee;

public class Doctor extends Employee {
       private  int mCategory;

    public Doctor(String fullName, long date, long salary, int category) {
        super(fullName, date, salary);
        mCategory = category;
    }


}

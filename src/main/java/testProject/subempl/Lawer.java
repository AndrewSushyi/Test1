package testProject.subempl;

import testProject.Parrent.Employee;

public class Lawer extends Employee {
    private String mDepartment;

    public Lawer(String fullName, long date, long salary, String
                  department) {
        super(fullName, date, salary);
        mDepartment = department;
    }
}

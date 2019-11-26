package testProject.Parrent;

public class Employee {
    private String mFulllName;
    private long mEmploymentDate;
    private long mSalary;

    public Employee (String fullName, long date, long salary){
        mFulllName = fullName;
        mEmploymentDate = date;
        mSalary = salary;
    }

    public double getSalaryUah(){
        return mSalary;
    }
    public void setSalary(int newsalary) {
        mSalary = newsalary;
        System.out.println("newSalary =" + newsalary);
    }
}

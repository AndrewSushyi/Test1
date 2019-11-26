package testProject;

import testProject.subempl.Doctor;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Doctor stomatolog = new Doctor("Jek", 11, 10, 2);
        stomatolog.setSalary(15);
        System.out.println(stomatolog.getSalaryUah());
    }
}

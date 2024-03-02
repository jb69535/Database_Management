package uga.edu.project2_Beom_Czech_Hwang.model;

public class Employee {
    private int empNo;
    private String firstName;
    private String lastName;
    private int deptNo;

    // Constructor
    public Employee(int empNo, String firstName, String lastName, int deptNo) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNo = deptNo;
    }

    // Getters
    public int getEmpNo() { 
        return empNo; 
    }
    public String getFirstName() { 
        return firstName; 
    }
    public String getLastName() { 
        return lastName; 
    }
    public int getDeptNo() { 
        return deptNo; 
    }

}

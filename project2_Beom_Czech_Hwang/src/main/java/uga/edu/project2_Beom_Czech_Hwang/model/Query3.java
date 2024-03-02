package uga.edu.project2_Beom_Czech_Hwang.model;

/**
 * Represents the result of a query that provides information about departments,
 * including their code, name, the start of the decade, the number of employees,
 * and the average salary within the department.
 * This class is designed to encapsulate data related to departmental statistics over a decade.
 */
public class Query3 {
    private String deptNo;
    private String deptName;
    private int decadeStart;
    private int numberOfEmployees;
    private double averageSalary;

    /**
     * Constructs a new Query3 object with the specified department number, department name, 
     * start of the decade, number of employees, and average salary.
     * 
     * @param deptNo The unique identifier for the department.
     * @param deptName The name of the department.
     * @param decadeStart The year marking the start of the decade for the data.
     * @param numberOfEmployees The total number of employees in the department.
     * @param averageSalary The average salary of employees in the department.
     */
    public Query3(String deptNo, String deptName, int decadeStart, int numberOfEmployees, 
    double averageSalary) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.decadeStart = decadeStart;
        this.numberOfEmployees = numberOfEmployees;
        this.averageSalary = averageSalary;
    }

    /**
     * Returns the department number.
     * 
     * @return The unique identifier for the department.
     */
    public String getDeptNo() {
        return deptNo;
    }

    /**
     * Returns the department name.
     * 
     * @return The name of the department.
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * Returns the year marking the start of the decade for the data.
     * 
     * @return The start year of the decade.
     */
    public int getDecadeStart() {
        return decadeStart;
    }

    /**
     * Returns the total number of employees in the department.
     * 
     * @return The number of employees.
     */
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Returns the average salary of employees in the department.
     * 
     * @return The average salary.
     */
    public double getAverageSalary() {
        return averageSalary;
    }
}

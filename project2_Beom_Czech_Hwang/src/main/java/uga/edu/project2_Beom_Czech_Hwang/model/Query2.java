package uga.edu.project2_Beom_Czech_Hwang.model;

/**
 * Represents the result of a query that retrieves employee information, including full name,
 * department name, and duration of employment.
 * This class encapsulates the data fetched from a query aimed at showing how long employees
 * have been working in their respective departments.
 */
public class Query2 {
    private String fullName;
    private String deptName;
    private int howLong;

    /**
     * Constructs a new Query2 object with the specified full name, department name, and duration of employment.
     * 
     * @param fullName The full name of the employee.
     * @param deptName The name of the department where the employee works.
     * @param howLong The duration (in years) the employee has worked in the department.
     */
    public Query2(String fullName, String deptName, int howLong) {
        this.fullName = fullName;
        this.deptName = deptName;
        this.howLong = howLong;
    }

    /**
     * Returns the full name of the employee.
     * 
     * @return The employee's full name.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Returns the name of the department where the employee works.
     * 
     * @return The department name.
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * Returns the duration (in years) the employee has worked in the department.
     * 
     * @return The number of years the employee has been in the department.
     */
    public int getHowLong() {
        return howLong;
    }
}

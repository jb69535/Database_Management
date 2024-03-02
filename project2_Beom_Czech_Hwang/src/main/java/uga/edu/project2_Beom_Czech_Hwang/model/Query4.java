package uga.edu.project2_Beom_Czech_Hwang.model;

/**
 * Represents a query result that contains an employee's full name and their employee number.
 * This class is designed to encapsulate the data fetched from a query aimed at identifying
 * employees by their unique number and full name.
 */
public class Query4 {
    private String fullName;
    private int empNumber;

    /**
     * Constructs a new Query4 object with the specified full name and employee number.
     * 
     * @param fullName The full name of the employee.
     * @param empNumber The unique employee number assigned to the individual.
     */
    public Query4(String fullName, int empNumber) {
        this.fullName = fullName;
        this.empNumber = empNumber;
    }

    /**
     * Returns the full name of the employee.
     * 
     * @return The full name of the employee.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Returns the unique employee number of the individual.
     * 
     * @return The employee number.
     */
    public int getEmpNumber() {
        return empNumber;
    }
}

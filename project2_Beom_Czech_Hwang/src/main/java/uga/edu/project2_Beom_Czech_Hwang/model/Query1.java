package uga.edu.project2_Beom_Czech_Hwang.model;

/**
 * Represents a query result with a department name and a corresponding ratio.
 * This class is used to encapsulate the data retrieved from a specific query
 * that calculates ratios for departments.
 */
public class Query1 {

    private String deptName;
    private Double ratio;

    /**
     * Constructs a new Query1 object with specified department name and ratio.
     * 
     * @param deptName The name of the department.
     * @param ratio    The calculated ratio for the department.
     */
    public Query1(String deptName, Double ratio) {
        this.deptName = deptName;
        this.ratio = ratio;
    }

    /**
     * Returns the name of the department.
     * 
     * @return The department name.
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * Sets the name of the department.
     * 
     * @param deptName The department name to set.
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * Returns the ratio for the department.
     * 
     * @return The department ratio.
     */
    public Double getRatio() {
        return ratio;
    }

    /**
     * Sets the ratio for the department.
     * 
     * @param ratio The ratio to set.
     */
    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }
}

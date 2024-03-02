package uga.edu.project2_Beom_Czech_Hwang.model;

/**
 * Represents the result of a query that includes information about three employees and their respective departments.
 * This class encapsulates the data fetched from a query aimed at identifying employees across different departments,
 * including their employee numbers, names, and department codes.
 */
public class Query6 {
    private int empNo;
    private String e1Name;
    private String d1;
    private int empNo3;
    private String e3Name;
    private String d2;
    private int empNo2;
    private String e2Name;

    /**
     * Constructs a new Query6 object with specified details for three employees and their departments.
     * 
     * @param empNo The employee number of the first employee.
     * @param e1Name The name of the first employee.
     * @param d1 The code of the department for the first employee.
     * @param empNo3 The employee number of the third employee.
     * @param e3Name The name of the third employee.
     * @param d2 The code of the department for the third employee.
     * @param empNo2 The employee number of the second employee.
     * @param e2Name The name of the second employee.
     */
    public Query6(int empNo, String e1Name, String d1, int empNo3, String e3Name, String d2, int empNo2, String e2Name) {
        this.empNo = empNo;
        this.e1Name = e1Name;
        this.d1 = d1;
        this.empNo3 = empNo3;
        this.e3Name = e3Name;
        this.d2 = d2;
        this.empNo2 = empNo2;
        this.e2Name = e2Name;
    }

    // Getters
    public int getEmpNo() { 
        return empNo; 
    }
    public int getEmpNo2() { 
        return empNo2; 
    }
    public int getEmpNo3() { 
        return empNo3; 
    }
    public String getE1Name() { 
        return e1Name; 
    }
    public String getE2Name() { 
        return e2Name; 
    }
    public String getD1() { 
        return d1; 
    }
    public String getD2() { 
        return d2; 
    }
    public String getE3Name() { 
        return e3Name; 
    }
}

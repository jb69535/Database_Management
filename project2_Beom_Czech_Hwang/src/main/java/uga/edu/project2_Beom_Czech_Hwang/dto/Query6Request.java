package uga.edu.project2_Beom_Czech_Hwang.dto;

public class Query6Request {
    private String name1;
    private String name2;

    // Default constructor
    public Query6Request() {
    }

    // Constructor with parameters
    public Query6Request(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    // Getters and setters
    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}

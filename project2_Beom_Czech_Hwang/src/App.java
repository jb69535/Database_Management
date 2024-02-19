package project2_Beom_Czech_Hwang.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        // Update the database URL, user, and password with your MySQL database credentials
        String databaseUrl = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "Junmysql99@";
        
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(databaseUrl, user, password);
            
            // Create a statement to execute SQL queries
            Statement statement = connection.createStatement();
            
            // Write your SQL query here
            String sqlQuery = "SELECT * FROM your_table_name";
            
            // Execute the query and get the result set
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            // Iterate through the result set and print each record
            while (resultSet.next()) {
                // Replace 'column_name' with the actual column names from your table
                String exampleColumn = resultSet.getString("column_name");
                System.out.println(exampleColumn);
            }
            
            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

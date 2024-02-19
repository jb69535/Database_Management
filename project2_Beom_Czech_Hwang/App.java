import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
            String sqlQuery = "SELECT * FROM employees";
            
            // Execute the query and get the result set
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            // Get metadata about the result set (e.g., column names)
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            // Print column names
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();
            
            // Iterate through the result set and print each record
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
                System.out.println();
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

package uga.edu.project2_Beom_Czech_Hwang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import java.util.List;

import uga.edu.project2_Beom_Czech_Hwang.model.*;

/**
 * Service layer responsible for executing queries related to employees and departments.
 * It utilizes the JdbcTemplate to interact with the database and fetch results as per various query requirements.
 */
@Service
public class EmployeeService {

        private final JdbcTemplate jdbcTemplate;

        /**
         * Constructs an EmployeeService with a JdbcTemplate.
         * 
         * @param jdbcTemplate The JdbcTemplate used for database operations.
         */
        @Autowired
        public EmployeeService(JdbcTemplate jdbcTemplate) {
                this.jdbcTemplate = jdbcTemplate;
        }

        /**
         * Fetches results for Query1 from the database.
         * 
         * @return A list of Query1 objects containing department names and their corresponding ratios.
         * @throws IOException If there is an error reading the SQL file.
         */
        public List<Query1> getQuery1Results() throws IOException {
                String sql = new String(StreamUtils.copyToByteArray(
                                new ClassPathResource("problem1.sql").getInputStream()), StandardCharsets.UTF_8);

                return jdbcTemplate.query(sql, (rs, rowNum) -> new Query1(
                                rs.getString("dept_name"),
                                rs.getDouble("ratio")));
        }

        /**
         * Fetches results for Query2 from the database.
         * 
         * @return A list of Query2 objects containing full names, department names, and duration of employment.
         * @throws IOException If there is an error reading the SQL file.
         */
        public List<Query2> getQuery2Results() throws IOException {
                String sql = new String(StreamUtils.copyToByteArray(
                                new ClassPathResource("problem2.sql").getInputStream()), StandardCharsets.UTF_8);

                return jdbcTemplate.query(sql, (rs, rowNum) -> new Query2(
                                rs.getString("full_name"),
                                rs.getString("dept_name"),
                                rs.getInt("how_long")));
        }

        /**
         * Fetches results for Query3 from the database.
         * 
         * @return A list of Query3 objects detailing departments, the start of the decade, number of employees, and average salaries.
         * @throws IOException If there is an error reading the SQL file.
         */
        public List<Query3> getQuery3Results() throws IOException {
                String sql = new String(StreamUtils.copyToByteArray(
                                new ClassPathResource("problem3.sql").getInputStream()), StandardCharsets.UTF_8);

                return jdbcTemplate.query(sql, (rs, rowNum) -> new Query3(
                                rs.getString("dept_no"),
                                rs.getString("dept_name"),
                                rs.getInt("decade_start"),
                                rs.getInt("number_of_employees"),
                                rs.getDouble("average_salary")));
        }

        /**
         * Fetches results for Query4 from the database.
         * 
         * @return A list of Query4 objects containing employee full names and numbers.
         * @throws IOException If there is an error reading the SQL file.
         */
        public List<Query4> getQuery4Results() throws IOException {
                String sql = new String(StreamUtils.copyToByteArray(
                                new ClassPathResource("problem4.sql").getInputStream()), StandardCharsets.UTF_8);

                return jdbcTemplate.query(sql, (rs, rowNum) -> new Query4(
                                rs.getString("full_name"),
                                rs.getInt("emp_no")));
        }

        /**
         * Fetches results for Query5 based on provided names.
         * 
         * @param firstName1 First name of the first employee.
         * @param lastName1 Last name of the first employee.
         * @param firstName2 First name of the second employee.
         * @param lastName2 Last name of the second employee.
         * @return A list of Query5 objects containing information about two specified employees and their department.
         * @throws IOException If there is an error reading the SQL file.
         */
        @SuppressWarnings("deprecation")
        public List<Query5> getQuery5Results(String firstName1, String lastName1, String firstName2, String lastName2)
                        throws IOException {
                String sql = new String(StreamUtils.copyToByteArray(
                                new ClassPathResource("problem5.sql").getInputStream()), StandardCharsets.UTF_8);

                return jdbcTemplate.query(sql, new Object[] { firstName1, lastName1, firstName2, lastName2 },
                                (rs, rowNum) -> new Query5(
                                                rs.getInt("emp_no1"),
                                                rs.getString("emp_name1"),
                                                rs.getString("dept_no"),
                                                rs.getString("dept_name"),
                                                rs.getInt("emp_no2"),
                                                rs.getString("emp_name2")));
        }

        /**
         * Fetches results for Query6 based on provided names.
         * 
         * @param firstName1 First name of the first employee.
         * @param lastName1 Last name of the first employee.
         * @param firstName2 First name of the second employee.
         * @param lastName2 Last name of the second employee.
         * @return A list of Query6 objects containing information about three employees across two departments.
         * @throws IOException If there is an error reading the SQL file.
         */
        @SuppressWarnings("deprecation")
        public List<Query6> getQuery6Results(String firstName1, String lastName1, String firstName2, String lastName2)
                        throws IOException {
                String sql = new String(StreamUtils.copyToByteArray(
                                new ClassPathResource("problem6.sql").getInputStream()), StandardCharsets.UTF_8);

                return jdbcTemplate.query(sql, new Object[] { firstName1, lastName1, firstName2, lastName2 },
                                (rs, rowNum) -> new Query6(
                                                rs.getInt("E1"),
                                                rs.getString("E1_name"),
                                                rs.getString("D1"),
                                                rs.getInt("E3"),
                                                rs.getString("E3_name"),
                                                rs.getString("D2"),
                                                rs.getInt("E2"),
                                                rs.getString("E2_name")));
        }

}

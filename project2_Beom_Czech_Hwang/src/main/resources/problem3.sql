-- problem3.sql

SELECT 
	d.dept_no,
    d.dept_name,
    FLOOR(YEAR(e.birth_date) / 10) * 10 AS decade_start,
    COUNT(*) AS number_of_employees,
    AVG(s.salary) AS average_salary
FROM departments d
JOIN dept_emp de ON d.dept_no = de.dept_no
JOIN employees e ON de.emp_no = e.emp_no
JOIN salaries s ON e.emp_no = s.emp_no
WHERE s.to_date > NOW() 
GROUP BY d.dept_no,d.dept_name, decade_start
ORDER BY d.dept_no,d.dept_name, decade_start;
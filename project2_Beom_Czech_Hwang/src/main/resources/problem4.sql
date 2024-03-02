SELECT DISTINCT e.emp_no, CONCAT(e.first_name, ' ', e.last_name) AS full_name
FROM employees e
JOIN titles t ON e.emp_no = t.emp_no
JOIN salaries s ON e.emp_no = s.emp_no
WHERE e.gender = 'F'
    AND e.birth_date < '1990-01-01'
    AND s.salary > 80000
    AND t.title = 'Manager';

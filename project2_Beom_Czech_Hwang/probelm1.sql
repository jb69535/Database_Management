SELECT departments.dept_name, 
       (SUM(IF(employees.gender = 'F', salaries.salary, 0)) / COUNT(IF(employees.gender = 'F', 1, NULL))) / 
       (SUM(IF(employees.gender = 'M', salaries.salary, 0)) / COUNT(IF(employees.gender = 'M', 1, NULL))) AS ratio
FROM departments 
JOIN dept_emp  ON departments.dept_no = dept_emp.dept_no
JOIN employees ON dept_emp.emp_no = employees.emp_no
JOIN salaries  ON employees.emp_no = salaries.emp_no
WHERE dept_emp.to_date > NOW() AND salaries.to_date > NOW()  
GROUP BY departments.dept_no
ORDER BY ratio DESC
LIMIT 100;
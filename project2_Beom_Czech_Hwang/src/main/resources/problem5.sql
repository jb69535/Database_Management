-- query5

SELECT 
  e1.emp_no AS emp_no1,
  CONCAT(e1.first_name, ' ', e1.last_name) AS emp_name1,
  d1.dept_no, 
  d1.dept_name,
  e2.emp_no AS emp_no2,
  CONCAT(e2.first_name, ' ', e2.last_name) AS emp_name2
FROM 
  employees e1
JOIN 
  dept_emp de1 ON e1.emp_no = de1.emp_no
JOIN 
  departments d1 ON de1.dept_no = d1.dept_no
JOIN 
  dept_emp de2 ON d1.dept_no = de2.dept_no
JOIN 
  employees e2 ON de2.emp_no = e2.emp_no
WHERE 
  e1.first_name = ? 
  AND e1.last_name = ? 
  AND e2.first_name = ? 
  AND e2.last_name = ?
  AND de1.from_date <= de2.to_date 
  AND de1.to_date >= de2.from_date;




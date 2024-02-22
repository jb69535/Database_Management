-- from get_input_from_name_p6, get two input for @Emp1, @Emp2

SET @Emp1 = 13141;
SET @Emp2 = 13111;

SELECT 
  e1.emp_no AS 'E1',
  concat(e1.first_name, " ",e1.last_name) as E1_name,
  de1.dept_no AS 'D1',
  e3.emp_no AS 'E3',
  concat(e3.first_name, " ",e3.last_name) as E3_name,
  de2.dept_no AS 'D2', 
  e2.emp_no AS 'E2',
  concat(e2.first_name, " ",e2.last_name) as E2_name
FROM employees e1 
JOIN dept_emp de1 ON e1.emp_no = de1.emp_no
JOIN dept_emp de3_1 ON de1.dept_no = de3_1.dept_no AND de3_1.emp_no <> @Emp1 AND de1.from_date <= de3_1.to_date AND de1.to_date >= de3_1.from_date
JOIN employees e3 ON de3_1.emp_no = e3.emp_no
JOIN dept_emp de3_2 ON e3.emp_no = de3_2.emp_no AND de3_2.dept_no <> de1.dept_no
JOIN dept_emp de2 ON de3_2.dept_no = de2.dept_no AND de2.emp_no <> e3.emp_no AND de3_2.from_date <= de2.to_date AND de3_2.to_date >= de2.from_date
JOIN employees e2 ON de2.emp_no = e2.emp_no 
WHERE e1.emp_no = @Emp1 AND e2.emp_no = @Emp2
ORDER BY de1.dept_no, e3.emp_no, de2.dept_no
LIMIT 100;

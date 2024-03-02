SELECT 
    d.dept_name, 
    ROUND(
        (SUM(IF(e.gender = 'F', s.salary, 0)) / COUNT(IF(e.gender = 'F', 1, NULL))) / 
        (SUM(IF(e.gender = 'M', s.salary, 0)) / COUNT(IF(e.gender = 'M', 1, NULL))),
        8
    ) AS ratio
FROM 
    departments d
JOIN 
    dept_emp de ON d.dept_no = de.dept_no
JOIN 
    employees e ON de.emp_no = e.emp_no
JOIN 
    salaries s ON e.emp_no = s.emp_no
WHERE 
    de.to_date > NOW() AND s.to_date > NOW()
GROUP BY 
    d.dept_no
HAVING 
    ratio = (
        SELECT 
            MAX(ratio)
        FROM (
            SELECT 
                d.dept_no,
                ROUND(
                    (SUM(IF(e.gender = 'F', s.salary, 0)) / COUNT(IF(e.gender = 'F', 1, NULL))) / 
                    (SUM(IF(e.gender = 'M', s.salary, 0)) / COUNT(IF(e.gender = 'M', 1, NULL))),
                    8
                ) AS ratio
            FROM 
                departments d
            JOIN 
                dept_emp de ON d.dept_no = de.dept_no
            JOIN 
                employees e ON de.emp_no = e.emp_no
            JOIN 
                salaries s ON e.emp_no = s.emp_no
            WHERE 
                de.to_date > NOW() AND s.to_date > NOW()
            GROUP BY 
                d.dept_no
        ) AS subquery
    );

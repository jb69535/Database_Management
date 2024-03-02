-- problem2.sql

SELECT 
  CONCAT(e.first_name, ' ', e.last_name) AS full_name,
  d.dept_name,
  de.*,
  DATEDIFF(
    CASE WHEN de.to_date = '9999-01-01' THEN CURRENT_DATE ELSE de.to_date END,
    de.from_date
  ) AS how_long
FROM dept_emp de
JOIN employees e ON de.emp_no = e.emp_no
JOIN departments d ON de.dept_no = d.dept_no
WHERE 
  DATEDIFF(
    CASE WHEN de.to_date = '9999-01-01' THEN CURRENT_DATE ELSE de.to_date END,
    de.from_date
  ) = (
    -- Find the longest tenure
    SELECT MAX(DATEDIFF(
      CASE WHEN to_date = '9999-01-01' THEN CURRENT_DATE ELSE to_date END,
      from_date
    ))
    FROM dept_emp
  );

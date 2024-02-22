-- get intup from typing to problem 6
-- return emp_no

SET @Ename = 'Georgi Facello'; -- emp_no: 13141:

select concat(E1.first_name, " ",E1.last_name) as full_name
		, emp_no 
FROM employees E1
WHERE concat(E1.first_name, " ",E1.last_name) = @Ename
order by emp_no;


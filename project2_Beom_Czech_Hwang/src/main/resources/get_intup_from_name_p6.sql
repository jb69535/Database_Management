-- get intup from typing to problem 6
-- return emp_no

SET @Ename = 'Georgi Facello';
-- '13141', 'Guther Holburn', 'd004', '10529', 'Ymte Yetto', 'd005', '13111', 'Anwar Krybus'

SELECT concat(E1.first_name, " ",E1.last_name) as full_name
		, emp_no 
FROM employees E1
WHERE concat(E1.first_name, " ",E1.last_name) = @Ename
ORDER BY emp_no;


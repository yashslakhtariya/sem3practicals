select dep_id,count(dep_id) from emp_mstr group by dep_id; 

select job_name, count(job_name) as 'NO.' from emp_mstr group by job_name;

select emp_name from emp_mstr group by emp_name having sum(salary)>2000; 

select count(*) from emp_mstr where hire_date > '1991-04-03'; 

select dep_id,count() as 'No. of Employees' from emp_mstr group by dep_id order by count() desc; 

select dep_id,count(*) as 'Total no. of Employees' from emp_mstr group by dep_id having count(dep_id) > 3; 

select dep_id,sum(salary) from emp_mstr group by dep_id; 

select dep_id,count(*) as 'No. of employees' from emp_mstr where emp_name like '%n' group by dep_id; 

select dep_id,count(*) as 'No. of employees' from emp_mstr where emp_name like '%a%' group by dep_id; 

select count(distinct(emp_name)) as 'No. of Employees with Salary greater than their department average' from emp_mstr e where salary > (select avg(salary) from emp_mstr e2 where e2.dep_id = e.dep_id) group by dep_id; 

select count(*),dep_id from emp_mstr group by dep_id having count(dep_id)>3;

select dep_id,avg(salary) from emp_mstr group by dep_id; 

select emp_name, dep_id, salary from emp_mstr where salary in (select max(salary) from emp_mstr group by dep_id); 

select emp_name, dep_id, salary from emp_mstr where salary in (select min(salary) from emp_mstr group by dep_id);
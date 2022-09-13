select * from EMP_MSTR;

select dep_id,count(*) as Total_emp from EMP_MSTR group by dep_id;

select dep_id,count(distinct job_name)as No_of_Job from EMP_MSTR group by dep_id;

select distinct emp_name, salary from EMP_MSTR having salary>2000;

select count(*) from EMP_MSTR where hire_date>"1991-04-03";

select job_name,count(job_name) from EMP_MSTR group by job_name order by count(job_name) desc;

select dep_id,count(*) from EMP_MSTR group by dep_id having count(*)>3;

select dep_id,sum(salary) from EMP_MSTR group by dep_id;

select dep_id,count(emp_name) from EMP_MSTR where emp_name like '%n' group by dep_id;

select dep_id,count(emp_name) from EMP_MSTR where emp_name like '%a%' group by dep_id;

select dep_id,count(emp_name) from EMP_MSTR where salary > (select avg(salary) from EMP_MSTR) group by dep_id;

select dep_id,count(emp_name) from EMP_MSTR group by dep_id having count(emp_name)>2 order by dep_id desc;

select dep_id,avg(salary) as Avg_sal from EMP_MSTR group by dep_id;

select dep_id,max(salary) from EMP_MSTR group by dep_id;

select dep_id,min(salary) from EMP_MSTR group by dep_id;
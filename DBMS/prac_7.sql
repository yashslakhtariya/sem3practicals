select employee.ename,company,department,salary from employee inner join works on employee.ename = works.ename; -- 1

select employee.ename,company,department,salary,city from works inner join employee on employee.ename = works.ename and works.company = 'microsoft'; -- 2

select employee.ename,company,department,salary,city from works inner join employee on employee.ename = works.ename and works.company = 'microsoft' and salary>55000; -- 3

select employee.ename,company,department,salary from works inner join employee on employee.ename = works.ename and salary>50000; -- 4

select ename from employee where city = 'Bangalore '; -- 5

select employee.ename,company,department,salary,city from works inner join employee on employee.ename = works.ename and salary<50000 and employee.city = 'Bangalore '; -- 6

select avg(salary) from works inner join employee on employee.ename = works.ename and employee.Department = 'Account'; -- 7

select avg(salary) from works inner join employee on employee.ename = works.ename and employee.city= 'Pune'; -- 8

select works.ename,salary from works inner join employee on employee.ename = works.ename and employee.city= 'hydrabad'; -- 9

select works.ename from works inner join employee on employee.ename = works.ename and employee.city= 'Pune'; -- 10

select works.ename,company,city from works inner join employee on employee.ename = works.ename and Department = 'Sales'; -- 11

select avg(salary),department from works inner join employee on employee.ename = works.ename group by employee.department; -- 12

select avg(salary),city from works inner join employee on employee.ename = works.ename group by employee.city; -- 13

select count(distinct(department)) from works inner join employee on employee.ename = works.ename where company = 'Infosys'; -- 14

select works.ename,salary from works inner join employee on employee.ename = works.ename and employee.city= 'Pune'; -- 15 

select department,max(salary) from works inner join employee on employee.ename = works.ename group by department; -- 16

select works.ename from works inner join employee on employee.ename = works.ename where city = 'Bangalore '; -- 17

select count(*) from works inner join employee on employee.ename = works.ename where city = 'Bangalore ' and company = 'TCS'; -- 18
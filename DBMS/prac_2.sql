select C_Name from client_info;

select C_Name,City from client_info;

select Descriptionn from product_info;

select C_Name from client_info where City="Bombay";

select S_name from salesman_info where Sal_amnt=3000;

select distinct City from client_info;

select * from product_info order by sell_price;

select * from product_info order by sell_price, cost_price;

select Product_no,Descriptionn from product_info order by sell_price desc;

update client_info set City="Bombay"  where Client_no="C002";
select Client_no,City from client_info where Client_no="C002";

update client_info set bal_due=1000 where Client_no="C001";
select Client_no,bal_due from client_info where Client_no="C001";

update product_info set cost_price=950.00 where Descriptionn="Webcams";
select Descriptionn , cost_price from product_info where Descriptionn="Webcams";

update salesman_info set City="Mumbai";
select City from salesman_info;

delete from salesman_info where Sal_amnt=3500;
select * from salesman_info;

delete from product_info where qty_on_hand=100;
select * from product_info;

delete from client_info where State="Tamil Nadu";
select * from client_info;

alter table client_info add telephone numeric(10);
desc client_info;

alter table product_info modify sell_price numeric(10,2);
desc product_info;

alter table client_info rename column telephone to contact;	
desc client_info;

alter table client_info drop column contact;
desc client_info;

create table employee( ID varchar(6), Name varchar(20), Contact decimal(10), City varchar(20));
insert into employee values("E001","Yash",6351573711,"Vrindavana");
insert into employee values("E002","Yash2",1234567890,"Mayapur");
insert into employee values("E003","Yash3",0123456789,"Haridwar");
insert into employee values("E004","Yash4",9876543210,"Jagannath Puri");
insert into employee values("E005","Yash5",0987654321,"Dwarka");
select * from employee;

drop table employee;
show tables;

rename table salesman_info to sman_mast;
show tables;
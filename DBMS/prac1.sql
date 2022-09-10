create table client_info(Client_no varchar(6), C_Name char(20), City varchar(15), Pincode numeric(8), State varchar(15),Bal_due numeric(10,2), Date_of_commencement Date);
create table product_info(Product_no varchar(20), Descriptionn varchar(50), P_percent numeric(4,2), U_measure varchar(20), Qty_on_hand numeric(8), Reorder_lvl numeric(8), Sell_price numeric(8,2), Cost_price numeric(8,2));
create table salesman_info(S_no varchar(6), S_name varchar(20), Mobile_Number numeric(10), City varchar(20), Pincode numeric(8), State varchar(20), Sal_amnt numeric(8,2), Tgt_to_get numeric(6,2), Ytd_sales numeric(6,2), Remarks varchar(12));

desc client_info;
desc product_info;
desc salesman_info;

insert into client_info values("C001", 'Ivan', "Bombay", 400054, "Maharashtra", 15000, '20210104');
insert into client_info values("C002", 'Vandana', "Madras", 780001, "Tamil Nadu", 0, '20210106');
insert into client_info values("C003", 'Pramada', "Bombay", 400057, "Maharashtra", 5000, '20210107');
insert into client_info values("C004", 'Basu', "Bombay", 400056, "Maharashtra", 0, '20210109');
insert into client_info values("C005", 'Ravi', "Delhi", 100001, "Gujarat", 2000, '20210111');
insert into client_info values("C006", 'Rukmani', "Bombay", 400050, "Maharashtra", 0, '20210112');

insert into product_info values("P001", "Sound card", 5, "Piece", 100, 20, 525, 500);
insert into product_info values("P002", "Monitor", 6, "Piece", 10, 3, 12000, 11280);
insert into product_info values("P003", "Mouse", 5, "Piece", 20, 5, 1050, 1000);
insert into product_info values("P004", "Networking Devices", 5, "Piece", 100, 20, 525, 500);
insert into product_info values("P005", "Keyboards", 2, "Piece", 10, 3, 3150, 3050);
insert into product_info values("P006", "webcams", 6, "Piece", 10, 3, 5250, 5100);
insert into product_info values("P007", "External_devices", 4, "Piece", 64, 20, 90, 420);

insert into salesman_info values("S001", "Kiran", 9406758943, "ahmedabad", 380015, "Gujarat", 3000, 100, 50,"Excellent");
insert into salesman_info values("S002", "Manish", 7865463728, "baroda", 400001, "Gujarat", 3000, 200, 100,"Good");
insert into salesman_info values("S003", "Ravi", 9878905467, "surat", 300032, "Gujarat", 3000, 200, 100,"Average");
insert into salesman_info values("S004", "Ashish", 7987092134, "Rajkot", 600044, "Gujarat", 3500, 200, 150,"Good");

select * from client_info;
select Product_no,Sell_price,Cost_price from product_info;
select S_no, S_name, Remarks, Sal_amnt from salesman_info;

show tables;

create table Student(Rollno varchar(4) NOT NULL PRIMARY KEY CHECK (Rollno like 'S%') ,
				Name varchar(20) NOT NULL,
                    Email varchar(20) UNIQUE,
                    Specialization varchar(5) CHECK (Specialization in ('CBA', 'BDA', 'CS')),
                    Age int CHECK (Age between 16 and 25),
                    City varchar(20),
                    Pincode decimal(8),
                    State varchar(20) DEFAULT 'Gujarat'
                    );
                               
insert into Student values('S001', 'Madhav', 'Madhav@gmail.com', 'BDA', 18, 'Vrindavana' ,395008, 'UP');
insert into Student values('S002', 'Gopal', 'Gopal@gmail.com', 'CS', 18 ,'Vrindavana', 400001 ,'UP');
insert into Student values('S003', 'Chaitanya', 'Chaitanya@gmail.com', 'CS', 20 ,'Mayapur', 380006, 'West Bengal');
insert into Student values('S004', 'Ranchod', 'Ranchod@gmail.com', 'CBA', 21 ,'Dakor', 380006, 'Gujarat');
insert into Student values('S005', 'Govind', 'Govind@gmail.com', 'BDA', 19 ,'Gokul' ,391510 ,'UP');
insert into Student values('S006', 'Keshav', 'Keshav@gmail.com' ,'CBA' ,19 ,'Dwarka' ,360001 ,'Gujarat');
insert into Student values('S007' ,'Yogeshwara' ,'Yogeshwara@gmail.com' ,'BDA', 18 ,'Haridwar' ,560063, 'Uttarakhand');
desc Student;
select * from Student;

create table Instructor(Instructor_ID varchar(4) NOT NULL PRIMARY KEY CHECK(Instructor_ID like 'I%'),
				Instructor_Name varchar(20) NOT NULL,
				Experience float CHECK (Experience > 0),
                Course_Taught int CHECK (Course_Taught > 0) 
                );
                        
insert into Instructor values('I001', 'Krishna Yadav', 5, 5);
insert into Instructor values('I002', 'Ram Raghav' ,7 ,12);
insert into Instructor values('I003' ,'Nityananda Ram', 6.5 ,6);
insert into Instructor values('I004' ,'Gauranga', 8.5 ,15);

desc Instructor;
select * from Instructor;

create table Course (Course_ID varchar(4) NOT NULL PRIMARY KEY CHECK (Course_ID like 'C%'),
					Course_Name varchar(20) NOT NULL,
                    Total_Hours int CHECK(Total_Hours>10 and Total_Hours<40),
                    Instructor_ID varchar(4) ,
                    Fees int CHECK (Fees>0 and Fees <10000),
                    Type varchar(20) CHECK (Type = 'Programming' or Type = 'Web Development' or Type = 'Data Science'),
                    Rating float CHECK (Rating>0 and Rating <=5),
                    FOREIGN KEY (Instructor_ID) REFERENCES Instructor(Instructor_ID)
                    );
                       
insert into Course values('C001' ,'Java', 25 ,'I002' ,1500 ,'Programming' ,3.5);
insert into Course values('C002' ,'C++ Basics', 20, 'I001', 3000 ,'Programming', 4.55);
insert into Course values('C003' ,'Angular', 30, 'I003', 5000 ,'Web Development', 4.1);
insert into Course values('C004' ,'ReactJS', 35 ,'I004', 6000 ,'Web Development' ,3.6);
insert into Course values('C005' ,'CSS and JavaScript', 21, 'I003', 2500, 'Web Development', 4.3);
insert into Course values('C006' ,'Machine Learning', 15 ,'I001', 1200, 'Data Science', 3.9);
insert into Course values('C007' ,'Deep Learning' ,18 ,'I002', 1200 ,'Data Science', 4.7);

desc Course;
select * from Course;

create table CourseRegistration(Registration_ID int NOT NULL PRIMARY KEY,
								Rollno varchar(4) ,
                                Course_ID varchar(4),
                                Fee_Status varchar(10) CHECK (Fee_Status = 'Paid' or Fee_Status= 'Not Paid'),
                                FOREIGN KEY (Rollno) REFERENCES Student(Rollno),
                                FOREIGN KEY (Course_ID) REFERENCES Course(Course_ID)
                                );
							
insert into CourseRegistration values(1, 'S001' ,'C003' ,'Paid');
insert into CourseRegistration values(2 ,'S002', 'C002', 'Paid');
insert into CourseRegistration values(3 ,'S003' ,'C004' ,'Not Paid');
insert into CourseRegistration values(4 ,'S004' ,'C004', 'Paid');
insert into CourseRegistration values(5 ,'S005', 'C001', 'Not Paid');
insert into CourseRegistration values(6 ,'S006', 'C005', 'Paid');

desc CourseRegistration;
select * from CourseRegistration;

create table Result(Rollno varchar(4),
					Course_ID varchar(4),
                    Grade_Obtained varchar(4) CHECK(Grade_Obtained = 'A+' or Grade_Obtained = 'A' or 
                    Grade_Obtained = 'B+' or Grade_Obtained = 'B' or Grade_Obtained = 'C+' or Grade_Obtained = 'C'),
                    FOREIGN KEY (Rollno) REFERENCES Student(Rollno),
                    FOREIGN KEY (Course_ID) REFERENCES Course(Course_ID)
                    );
                   
insert into Result values('S001' ,'C003', 'A+');
insert into Result values('S002', 'C002', 'A');
insert into Result values('S004' ,'C004' ,'A');
insert into Result values('S006' ,'C005', 'A+');

desc Result;
select * from Result;
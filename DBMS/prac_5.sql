CREATE TABLE Student (Roll VARCHAR(11) primary key check(Roll like "211621%"), Name VARCHAR(50), Sem decimal(1) check(Sem between 1 and 8), Branch VARCHAR(3) check(Branch in ('CBA','BDA','CS')), Email varchar(50) UNIQUE check(Email like '%@gnu.ac.in'), Contact decimal(10) unique);

CREATE TABLE Faculty(FID DECIMAL(2) primary key, F_Name VARCHAR(50), Email VARCHAR(50) unique check(Email like '%@ganpatuniversity.ac.in'), Contact decimal(10) unique);

CREATE TABLE Subject(SID VARCHAR(7) primary key, S_Name VARCHAR(40), Sem decimal(1) check(Sem between 1 and 8), Branch VARCHAR(3) check(Branch in ('CBA','BDA','CS')));

CREATE TABLE Attendance(AID VARCHAR(10) primary key, Roll VARCHAR(11) references Student(Roll), FID decimal(2) references Faculty(FID), SID varchar(7) references Subject(SID), Date date, Lecture_No decimal(1) check(Lecture_No between 1 and 6) ,Presence varchar(1) check(Presence in ('P','A','p','a')));

desc Student;

desc  Faculty;

desc Subject;

desc Attendance;


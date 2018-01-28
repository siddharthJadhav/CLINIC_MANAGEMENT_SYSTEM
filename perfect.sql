
create database clinic
use clinic

select * From Login
create table login(name varchar(100)not null,password varchar(100)not null,utype varchar(100)not null,hint varchar(100))
insert into login values('amir','sanas','admin','amir')
insert into login values('anand','rajesh','users','anand')
insert into login values('chandragupta','chankya','admin','maratha')


select * from appointment
create table appointment(fname varchar(100)not null,mname varchar(100)not null,lname varchar(100)not null,dates datetime not null)

select * from register
create table register(dates datetime not null,fname varchar(100)not null,mname varchar(100)not null,lname varchar(100)not null,dob datetime not null,age int not null,gender varchar(10)not null,occupation varchar(100) null,address varchar(200)not null,contact varchar(15)not null,mail varchar(100)null,code varchar(20) primary key,reference varchar(20)not null,relation varchar(20) not null,allergy varchar(100)null)

select * from treatement
create table treatement(bill_id int primary key not null,treatement_id int not null,dates datetime not null,code varchar(20) foreign key references register(code),name varchar(100) not null,diesease varchar(max) not null,treatement varchar(max) not null,amount float not null,paid float,balance float)


create table refer(reference varchar(100))
select * from refer


create table hint(hint varchar(100))
select * from hint

create table tablet(cudate datetime,name varchar(100)primary key,price float,quantity int,dates datetime)
select * from tablet


select * from diesease
create table diesease(name varchar(100) primary key)


create table balance(bill_id int foreign key references treatement(bill_id),code varchar(20),treatement_id int,paid float,balance float)
select * from balance


create table hifi(dates datetime not null)
select * from hifi

create table personal(dates datetime,member varchar(200),amount float)
select * from personal

create table reminder(code varchar(20) foreign key references register(code),dates datetime,dates1 datetime )
select * from reminder




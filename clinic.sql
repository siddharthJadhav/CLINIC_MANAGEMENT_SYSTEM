select * from register
create database clinic

select * From Login
create table login(name varchar(20)not null,password varchar(20)not null,utype varchar(20)not null,hint varchar(50))
insert into login values('amir','sanas','admin','amir')
insert into login values('anand','rajesh','users','anand')
insert into login values('prashant','melmane','admin','melmane')


select * from appointment
create table appointment(fname varchar(20)not null,mname varchar(20)not null,lname varchar(20)not null,dates datetime not null)
insert into appointment values('ramesh','adsfa','yadav','1-dec-2012')


select * from register
create table register(dates datetime not null,fname varchar(20)not null,mname varchar(20)not null,lname varchar(20)not null,dob datetime not null,age int not null,gender varchar(10)not null,occupation varchar(20) null,address varchar(30)not null,contact varchar(15)not null,mail varchar(30)null,code varchar(10) primary key,reference varchar(10)not null,relation varchar(10) not null,allergy varchar(30)null)
insert into register values(getdate(),'anand','ramchandra','vishwakarma','29-apr-1990',22,'male','student','mankhurd','9594367100','rajanand','v1','v1','self','no')




select * from treatement
create table treatement(bill_id int not null,treatement_id int not null,dates datetime not null,code varchar(10) foreign key references register(code),name varchar(40) not null,diesease varchar(100) not null,treatement varchar(100) not null,amount int not null)
insert into treatement values(1,1,'25-oct-2010','v1','anand ramchandra vishwakarma','cough,cold,fever','jadgsawerfwsdfgdfuygsadf',227)
delete from treatement where dates>'31-jul-2012'
select convert( varchar(6),getdate())


create table refer(reference varchar(10))
select reference from refer

select * from personal
delete from personal where dates>getdate()
select member from personal where member!='medicine'
select sum(amount)as total from treatement where dates between '01-jun-2012'and '30-jun-2012 11pm'
select member from personal where member != 'medicine'

select * from balance
delete from balance
select * from register where convert(varchar(6),dob)=convert(varchar(6),getdate()) and code='s2'
select count(name) from register where convert(varchar(6),dob)=convert(varchar(6),getdate()) and code='s1'
select count(fname) from register where dates='28-feb-1990'
select year(dateadd(m,-120,getdate()))
select convert(varchar(10),dateadd(m,-120,getdate()),110)
create table hifi(dates datetime)
insert into hifi values('2012')
select * from hifi
Select year(dateadd(m,-120,getdate()))
select * from tablet
select * from diesease
delete from tabletdiesease
delete from tablet
select convert (varchar(10),datename(month,dates))as Month,sum(amount)as Total from personal where dates between '01-jan-2012 01am'and '31-dec-2012 11pm'group by datename(month,dates)order by datename(month,dates)desc          
select month(dates)as Month,sum(amount)as Total from personal where dates between '01-jan-'"+u+"' 01am'and '31-dec-'"+u+"' 11pm'group by month(dates)order by month(dates)desc
select * from personal
select month(dates)as Month,sum(amount)as Total from personal where dates between '01-jan-2012 01am'and '31-dec-2012 11pm'group by month(dates)order by month(dates)desc
select month(dates)as Month,sum(amount)as Total,sum(paid) as paid from treatement where dates between '01-jan-2012 'and '31-dec-2012 11pm'group by month(dates)order by month(dates)desc
select * from personal where dates='31-feb-2012'
select count(amount) from personal where '13-jul-2013' between '31-dec-2012' and '31-dec-2013' 
select count(amount) from personal where convert(varchar(12),getdate(),106) between '31-dec-2012' and '31-dec-2013'
select * from tablet
delete from tablet
Use mysql, download wampserver and mySQLWorkBench
Download 2 Libs( bibliotecas ) : mysql-connector-java-8.0.29.jar ( conexao com o banco ) e rs2xml.jar ( mexer com as tabelas )

Execute one by one, up to down

create database mercadoGod character set utf8 collate utf8_general_ci;

use mercadoGod;

create table prodtable(
	productid int primary key auto_increment,
	prodname varchar(50) not null unique,
	prodval varchar(10) not null,
	prodamount int default 1,
	prodprice decimal(5,2) not null,
	prodvalue decimal(5,2) not null
)charset=utf8 engine=InnoDB;


create table clitable(
	idclient int primary key auto_increment,
	clientname varchar(50) not null,
	clientfone varchar(12) not null,
	climessage varchar(200),
	totprice decimal(5,2) default 0
)charset=utf8 engine=InnoDB;


create table saletable(
	idsale int primary key auto_increment,
	saledate timestamp default current_timestamp,
	saleprice decimal(5,2) not null,
	idclient int not null,
	foreign key(idclient) references mercadogod.clitable(idclient)
)charset=utf8 engine=InnoDB;


create table temptable(
	idvenda int primary key auto_increment,
	productid int not null,
	prodquant int not null,
	foreign key(productid) references mercadogod.prodtable(productid)
)charset=utf8 engine=InnoDB;

create table saletabletrue(
	idvenda int primary key auto_increment,
	prodmount int,
	prodlucro decimal(5,2) not null,
	prodreal decimal(5,2) not null,
	selldate timestamp default current_timestamp,
	productid int not null,
	foreign key(productid) references mercadogod.prodtable(productid)
)charset=utf8 engine=InnoDB;


drop table if exists TRANSACTION;  
create table TRANSACTION (
	ID BIGINT PRIMARY KEY AUTO_INCREMENT, 
	AMOUNT DECIMAL(20, 2), 
	TIMESTAMPS BIGINT
);
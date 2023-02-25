CREATE TABLE Account (
  account_id INT IDENTITY(1,1),
  name VARCHAR(255),
  address VARCHAR(255),
  phone_number VARCHAR(20),
  username VARCHAR(50),
  password VARCHAR(50),
  PRIMARY KEY (account_id)
);


insert into Account(name, address, phone_number, username, password) values ('Phi Le', 'Vinh Phuc', '0862779990', 'leducphi', '123')

select * from Account
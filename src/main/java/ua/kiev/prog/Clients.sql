create table Clients(
      id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
      name VARCHAR(20),
      age int
);

select * from clients;

drop table clients;



insert into clients (name, age) VALUES ('Aleks', 49);
insert into clients (age) VALUES (55);
insert into clients (name, age) VALUES ('Roman', 42);
insert into clients (name, age) VALUES ('Igor', 22);
insert into clients (name, age) VALUES ('Maria', 35);
insert into clients (age) VALUES (30);
insert into clients (name) VALUES ('Aleks');
insert into clients (name) VALUES ('Without_age');
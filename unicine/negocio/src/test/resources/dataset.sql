--DATOS PARA PRUEBAS

--REGISTROS ADMINISTRADOR

insert into administrador values (1, "admin1@email.com", "admin1");
insert into administrador values (2, "admin2@email.com", "admin2");
insert into administrador values (3, "admin3@email.com", "admin3");
insert into administrador values (4, "admin4@email.com", "admin4");
insert into administrador values (5, "admin5@email.com", "admin5");

--REGISTROS ADMINISTRADOR TEATRO

insert into admin_Teatro values (1, "admint1@email.com", "admint1");
insert into admin_Teatro values (2, "admint2@email.com", "admint2");
insert into admin_Teatro values (3, "admint3@email.com", "admint3");
insert into admin_Teatro values (4, "admint4@email.com", "admint4");
insert into admin_Teatro values (5, "admint5@email.com", "admint5");

--REGISTROS CIUDAD

insert into ciudad values (1, "Armenia");
insert into ciudad values (2, "Medellín");
insert into ciudad values (3, "Cali");
insert into ciudad values (4, "Bogotá");
insert into ciudad values (5, "Pereira");

--REGISTROS CLIENTE

insert into cliente values (1, "cliente1@email.com", "I", '1997-09-26', '2022-10-19', "fotocli1", "cliente1", "cli1", 1);
insert into cliente values (2, "cliente2@email.com", "A", '1980-12-24', '2021-10-20', "fotocli2", "cliente2", "cli2", 2);
insert into cliente values (3, "cliente3@email.com", "A", '2000-06-15', '2020-02-11', "fotocli3", "cliente3", "cli3", 1);
insert into cliente values (4, "cliente4@email.com", "I", '1990-01-01', '2021-12-08', "fotocli4", "cliente4", "cli4", 5);
insert into cliente values (5, "cliente5@email.com", "I", '1996-03-20', '2022-06-27', "fotocli5", "cliente5", "cli5", 3);

--REGISTROS CLIENTE_TELEFONOS

insert into cliente_telefonos values (1, "325611616");
insert into cliente_telefonos values (1, "544465649");
insert into cliente_telefonos values (2, "546498433");
insert into cliente_telefonos values (3, "684513547");
insert into cliente_telefonos values (4, "987985646");
insert into cliente_telefonos values (4, "131398988");
insert into cliente_telefonos values (5, "987987655");

--REGISTROS CONFITERIA

insert into confiteria values (1, "foto Confi 1", "Confiteria 1", 30000);
insert into confiteria values (2, "foto Confi 2", "Confiteria 2", 25000);
insert into confiteria values (3, "foto Confi 3", "Confiteria 3", 35000);
insert into confiteria values (4, "foto Confi 4", "Confiteria 4", 21000);
insert into confiteria values (5, "foto Confi 5", "Confiteria 5", 29000);

--REGISTROS CUPON

insert into cupon values (1, "REGISTRO", 10, "A", '2022-12-03', 1);
insert into cupon values (2, "REGISTRO", 10, "A", '2022-12-03', 2);
insert into cupon values (3, "REGISTRO", 10, "A", '2022-12-03', 3);
insert into cupon values (4, "REGISTRO", 10, "A", '2022-12-03', 4);
insert into cupon values (5, "REGISTRO", 10, "A", '2022-12-03', 5);

--REGISTROS TEATRO

insert into teatro values(1, "calle 11 octava", "teatro1", 1);
insert into teatro values(1, "carrera 2 septima", "teatro1", 2);
insert into teatro values(1, "calle 1 octava", "teatro1", 3);
insert into teatro values(1, "calle 11 octava", "teatro1", 2);
insert into teatro values(1, "calle 11 octava", "teatro1", 4);

--REGISTROS TARJETA

insert into tarjeta values(1, "A", 5, '2022-10-31', 1);


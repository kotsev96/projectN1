delete from user_role;
delete from usr;

insert into usr(id, username, password, active) values
(1, 'admin1', '12345', true),
(2, 'eldar', 'eldar', true);

insert into user_role(user_id, roles) values
(1, 'ADMIN'), (1, 'USER'),
(2, 'USER');
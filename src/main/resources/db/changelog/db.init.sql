--liquibase formatted sql

--changeset Alipour:1
create table USER_STATUS
(
    id        int primary key,
    name      varchar(255) not null,
    code      varchar(255) not null,
    is_active varchar(255) not null
);

insert into USER_STATUS (id, name, code, is_active)
values (1, 'فعال', 'ACTIVE', 1);
insert into USER_STATUS (id, name, code, is_active)
values (2, 'عیرفعال', 'INACTIVE', 1);
insert into USER_STATUS (id, name, code, is_active)
values (3, 'معلق', 'SUSPENDED', 1);

create table USER
(
    id int primary key,
    name          varchar(255) not null,
    username      varchar(255),
    password      varchar(255),
    mobile_number varchar(255),
    user_status_id int not null,
    CONSTRAINT fk_status_of_user FOREIGN KEY (user_status_id) REFERENCES USER_STATUS(id)
);



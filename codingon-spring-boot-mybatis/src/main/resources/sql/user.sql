use kdt;


create table user(
    id bigint not null auto_increment primary key,
    name varchar(255) not null,
    nickname varchar(255) not null,
)

select * from user;
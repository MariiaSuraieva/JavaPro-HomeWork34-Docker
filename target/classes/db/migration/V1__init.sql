create table passports
(
    id            serial
        primary key,
    first_name    varchar(255),
    second_name   varchar(255),
    serial_number uuid,
    is_free       boolean
);
create table users
(
    id          serial
        primary key,
    country     varchar(255),
    email       varchar(255),
    is_deleted  boolean,
    name        varchar(255),
    passport_id integer
        constraint fkddyjnd93b8x7gdng15k7g429p
            references passports
);

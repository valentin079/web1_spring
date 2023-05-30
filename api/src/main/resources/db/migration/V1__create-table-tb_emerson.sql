create table tb_emerson(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    telefone varchar(100) not null ,
    email varchar(100) not null ,
    data_nascimento varchar(100) not null ,
    primary key (id)
);
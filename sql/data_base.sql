create table contato(
    id serial not null primary key,
    nome varchar(150) not null,
    email varchar(150) not null,
    favorito boolean,
    foto oid
)
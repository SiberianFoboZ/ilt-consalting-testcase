create table cargo (
    id uuid primary key,
    name varchar,
    code varchar
)

create table route (
    id uuid primary key,
    way integer,
    station varchar
)

create table wagon_passport (
    id uuid primary key,
    number varchar,
    type varchar,
    carring integer,
    tare_weight integer
)

create table wagon (
    id uuid primary key,
    number integer,
    cargo_weight integer,
    wagon_weight integer,
    cargo varchar,
    wagon_passport_id uuid,
    constraint wagon_fk foreign key (wagon_passport_id) references wagon_passport
)

create table train (
    id uuid primary key,
    way integer,
)

create table train_wagon (
    train_id uuid NOT NULL,
    wagon_id uuid not null,
    constraint train_wagon_fk foreign key (train_id) references train,
    constraint train_wagon_fk_1 foreign key (wagon_id) references wagon
)

create table nomenclature (
    id uuid primary key
)

create table nomenclature_wagon (
    wagon_id uuid not null,
    nomenclature_id not null,
    constraint nomenclature_wagon_fk foreign key (wagon_id) references wagon,
    constraint nomenclature_wagon_fk_1 foreign key (nomenclature_id) references nomenclature
)
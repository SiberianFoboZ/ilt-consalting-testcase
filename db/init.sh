#!/usr/bin/env sh

psql -v ON_ERROR_STOP=1 --username=postgres <<-EOSQL
    SET TIME ZONE 'Asia/Krasnoyarsk';
    CREATE USER ilt WITH PASSWORD '!QAZxsw2';
    CREATE DATABASE ilt OWNER = ilt TEMPLATE = template0 ENCODING = 'UTF8';
    GRANT ALL PRIVILEGES ON DATABASE ilt TO ilt;

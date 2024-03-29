#!/usr/bin/env sh

psql -v ON_ERROR_STOP=1 --username=postgres <<-EOSQL
    SET TIME ZONE '$PG_TIMEZONE';
    CREATE USER $PG_USER WITH PASSWORD '$PG_PASSWORD';
    CREATE DATABASE $PG_DATABASE OWNER = $PG_USER TEMPLATE = template0 ENCODING = 'UTF8';
    GRANT ALL PRIVILEGES ON DATABASE $PG_DATABASE TO $PG_USER;
EOSQL
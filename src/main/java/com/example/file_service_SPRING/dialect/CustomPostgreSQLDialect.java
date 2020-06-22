package com.example.file_service_SPRING.dialect;

import java.sql.Types;

import org.hibernate.dialect.PostgreSQL82Dialect;

public class CustomPostgreSQLDialect extends PostgreSQL82Dialect {

    public CustomPostgreSQLDialect() {
        super();

        registerColumnType(Types.BLOB, "bytea");
    }
}
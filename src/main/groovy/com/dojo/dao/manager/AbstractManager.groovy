package com.dojo.dao.manager

import groovy.sql.Sql

public abstract class AbstractManager<T> {
    static instance = Sql.newInstance('jdbc:h2:tcp://localhost/~/test', "sa", null, "org.h2.Driver")

    abstract T find(Long id)
}
package com.dojo.dao.manager

import com.dojo.dao.data.Child

/**
 * Created by David.Kraft-Ishihama on 11/11/2014.
 */
public class ChildManager extends AbstractManager<Child> {
    Child find(Long id) {
        Child child
        def firstRow = instance.firstRow("select * from child where id = ?;", id) { row ->
            //child = new Child(firstName : row.firstName, lastName: row.lastName, DOB: row.DOB, id: row.id)
            println row
        }

        return new Child()
    }
}

import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:h2:tcp://localhost/~/test", "sa", "", "org.h2.Driver")
def rows = sql.rows("select * from test")
println(rows)
println(sql)
println(rows.getClass())
println(rows[0].getClass())
println(sql.getClass())

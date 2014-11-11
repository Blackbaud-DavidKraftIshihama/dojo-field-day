import groovy.sql.Sql
import org.springframework.web.bind.annotation.*
import com.dojo.rest.*

@RestController
public class GreetingController {
    static instance = Sql.newInstance('jdbc:h2:tcp://localhost/~/test', "sa", null, "org.h2.Driver")
    static id = 0;

    @RequestMapping("/save")
    public Child greeting(@RequestParam(value="childName", required=true) String childName) {
        instance.execute("Insert into greeting values (?, ?);", id, childName)
        id++
        return new Child(name : childName)
    }
}
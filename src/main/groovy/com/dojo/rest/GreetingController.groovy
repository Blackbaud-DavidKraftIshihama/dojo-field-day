import org.springframework.web.bind.annotation.*
import com.dojo.rest.*

@RestController
public class GreetingController {

    @RequestMapping("/save")
    public Child greeting(@RequestParam(value="childName", required=true) String childName) {
        return new Child(name : childName)
    }
}
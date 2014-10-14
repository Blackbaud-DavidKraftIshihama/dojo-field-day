package com.dojo.rest

import org.springframework.web.bind.annotation.*
import com.dojo.rest.*

@RestController
public class GreetingController {
    def template = "hello %s"
    def id = 7
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") name) {
        return new Greeting(id : this.id, content : String.format(template, name))
    }
}
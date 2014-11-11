package com.dojo.rest

import com.dojo.dao.data.Child
import com.dojo.dao.manager.ChildManager
import org.springframework.web.bind.annotation.*

@RestController
public class GreetingController {
    @RequestMapping("/save")
    public Child greeting(@RequestParam(value="childName", required=true) String childName) {
        ChildManager manager = new ChildManager()
        return manager.find(25L)
    }
}
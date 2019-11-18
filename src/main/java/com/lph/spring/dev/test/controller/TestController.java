package com.lph.spring.dev.test.controller;

import com.lph.spring.dev.test.entity.TestTable;
import com.lph.spring.dev.test.service.TestService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
public class TestController {
    TestService testService = new TestService();
    @RequestMapping(value="/add",method= RequestMethod.POST)
    public Object addUser(@RequestBody TestTable testTable) {
        return testService.add(testTable);
    }
    @RequestMapping(value="update",method = RequestMethod.PUT)
    public Object updateUser(@RequestBody TestTable testTable) {
        return testService.update(testTable);
    }
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Object update() {
        return testService.getById("2");
    }
}

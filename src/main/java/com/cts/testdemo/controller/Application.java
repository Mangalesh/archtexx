/**
 * 
 */
package com.cts.testdemo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.testdemo.model.User;

/**
 * @author 376410
 *
 */
@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/rest/user")
    User home() {
        User user = new User();
        user.setCompany("CTS");
        user.setName("JPrakasam");
        
        return user;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}

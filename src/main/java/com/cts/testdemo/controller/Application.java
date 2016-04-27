/**
 * 
 */
package com.cts.testdemo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.testdemo.model.User;

/**
 * @author 376410
 *
 */
@RestController
//@EnableAutoConfiguration
@SpringBootApplication
public class Application extends SpringBootServletInitializer  {

	private static Class<Application> applicationClass = Application.class;
	
    @RequestMapping("rest/user")
    User home() {
        User user = new User();
        user.setCompany("CTS");
        user.setName("Mangalesh");       
        user.setAddress("Frankfrut Main");
        user.setAge("35");
        user.setContactNo("902349234234");
        user.setPincode("734344");
        
        return user;
    }

    
    
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

}

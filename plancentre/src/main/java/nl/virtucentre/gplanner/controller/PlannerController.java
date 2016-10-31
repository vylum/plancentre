package nl.virtucentre.gplanner.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class PlannerController {
	
	@RequestMapping("/{user}/create")
	@ResponseBody
	String createUser(@PathVariable String user) {
		return "Hello " + user;
	}
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(PlannerController.class, args);
    }
}

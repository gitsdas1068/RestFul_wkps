package com.example.demo.resources;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WelcomeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Swagger2WelcomeRestController", description = "This REST Api related to Welcome Message!!!!")
@RestController("/rest")
public class WelcomeRestController {
	
@Autowired	
private WelcomeService welcomeservice;

	@ApiOperation(value = "Get Welcome Message For The Given Name ", response = String.class, tags = "getWelcomeNote")
	@GetMapping("/welcome")
	public String welcome() throws InterruptedException, ExecutionException {
		
		
		CompletableFuture<String> str1=welcomeservice.getM1();
		CompletableFuture<String> str2=welcomeservice.getM2();
		CompletableFuture.allOf(str1,str2).join();
		return str1.get()+" "+str2.get();
		
		
		
	}

}

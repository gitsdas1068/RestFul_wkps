package com.example.demo.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;



@Service
public class WelcomeService {
	
	@Async
	public CompletableFuture<String> getM1() {
		System.out.println("getM1() -->started");
		String msg1= "Welcome";
		CompletableFuture cf = CompletableFuture.completedFuture(msg1);
		System.out.println("getM1() -->ended");
		return cf;
	}
	@Async
	public CompletableFuture<String> getM2() {
		System.out.println("getM2() -->started");
		String msg1= "to wipro";
		CompletableFuture cf = CompletableFuture.completedFuture(msg1);
		System.out.println("getM2() -->ended");
		return cf;

	}

}

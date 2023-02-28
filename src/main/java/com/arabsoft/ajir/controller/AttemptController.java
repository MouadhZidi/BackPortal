package com.arabsoft.ajir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.sevices.AttemptCounter;

@RestController
public class AttemptController {
	 @Autowired
	    private AttemptCounter attemptCounter;
	 
	    @GetMapping("/attempts")
	    public int getAttempts() {
	        attemptCounter.incrementCounter();
	        return attemptCounter.getCounter();
	    }
}

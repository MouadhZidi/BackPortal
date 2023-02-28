package com.arabsoft.ajir.sevices;

import org.springframework.stereotype.Service;

@Service
public class AttemptCounter {
	 private int counter;
	 
	    public int incrementCounter() {
	        return ++counter;
	    }
	 
	    public int getCounter() {
	        return counter;
	    }
}

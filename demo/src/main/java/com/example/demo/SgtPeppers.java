package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SgtPeppers implements CompactDisc {

    private static AtomicInteger i = new AtomicInteger(0);
    private int value;  
    
    public void SgtPeppers() {
        System.out.println("SgtPeppers constructor call");  
        this.value = i.incrementAndGet(); 
    }
    public void play(){
        System.out.print("SgtPepers play");
    }
}

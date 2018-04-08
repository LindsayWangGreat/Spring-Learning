package com.example.disc;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.repository.CompactDisc;

@Component
@Primary //if 2 class implement same interface. use @primary to point the main class
public class SgtPeppers implements CompactDisc {

    private static AtomicInteger i = new AtomicInteger(0);
    private int value;  
    
    public SgtPeppers() {
        System.out.println("SgtPeppers constructor call");  
        this.value = i.incrementAndGet(); 
    }
    
    public void play(){
        System.out.println("SgtPepers play");
        System.out.println("value:"+ this.value);
    }
}

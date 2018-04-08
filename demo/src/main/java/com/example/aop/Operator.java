package com.example.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Operator
{
    /*@Before("execution(* com.example.repository.MediaPlayer.*(..))")
    public void putDisc() {
        System.out.println("put disc into the player");
    }
    @AfterReturning("execution(** com.example.demo.MediaPlayer.*(..))")
    public void enjoy() {
        System.out.println("enjoy the music"); 
    }*/
    @Pointcut("execution(** com.example.repository.MediaPlayer.*(..))")
    public void play() {}
    
    @Before("play()")
    public void putDisc() {
        System.out.println("put disc into the player");
    }
    
    @AfterThrowing("play()")
    public void enjoy() {
        System.out.println("enjoy");        
    }
}

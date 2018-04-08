package com.example.other;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.repository.CompactDisc;
import com.example.repository.MediaPlayer;

public class GreetingController
{
    private static final String template = "Hello, %s!";  
    private final AtomicLong counter = new AtomicLong();  
  
    @Autowired  
    private MediaPlayer player;  
  
    @Autowired  
    private CompactDisc cd;  
  
    @RequestMapping("/greeting")  
    public Greeting greeting(  
            @RequestParam(value = "name", defaultValue = "World") String name) {  
        player.play();
        System.out.println(cd == player.getDisk());  
        cd.play();  
        player.getDisk().play();
        
        return new Greeting(counter.incrementAndGet(), String.format(template,  
                name));  
    }  
  
    private static class Greeting {  
  
        private final long id;  
        private final String content;  
  
        public Greeting(long id, String content) {  
            this.id = id;  
            this.content = content;  
        }  
  
        public long getId() {  
            return id;  
        }  
  
        public String getContent() {  
            return content;  
        }  
    }  
}

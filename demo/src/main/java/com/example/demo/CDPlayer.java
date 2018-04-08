package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.repository.CompactDisc;
import com.example.repository.MediaPlayer;

@Component
public class CDPlayer implements MediaPlayer
{
   
    @Autowired
    private CompactDisc cd;
    
      
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd=cd;
    }
    
    public void play() {
        cd.play();
    }
    
    public CompactDisc getDisk() {  
        return cd;  
    } 
}

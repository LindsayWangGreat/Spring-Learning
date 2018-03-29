package com.example.demo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
    
    @Bean
    public CDPlayer cdplayer(CompactDisc cd) {
        return new CDPlayer(cd);
    }
}

package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration

public class CDPlayerConfig {
    @Bean
    @Primary
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
    
    @Bean
    public CDPlayer cdplayer(CompactDisc cd) {
        return new CDPlayer(cd);
    }
    
   @Bean
   public BlankDisc blankdisc() {
       return new BlankDisc();
   }
}

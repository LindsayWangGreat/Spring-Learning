package com.example.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import com.example.aop.Operator;
import com.example.demo.CDPlayer;
import com.example.disc.BlankDisc;
import com.example.disc.SgtPeppers;
import com.example.repository.CompactDisc;

@Configuration
//enable aspect & add aspect bean
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.example.*")
public class CDPlayerConfig {
    /*@Bean
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
   
   @Bean
   public Operator operator() {
       return new Operator();
   }*/
   
}

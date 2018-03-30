package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final SystemOutRule log=new SystemOutRule();
    
    @Autowired
    private MediaPlayer player;
    
    @Autowired
    private CompactDisc cd;

       
    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
        
    }
    @Test
    public void play() {
        player.play();
        String exp=log.getLog();
        assertEquals("SgtPepers play",exp);
    }
}

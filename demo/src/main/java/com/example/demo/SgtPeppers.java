package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lonelyHeartClub")
public class SgtPeppers implements CompactDisc {
    private String title="title";
    private String artist="artist";

    public void play(){
        System.out.print("SgtPepers play");
    }
}

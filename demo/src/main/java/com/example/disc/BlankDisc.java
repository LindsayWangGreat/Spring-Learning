package com.example.disc;


import java.util.List;

import org.springframework.stereotype.Component;

import com.example.repository.CompactDisc;

@Component
public class BlankDisc implements CompactDisc
{
    private String title;
    private String artist;
    private List<String> tracks;
    
  
    public void play() {
      
            System.out.println("blank disc play");
        
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle( String title )
    {
        this.title = title;
    }

    public String getArtist()
    {
        return artist;
    }

    public void setArtist( String artist )
    {
        this.artist = artist;
    }

    public List<String> getTracks()
    {
        return tracks;
    }

    public void setTracks( List<String> tracks )
    {
        this.tracks = tracks;
    }
}

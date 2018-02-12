package com.example.sudo.basu.models;

/**
 * Created by Sudo on 8.2.2018..
 */

public class Music {

    private Long id;
    private String name;
    private String artist;
    private String duration;

    public Music(Long id, String name, String artist, String duration) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}

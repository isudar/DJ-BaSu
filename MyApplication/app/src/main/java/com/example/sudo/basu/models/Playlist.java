package com.example.sudo.basu.models;

/**
 * Created by Sudo on 8.2.2018..
 */

public class Playlist {

    private Long id;
    private String name;

    public Playlist(Long id, String name) {
        this.id = id;
        this.name = name;
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
}

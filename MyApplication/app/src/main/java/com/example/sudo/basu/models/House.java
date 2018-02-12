package com.example.sudo.basu.models;

/**
 * Created by Sudo on 8.2.2018..
 */

public class House {

    private Long id;
    private String name;
    private String members;
    private String address;
    private String city;

    public House(Long id, String name, String members, String address, String city) {
        this.id = id;
        this.name = name;
        this.members = members;
        this.address = address;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

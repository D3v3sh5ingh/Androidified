package com.example.dev.androidified;


public class DeveloperLink {
public int id ;
public String GmailLink ;

    public DeveloperLink(int id, String gmailLink) {
        this.id = id;
        GmailLink = gmailLink;
    }

    public int getId() {
        return id;
    }

    public String getGmailLink() {
        return GmailLink;
    }
}

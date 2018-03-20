package com.example.dev.androidified;

/**
 * Created by Shivam Kumar on 19-03-2018.
 */

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

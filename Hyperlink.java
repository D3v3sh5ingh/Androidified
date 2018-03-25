package com.example.dev.androidified;

/**
 * Created by Sameep Yadav on 25-03-2018
 */
public class Hyperlink {
    public int id ;
    public String GithubLink ;

    public Hyperlink (int id, String gmailLink) {
        this.id = id;
      GithubLink = gmailLink;
    }

    public int getId() {
        return id;
    }

    public String getGmailLink() {
        return GithubLink;
    }
}



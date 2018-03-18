package com.example.dev.androidified;

/**
 * Created by shiva on 18-03-2018.
 */

public class ItemObject {
    public String name;
    public String skill;
    public Integer no;
    public ItemObject(String name,String skill,Integer no) {
        this.name = name;
        this.skill = skill;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public Integer getNo() {
        return no;
    }
    public void setter(String name,String skill,Integer no)
    {
        this.name=name;
        this.skill=skill;
        this.no=no;
    }
}
package com.jackrocks.todolist;

public class Item {
    private String name;
    private String desc;

    public Item(){}

public Item(String name, String description) {
    this.name = name;
    this.desc = description;

}


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }
     public  void setDesc(String desc) {
         this.desc = desc;
     }

    public String toString() {
        return this.name;
    }

}

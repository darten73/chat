package ru.vinishko.network;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String pass;
    private boolean logined;
    private boolean notFound;
    private boolean reg;

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
        logined=false;
        notFound=false;
    }
    public User(String name, String pass,boolean reg) {
        this.name = name;
        this.pass = pass;
        this.reg=reg;
        logined=false;
        notFound=false;
    }


    public boolean isReg() {
        return reg;
    }

    public User(boolean reg) {
        this.reg = reg;
        notFound=true;
    }

    public User(String name, boolean logined,boolean reg) {
        this.name = name;
        this.pass = "";
        this.logined=logined;
        this.reg=reg;

        notFound=false;
    }

    public User() {
        notFound=true;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public boolean isLogined(){
        return logined;
    }
    public boolean notFound(){
        return notFound;
    }
}

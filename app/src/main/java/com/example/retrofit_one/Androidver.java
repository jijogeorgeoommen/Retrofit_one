package com.example.retrofit_one;

public class Androidver {
   private String ver;
   private String name;
    private String api;

    public Androidver(String ver,String name,String api) {

        this.ver=ver;
        this.name=name;
        this.api=api;
    }                             //right click here and generate getter and setter

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}

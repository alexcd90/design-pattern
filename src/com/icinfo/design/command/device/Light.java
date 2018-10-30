package com.icinfo.design.command.device;


public class Light {
    private String loc = "";

    public Light(String loc) {
        this.loc = loc;
    }

    public void On(){
        System.out.println(loc+" on .....");
    }

    public void Off(){
        System.out.println(loc+" off .....");
    }
}

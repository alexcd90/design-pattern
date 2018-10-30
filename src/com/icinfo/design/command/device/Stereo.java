package com.icinfo.design.command.device;

public class Stereo {
   private static int volume=0;

   public void On(){
       System.out.println("Stereo on ....");
   }

   public void Off(){
       System.out.println("Stereo off ....");
   }

   public void setCD(){
       System.out.println("Stereo setCD ....");
   }

   public void setVol(int vol){
       volume = vol;
       System.out.println("Stereo volume "+ volume);
   }

    public int getVolume() {
        return volume;
    }

    public void start(){
        System.out.println("Stereo start ....");
    }
}

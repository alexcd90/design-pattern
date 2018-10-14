package com.icinfo.design.singleton;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;
    public volatile static ChocolateFactory uniqueInstance=null;

    private ChocolateFactory(){
        empty=true;
        boiled=false;
    }

    public static ChocolateFactory getInstance(){
        if (uniqueInstance==null){
            synchronized ((ChocolateFactory.class)){
                if(uniqueInstance==null){
                    uniqueInstance=new ChocolateFactory();
                }
            }
        }
        return uniqueInstance;
    }

    public void fill(){
        if (empty){
            empty=false;
            boiled=false;
        }

    }

    public void drain(){
        if ((!empty)&&boiled){
            empty=true;
        }
    }
    public void boil(){
        if((!empty)&&(!boiled)){
            boiled=true;
        }
    }

}

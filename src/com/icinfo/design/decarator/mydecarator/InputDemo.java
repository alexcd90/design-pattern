package com.icinfo.design.decarator.mydecarator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月01
 */
public class InputDemo {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new UpperCaseInputStream(new BufferedInputStream(
                    new FileInputStream("D:\\test\\mzt_hj\\mzt_hj_mzt_jjh_valid_old\\20180319.txt")));
            while ((c = in.read()) !=-1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

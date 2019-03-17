package com.icinfo.designnew.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-03-15 00:25
 */
public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap<Object, Object> hashMap = new HashMap<>();
        child.method(hashMap);
    }
}

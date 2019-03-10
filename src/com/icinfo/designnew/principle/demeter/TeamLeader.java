package com.icinfo.designnew.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    public void checkNumberOfCourse() {
        List<Course> list = new ArrayList();
        for(int i = 0;i<20;i++){
            list.add(new Course());
        }
        System.out.println("在线课程数量："+list.size());
    }
}

package com.icinfo.designnew.pattern.creational.simplefactory;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-03-16 15:40
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
//        v1
//        Video video = videoFactory.getVideo("java");
//        if (video==null){
//            return;
//        }

//        v2
        Video video = videoFactory.getVideo(PythonVideo.class);
        video.produce();
    }
}

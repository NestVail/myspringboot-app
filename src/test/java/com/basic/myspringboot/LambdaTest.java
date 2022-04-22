package com.basic.myspringboot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LambdaTest {
    @Test @Disabled
    public void runnable() throws Exception {
        //1. MyRunnable Class
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        //2. Anonymous Inner Class
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable을 Anonymous Inner Class로 선언");
            }
        });
        t2.start();

        //3, Lambda Expression
        Thread t3 = new Thread(() -> System.out.println("Lambda Expression으로 선언"));
        t3.start();
    }
}

@Getter @Setter
@AllArgsConstructor // 생성자 자동 선언
class User {
    private String name;
    private int age;
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable 구현 클래스를 별도로 선언");
    }
}

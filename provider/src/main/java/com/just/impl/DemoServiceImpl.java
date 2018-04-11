package com.just.impl;


import com.just.DemoService;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements  DemoService{

    public void test() {
        System.out.println("test");
    }

    public String getStr(String s) {
        System.out.println("test"+"\t"+s);
        return s;
    }
}

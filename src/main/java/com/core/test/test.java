package com.core.test;

import org.springframework.beans.BeanUtils;

public class test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Aa a = new Aa();
        a.setAc("Ac");
        a.setAb("Ab");

        Bb b = new Bb();
        Long start = System.currentTimeMillis();
//        BeanUtils.copyProperties(a,b);
//        Bb b = new Bb();
//        b.setAb("AC");
//        Bb c = new Bb().copy(a);
        Aa a1 = a;
        Long end = System.currentTimeMillis();
        System.out.println(end-start);
//        System.out.println("a ="+a.getClass());
        System.out.println("a1 ="+a1);

    }
}

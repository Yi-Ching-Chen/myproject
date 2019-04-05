package com.tom;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person();
        p.hello();

        p.weight = 50.5f;
        p.height = 1.65f;
        System.out.println(p.bmi());
        //--- Wrapper class: object structure
//        Integer a = 1;
//        a.byteValue()
    }
}

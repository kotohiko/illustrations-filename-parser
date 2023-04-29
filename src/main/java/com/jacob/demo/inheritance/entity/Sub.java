package com.jacob.demo.inheritance.entity;

public class Sub extends Base {
    public int add() {
        int a = 1;
        return a + super.add();
    }

}

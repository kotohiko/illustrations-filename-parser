package com.jacob.demo.inheritance.entity;

public class Base {

    private Integer a = 0;
    private String b;
    protected Integer d = 33;

    private int private_method() {
        return 0;
    }

    public int add() {
        Integer c = 44;
        return c + d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}

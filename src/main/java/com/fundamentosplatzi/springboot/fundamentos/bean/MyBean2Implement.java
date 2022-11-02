package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBean2Implement implements MyBean {
    public MyBean2Implement() {
    }
    @Override
    public void print() {
        System.out.println("Hola desde mi implementacion 2 propia del bean");
    }
}

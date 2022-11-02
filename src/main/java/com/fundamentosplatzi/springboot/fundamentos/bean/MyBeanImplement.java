package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanImplement implements MyBean {
    @Autowired
    private ConstruirCoche mecanicoImpl;

    public MyBeanImplement() {
    }

    public MyBeanImplement(ConstruirCoche mecanicoImpl) {
        this.mecanicoImpl = mecanicoImpl;
    }

    @Override
    public void print() {
        mecanicoImpl.ponerLLantas();
        mecanicoImpl.ponerMotor();
        mecanicoImpl.ensamblarPartes();
        System.out.println("Hola desde mi implementacion propia del bean");
    }
}

package com.fundamentosplatzi.springboot.fundamentos.bean;

public class Mecanico2 implements ConstruirCoche {
    @Override
    public void ponerLLantas() {
        System.out.println("Llantas SUSUKY instaladas en el vehiculo");
    }

    @Override
    public void ponerMotor() {
        System.out.println("Motor marca hUNT instalado al vehiculo");
    }

    @Override
    public void ensamblarPartes() {
        System.out.println("Faltan partes. No esta lista para usar");
    }
}

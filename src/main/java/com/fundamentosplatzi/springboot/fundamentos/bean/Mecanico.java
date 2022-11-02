package com.fundamentosplatzi.springboot.fundamentos.bean;

public class Mecanico implements ConstruirCoche {
    @Override
    public void ponerLLantas() {
        System.out.println("Llantas de marca TOYOTA puestas instaladas al coche");
    }

    @Override
    public void ponerMotor() {
        System.out.println("Motor de marca HIDRUX instalado en el coche");
    }

    @Override
    public void ensamblarPartes() {
        System.out.println("Partes colocadas al coche. Listo para usar");
    }
}

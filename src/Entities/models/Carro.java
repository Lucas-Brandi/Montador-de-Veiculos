package Entities.models;

import Entities.components.Freio;
import Entities.components.Motor;
import Entities.components.Pneu;
import Entities.components.Suspensao;
import enums.Combustivel;
import enums.Cor;

public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(String marca, String modelo, Freio freio, Motor motor, Pneu pneu, Suspensao suspensao, Combustivel combustivel, Cor cor, int numeroPortas) {
        super(marca, modelo, freio, motor, pneu, suspensao, combustivel, cor);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void fichaTecnica() {
        System.out.println("Ficha Técnica do Carro:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Número de Portas: " + getNumeroPortas());
        System.out.println("Cor: " + getCor());
        System.out.println("Combustível: " + getCombustivel());
        System.out.println("Freio: " + getFreio());
        System.out.println("Pneu: " + getPneu());
        System.out.println("Motor: " + getMotor().getPotencia());
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }
}

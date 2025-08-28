package Entities.models;

import Entities.components.Freio;
import Entities.components.Motor;
import Entities.components.Pneu;
import Entities.components.Suspensao;
import enums.Combustivel;
import enums.Cor;

public class Moto extends Veiculo{
    private boolean temBau;
    public Moto(String marca, String modelo, Freio freio, Motor motor, Pneu pneu, Suspensao suspensao, Combustivel combustivel, Cor cor, boolean temBau) {
        super(marca, modelo, freio, motor, pneu, suspensao, combustivel, cor);
        this.temBau = temBau;
    }
    public boolean isTemBau() {
        return temBau;
    }
    public void setTemBau(boolean temBau) {
        this.temBau = temBau;
    }

    @Override
    public void fichaTecnica() {
        System.out.println("Ficha Técnica do Carro:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Possui Baú: " + (isTemBau() ? "Sim" : "Não"));
        System.out.println("Cor: " + getCor());
        System.out.println("Combustível: " + getCombustivel());
        System.out.println("Motor: " + getMotor().getPotencia());
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }
}

package Entities.models;

import Entities.components.Freio;
import Entities.components.Motor;
import Entities.components.Pneu;
import Entities.components.Suspensao;
import enums.Combustivel;
import enums.Cor;

abstract class Veiculo {
   protected String marca;
   protected String modelo;
   protected Freio freio;
   protected Motor motor;
   protected Pneu pneu;
   protected Suspensao suspensao;
   protected Combustivel combustivel;
   protected Cor cor;

    public Veiculo(String marca, String modelo, Freio freio, Motor motor, Pneu pneu, Suspensao suspensao, Combustivel combustivel, Cor cor) {
         this.marca = marca;
         this.modelo = modelo;
         this.freio = freio;
         this.motor = motor;
         this.pneu = pneu;
         this.suspensao = suspensao;
         this.combustivel = combustivel;
         this.cor = cor;
    }

   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public Freio getFreio() {
      return freio;
   }

   public void setFreio(Freio freio) {
      this.freio = freio;
   }

   public Motor getMotor() {
      return motor;
   }

   public void setMotor(Motor motor) {
      this.motor = motor;
   }

   public Pneu getPneu() {
      return pneu;
   }

   public void setPneu(Pneu pneu) {
      this.pneu = pneu;
   }

   public Combustivel getCombustivel() {
      return combustivel;
   }

   public void setCombustivel(Combustivel combustivel) {
      this.combustivel = combustivel;
   }

   public Suspensao getSuspensao() {
      return suspensao;
   }

   public void setSuspensao(Suspensao suspensao) {
      this.suspensao = suspensao;
   }

   public Cor getCor() {
      return cor;
   }

   public void setCor(Cor cor) {
      this.cor = cor;
   }
   public abstract void fichaTecnica();
   public abstract void acelerar();
}

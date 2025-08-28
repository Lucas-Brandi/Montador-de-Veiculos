package Entities.components;

public class Pneu {
    private String modelo;
    private int tamanho;

    public Pneu(String modelo) {
        this.modelo = modelo;
        this.tamanho = tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String toString() {
        return modelo;
    }
}

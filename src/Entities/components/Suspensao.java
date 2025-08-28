package Entities.components;

public class Suspensao {
    private String tipo;
    private int altura;

    public Suspensao(String tipo) {
        this.tipo = tipo;
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}

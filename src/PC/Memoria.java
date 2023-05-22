package PC;

import java.text.NumberFormat;
import java.util.Locale;

public class Memoria extends Componentes{
    private String tipo;
    private String velocidade;
    private String capacidade;

    Locale localeBR=new Locale("pt","BR");
    NumberFormat precoShow = NumberFormat.getCurrencyInstance(localeBR);

    @Override
    public String toString() {
        return "\nMemoria: " +
                "\nID: " + id +
                "\nTipo: " + tipo +
                "\nVelocidade: " + velocidade +
                "\nCapacidade: " + capacidade +
                "\nModelo: " + modelo +
                "\nFabricante: " + fabricante +
                "\nPreco: " + precoShow.format(preco);
    }

    public Memoria(String tipo, String velocidade, String capacidade, int id, String fabricante, String modelo, double preco) {
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.capacidade = capacidade;
        this.id=id;
        this.preco=preco;
        this.fabricante=fabricante;
        this.modelo=modelo;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
}

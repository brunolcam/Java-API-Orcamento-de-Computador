package PC;

import java.text.NumberFormat;
import java.util.Locale;

public class Armazenamento extends Componentes{
    private String tipo;
    private String Capacidade;
    Locale localeBR=new Locale("pt","BR");
    NumberFormat precoShow = NumberFormat.getCurrencyInstance(localeBR);

    @Override
    public String toString() {
        return "\nArmazenamento: " +
                "\nID: " + id +
                "\nTipo: " + tipo +
                "\nCapacidade: " + Capacidade + '\'' +
                "\nModelo: " + modelo +
                "\nFabricante: " + fabricante + '\'' +
                "\nPreco: " + precoShow.format(preco);
    }

    public Armazenamento(String tipo, String capacidade, int id, String fabricante, String modelo, double preco) {
        this.tipo = tipo;
        Capacidade = capacidade;
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

    public String getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(String capacidade) {
        Capacidade = capacidade;
    }
}

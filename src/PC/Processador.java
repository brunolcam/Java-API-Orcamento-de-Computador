package PC;

import java.text.NumberFormat;
import java.util.Locale;

public class Processador extends Componentes{
    private String arquitetura;
    private String socket;
     private String frequencia;
     private int quantidadeNucleos;
    Locale localeBR=new Locale("pt","BR");
    NumberFormat precoShow = NumberFormat.getCurrencyInstance(localeBR);

    @Override
    public String toString() {
        return "\nProcessador{" +
                "\nID: " + id +
                "\nArquitetura: " + arquitetura + '\'' +
                "\nSocket: " + socket + '\'' +
                "\nFrequencia: " + frequencia + '\'' +
                "\nQuantidade Nucleos: " + quantidadeNucleos +
                "\nModelo: " + modelo + '\'' +
                "\nFabricante: " + fabricante + '\'' +
                "\nPreco: " + precoShow.format(preco);
    }

    public Processador(String arquitetura, String socket, String frequencia, int quantidadeNucleos, int id, String fabricante, String modelo, double preco) {
        this.arquitetura = arquitetura;
        this.socket = socket;
        this.frequencia = frequencia;
        this.quantidadeNucleos = quantidadeNucleos;
        this.id=id;
        this.preco=preco;
        this.fabricante=fabricante;
        this.modelo=modelo;
    }

    public String getArquitetura() {
        return arquitetura;
    }

    public void setArquitetura(String arquitetura) {
        this.arquitetura = arquitetura;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public int getQuantidadeNucleos() {
        return quantidadeNucleos;
    }

    public void setQuantidadeNucleos(int quantidadeNucleos) {
        this.quantidadeNucleos = quantidadeNucleos;
    }
}

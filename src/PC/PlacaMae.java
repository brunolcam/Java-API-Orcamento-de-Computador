package PC;

import java.text.NumberFormat;
import java.util.Locale;

public class PlacaMae extends Componentes{
    private String chipset;
    private String socketProcessador;
    private String tipoMemoria;
    private String slotMemoria;
    Locale localeBR=new Locale("pt","BR");
    NumberFormat precoShow = NumberFormat.getCurrencyInstance(localeBR);

    @Override
    public String toString() {
        return "\nPlacaMae: " +
                "\nID: " + id +
                "\nChipset: " + chipset +
                "\nSocket Processador: " + socketProcessador +
                "\nTipo Memoria: " + tipoMemoria +
                "\nSlotMemoria: " + slotMemoria +
                "\nModelo: " + modelo +
                "\nFabricante: " + fabricante +
                "\nPreco: " + precoShow.format(preco);
    }

    public PlacaMae(String chipset, String socketProcessador, String tipoMemoria, String slotMemoria, int id, String fabricante, String modelo, double preco) {
        this.chipset = chipset;
        this.socketProcessador = socketProcessador;
        this.tipoMemoria = tipoMemoria;
        this.slotMemoria = slotMemoria;
        this.id=id;
        this.preco=preco;
        this.fabricante=fabricante;
        this.modelo=modelo;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getSocketProcessador() {
        return socketProcessador;
    }

    public void setSocketProcessador(String socketProcessador) {
        this.socketProcessador = socketProcessador;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public String getSlotMemoria() {
        return slotMemoria;
    }

    public void setSlotMemoria(String slotMemoria) {
        this.slotMemoria = slotMemoria;
    }
}

package PC;

import java.util.ArrayList;

public class Estoque {

    public static ArrayList<Componentes>arrayList=new ArrayList<>();
    public static void main(String[] args) {


        Componentes memoria = new Memoria("204-pin SODIMM", "DDR3-1600", "8 GB", 1, "Corsair", "ValueSelect", 288.99);
        Componentes memoria2 = new Memoria("288-pin DIMM", "DDR4-2666", "8 GB", 2, "Kingston", "HyperX Fury", 133.20);
        Componentes memoria3 = new Memoria("288-pin DIMM", "DDR4-3600", "32 GB", 3, "Corsair", "Vengeance RGB PRO", 656.99);

        Componentes armazenamento=new Armazenamento("SSD", "1 TB", 1, "SanDisk", "Plus 1TB", 328.50);
        Componentes armazenamento2=new Armazenamento("SSD", "480 GB", 2, "Kingston", "SA400S37/480G", 152.90);
        Componentes armazenamento3=new Armazenamento("SSD", "4TB", 3, "Samsung", "860 PRO 4TB", 15273.56);

        Componentes placamae = new PlacaMae("AMD B550","AM4","288-pin DIMM","4",1,"Asus","TUF GAMING B550M-PLUS (WI-FI)",1124.99);
        Componentes placamae2 = new PlacaMae("Intel Z590","LGA 1200","288-pin DIMM","4",2,"Asus","PRIME Z590-P",1169.99);
        Componentes placamae3 = new PlacaMae("Intel B660","LGA 1700","288-pin DIMM","4",3,"Gigabyte","B660M AORUS Pro DDR4",1209.60);

        Componentes processador = new Processador("64 bit", "LGA 1150", "3.4 GHz", 4, 1, "Intel","Core i5-4460",1090.80);
        Componentes processador2 = new Processador("64 bit", "LGA 1200", "3.6 GHz", 4, 2, "Intel","Core i3-10100F",395.10);
        Componentes processador3= new Processador("64 bit", "AM4", "3.9 GHz", 6, 3, "AMD","Ryzen 5 5600G",833.99);


        arrayList.add(armazenamento);
        arrayList.add(armazenamento2);
        arrayList.add(armazenamento3);
        arrayList.add(placamae);
        arrayList.add(placamae2);
        arrayList.add(placamae3);
        arrayList.add(processador);
        arrayList.add(processador2);
        arrayList.add(processador3);
        arrayList.add(memoria);
        arrayList.add(memoria2);
        arrayList.add(memoria3);




    }

    public ArrayList<Componentes> getComponentes(){
        return this.arrayList;
    }
}

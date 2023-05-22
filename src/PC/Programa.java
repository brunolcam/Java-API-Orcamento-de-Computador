package PC;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
private static double somaPreco;
private static String mostrarProdutos="";

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Estoque estoque = new Estoque();
        estoque.main(args);
        int comandoInicio;
        int comandoID;
        int comandoQuantidade;
        double soma = 0;

        do {
            System.out.println("Digite 1 para comprar memoria");
            System.out.println("Digite 2 para comprar placa mãe");
            System.out.println("Digite 3 para comprar processador");
            System.out.println("Digite 4 para comprar armazenamento");
            System.out.println("Digite 5 para ver carrinho");
            System.out.println("Digite 0 para sair");

            comandoInicio = leia.nextInt();




                    if(comandoInicio==1) { //opção memoria
                        for (int i = 0; i < estoque.getComponentes().size(); i++) {
                            if (estoque.getComponentes().get(i).getClass().equals(Memoria.class)) {
                                System.out.println(estoque.getComponentes().get(i).toString());
                            }
                        }
                        System.out.println("\nDigite o numero do ID para adicionar ao carrinho");
                        comandoID = leia.nextInt();
                        if (comandoID == 1) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                            for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                if (estoque.getComponentes().get(i).getClass().equals(Memoria.class)) {
                                    if (((Memoria) estoque.getComponentes().get(i)).getId() == comandoID) {

                                        mostrarProdutos += (estoque.getComponentes().get(i).toString()+"\nQuantidades: "+comandoQuantidade+"\n");
                                        somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);

                                    }

                                }
                            }
                        }
                        }
                        if (comandoID == 2) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                                for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                    if (estoque.getComponentes().get(i).getClass().equals(Memoria.class)) {
                                        if (((Memoria) estoque.getComponentes().get(i)).getId() == comandoID) {

                                            mostrarProdutos += (estoque.getComponentes().get(i).toString() + "\nQuantidades: " + comandoQuantidade + "\n");
                                            somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);
                                        }

                                    }
                                }
                            }
                        }
                        if (comandoID == 3) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                            for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                if (estoque.getComponentes().get(i).getClass().equals(Memoria.class)) {
                                    if (((Memoria) estoque.getComponentes().get(i)).getId() == comandoID) {
                                        mostrarProdutos += (estoque.getComponentes().get(i).toString()+"\nQuantidades: "+comandoQuantidade+"\n");
                                        somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);
                                    }

                                }
                            }
                        }
                        }



                        //===========>fim memoria
                    }
                    if (comandoInicio==2) {
                        for (int i = 0; i < estoque.getComponentes().size(); i++) {
                            if (estoque.getComponentes().get(i).getClass().equals(PlacaMae.class)) {
                                System.out.println(estoque.getComponentes().get(i).toString());
                            }
                        }
                        System.out.println("\nDigite o numero do ID para adicionar ao carrinho");
                        comandoID = leia.nextInt();
                        if (comandoID == 1) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                                for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                    if (estoque.getComponentes().get(i).getClass().equals(PlacaMae.class)) {
                                        if (((PlacaMae) estoque.getComponentes().get(i)).getId() == comandoID) {
                                            mostrarProdutos += (estoque.getComponentes().get(i).toString() + "\nQuantidades: " + comandoQuantidade + "\n");

                                            somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);
                                        }

                                    }
                                }
                            }
                        }
                        if (comandoID == 2) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                                for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                    if (estoque.getComponentes().get(i).getClass().equals(PlacaMae.class)) {
                                        if (((PlacaMae) estoque.getComponentes().get(i)).getId() == comandoID) {
                                            mostrarProdutos += (estoque.getComponentes().get(i).toString() + "\nQuantidades: " + comandoQuantidade + "\n");

                                            somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);
                                        }

                                    }
                                }
                            }
                        }
                        if (comandoID == 3) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                                for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                    if (estoque.getComponentes().get(i).getClass().equals(PlacaMae.class)) {
                                        if (((PlacaMae) estoque.getComponentes().get(i)).getId() == comandoID) {
                                            mostrarProdutos += (estoque.getComponentes().get(i).toString() + "\nQuantidades: " + comandoQuantidade + "\n");

                                            somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);
                                        }

                                    }
                                }
                            }
                        }



                        //===========>fim placa mae
                    }
                    if (comandoInicio==3) {
                        for (int i = 0; i < estoque.getComponentes().size(); i++) {
                            if (estoque.getComponentes().get(i).getClass().equals(Processador.class)) {
                                System.out.println(estoque.getComponentes().get(i).toString());
                            }
                        }
                        System.out.println("\nDigite o numero do ID para adicionar ao carrinho");
                        comandoID = leia.nextInt();
                        if (comandoID == 1) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                                for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                    if (estoque.getComponentes().get(i).getClass().equals(Processador.class)) {
                                        if (((Processador) estoque.getComponentes().get(i)).getId() == comandoID) {
                                            mostrarProdutos += (estoque.getComponentes().get(i).toString() + "\nQuantidades: " + comandoQuantidade + "\n");

                                            somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);
                                        }

                                    }
                                }
                            }
                        }
                        if (comandoID == 2) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                                for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                    if (estoque.getComponentes().get(i).getClass().equals(Processador.class)) {
                                        if (((Processador) estoque.getComponentes().get(i)).getId() == comandoID) {
                                            mostrarProdutos += (estoque.getComponentes().get(i).toString() + "\nQuantidades: " + comandoQuantidade + "\n");

                                            somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);
                                        }

                                    }
                                }
                            }
                        }
                        if (comandoID == 3) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                            for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                if (estoque.getComponentes().get(i).getClass().equals(Processador.class)) {
                                    if (((Processador) estoque.getComponentes().get(i)).getId() == comandoID) {
                                        mostrarProdutos += (estoque.getComponentes().get(i).toString() + "\nQuantidades: " + comandoQuantidade + "\n");

                                        somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);
                                    }

                                }
                            }
                            }
                        }


                        //==========>fim processador
                    }
                    if (comandoInicio==4) {
                        for (int i = 0; i < estoque.getComponentes().size(); i++) {
                            if (estoque.getComponentes().get(i).getClass().equals(Armazenamento.class)) {
                                System.out.println(estoque.getComponentes().get(i).toString());
                            }
                        }
                        System.out.println("\nDigite o numero do ID para adicionar ao carrinho");
                        comandoID = leia.nextInt();
                        if (comandoID == 1) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                                for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                    if (estoque.getComponentes().get(i).getClass().equals(Armazenamento.class)) {
                                        if (((Armazenamento) estoque.getComponentes().get(i)).getId() == comandoID) {
                                            mostrarProdutos += (estoque.getComponentes().get(i).toString() + "\nQuantidades: " + comandoQuantidade + "\n");

                                            somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);
                                        }

                                    }
                                }
                            }
                        }
                        if (comandoID == 2) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                                for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                    if (estoque.getComponentes().get(i).getClass().equals(Armazenamento.class)) {
                                        if (((Armazenamento) estoque.getComponentes().get(i)).getId() == comandoID) {
                                            mostrarProdutos += (estoque.getComponentes().get(i).toString() + "\nQuantidades: " + comandoQuantidade + "\n");

                                            somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);
                                        }

                                    }
                                }
                            }
                        }
                        if (comandoID == 3) {
                            System.out.println("Quantas unidades?");
                            comandoQuantidade = leia.nextInt();
                            if (comandoQuantidade < 1) {
                                System.out.println("Quantidade inválida");
                            } else {
                            for (int i = 0; i < estoque.getComponentes().size(); i++) {
                                if (estoque.getComponentes().get(i).getClass().equals(Armazenamento.class)) {
                                    if (((Armazenamento) estoque.getComponentes().get(i)).getId() == comandoID) {
                                        mostrarProdutos += (estoque.getComponentes().get(i).toString() + "\nQuantidades: " + comandoQuantidade + "\n");

                                        somaPreco += (estoque.getComponentes().get(i).getPreco() * comandoQuantidade);
                                    }

                                }
                            }
                            }
                        }

                        //=============>fim Armazenamento
                    }
                    if (comandoInicio==5) {
                        for (int i = 0; i < 1; i++) {
                            Locale localeBR = new Locale("pt", "BR");

                            if (mostrarProdutos == "") {
                                System.out.println("Seu carrinho está vazio\n");
                            } else {
                                System.out.println("Seus produtos são: ");
                                System.out.println(mostrarProdutos + "\n");
                                System.out.println("O total da sua compra é: ");
                                if (somaPreco>5000) {
                                    NumberFormat total = NumberFormat.getCurrencyInstance(localeBR);
                                    System.out.println(total.format(somaPreco) + "\n");
                                    System.out.println("Seu desconto é de: "+total.format(somaPreco*0.05)+"\n");
                                    System.out.println("Total a pagar: \n"+total.format(somaPreco-(somaPreco*0.05))+"\n");
                                }
                                else {
                                    NumberFormat total = NumberFormat.getCurrencyInstance(localeBR);
                                    System.out.println(total.format(somaPreco));
                                    System.out.println("Em compras acima de R$ 5000,00, você recebe 5% de desconto no valor final\n");
                                }
                            }
                        }
                    }
        }while (comandoInicio !=0);
    }
}

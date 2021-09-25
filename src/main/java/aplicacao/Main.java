package aplicacao;

import bebida.Bebida;
import aplicacao.MontarPedido;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        
        Scanner sc = new Scanner(System.in);

        MontarPedido montarPedido = new MontarPedido();

        System.out.println("QUAL BEBIDA DESEJA? ");
        System.out.println("1 - Cafe");
        System.out.println("2 - Cafe com Leite");
        System.out.println("3 - Leite com Chocolate");
        System.out.println("4 - Mocha");
        System.out.println("5 - Espresso Panna");
        System.out.println("Digite a opcao desejada: ");
        montarPedido.selectlistaBebidas(sc.nextInt());

        System.out.println("QUAL TAMANHO DESEJA? ");
        System.out.println("1 - Pequeno");
        System.out.println("2 - Medio");
        System.out.println("3 - Grande");
        System.out.println("Digite a opcao desejada: ");
        montarPedido.selectSize(sc.nextInt());

        montarPedido.morelistaAdicional();

        System.out.println("O valor total do pedido foi: " + montarPedido.getvalorTotal());
        System.out.println("A bebida selecionada foi: " + montarPedido.getlistaBebidas());
        System.out.println("Os adicionais foram: " + montarPedido.getlistaAdicional());

        sc.close();
    }

}

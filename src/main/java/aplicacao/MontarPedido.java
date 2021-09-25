package aplicacao;

import adicional.Adicional;
import adicional.CanelaEmPo;
import adicional.ChocolateEmPo;
import adicional.Cookie;
import adicional.GeloCremeLeite;
import adicional.LeiteCondensado;
import adicional.LeiteNinho;
import adicional.RaspasLimao;
import bebida.Bebida;
import bebida.Cafe;
import bebida.CafeComLeite;
import bebida.EspressoPanna;
import bebida.LeiteComChocolate;
import bebida.Mocha;
import java.util.ArrayList;
import java.util.Scanner;

public class MontarPedido {

    private int operacao;
    private double valorTotal;
    private double valorBebida;
    private int validar = 1;
    private ArrayList<String> listaAdicional = new ArrayList();
    private ArrayList<String> listaBebidas = new ArrayList();

    public void selectlistaBebidas(int operacao) {
        switch (operacao) {
            case 0:
                break;
            case 1:
                Cafe cafe = new Cafe();
                cafe.setarCafe();
                valorBebida = cafe.getValor();
                listaBebidas.add("Cafe");
                break;
            case 2:
                CafeComLeite CafeComLeite = new CafeComLeite();
                CafeComLeite.setarCafeComLeite();
                valorBebida = CafeComLeite.getValor();
                listaBebidas.add("Café com Leite");
                break;
            case 3:
                LeiteComChocolate leiteComChocolate = new LeiteComChocolate();
                leiteComChocolate.setarLeiteComChocolate();
                valorBebida = leiteComChocolate.getValor();
                listaBebidas.add("Leite com Chocolate");
                break;
            case 4:
                Mocha mocha = new Mocha();
                mocha.setarMocha();
                valorBebida = mocha.getValor();
                listaBebidas.add("Mocha");
                break;
            case 5:
                EspressoPanna espressoPanna = new EspressoPanna();
                espressoPanna.setarEspressoPanna();
                valorBebida = espressoPanna.getValor();
                listaBebidas.add("Espresso Panna");
                break;
        }
    }

    public void selectSize(int operacao) {
        switch (operacao) {
            case 1:
                valorTotal = valorBebida;
                break;
            case 2:
                valorTotal = (valorBebida * 0.2) + valorBebida;
                break;
            case 3:
                valorTotal = (valorBebida * 0.35) + valorBebida;
                break;
        }
    }

    public void selectlistaAdicional() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECIONE O ADICIONAL QUE DESEJA!");
        System.out.println("0 - Sem adicional");
        System.out.println("1 - Raspas de limao");
        System.out.println("2 - Canela em po");
        System.out.println("3 - Leite ninho (colher)");
        System.out.println("4 - Gelo de creme de leite (Cubo)");
        System.out.println("5 - Leite condensado (colher)");
        System.out.println("6 - Chocolate em po(Colher)");
        System.out.println("7 - Cookie (Unidade)");
        System.out.println("Qual a opcao desejada?");
        operacao = scanner.nextInt();
        switch (operacao) {
            case 1:
                RaspasLimao raspasLimao = new RaspasLimao();
                raspasLimao.setarRaspasLimao();
                valorTotal += raspasLimao.getValor();
                listaAdicional.add("Raspas de limao");
                break;
            case 2:
                CanelaEmPo canelaEmPo = new CanelaEmPo();
                canelaEmPo.setarCanelaEmPo();
                valorTotal += canelaEmPo.getValor();
                listaAdicional.add("Canela em po");
                break;
            case 3:
                LeiteNinho leiteNinho = new LeiteNinho();
                leiteNinho.setarLeiteNinho();
                valorTotal += leiteNinho.getValor();
                listaAdicional.add("Leite ninho (colher)");
                break;
            case 4:
                GeloCremeLeite geloCremeLeite = new GeloCremeLeite();
                geloCremeLeite.setarGeloCremeLeite();
                valorTotal += geloCremeLeite.getValor();
                listaAdicional.add("Gelo de creme de leite (Cubo)");
                break;
            case 5:
                LeiteCondensado leiteCondensado = new LeiteCondensado();
                leiteCondensado.setarLeiteCondensado();
                valorTotal += leiteCondensado.getValor();
                listaAdicional.add("Leite condensado (colher)");
                break;
            case 6:
                ChocolateEmPo chocolateEmPo = new ChocolateEmPo();
                chocolateEmPo.setarChocolateEmPo();
                valorTotal += chocolateEmPo.getValor();
                listaAdicional.add("Chocolate em po(Colher)");
                break;
            case 7:
                Cookie cookie = new Cookie();
                cookie.setarCookie();
                valorTotal += cookie.getValor();
                listaAdicional.add("Cookie (Unidade)");
                break;
        }
    }

    public void morelistaAdicional() {
        Scanner scanner = new Scanner(System.in);
        while (validar == 1) {
            System.out.println("Quer selecionar mais um adicional? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            validar(scanner.nextInt());
        }

    }

    private void validar(int operacao) {
        switch (operacao) {
            case 1:
                selectlistaAdicional();
                break;
            case 2:
                validar -= 1;
                break;
        }

    }

    public double getvalorTotal() {
        return valorTotal;
    }

    public ArrayList<String> getlistaAdicional() {
        return listaAdicional;
    }

    public ArrayList<String> getlistaBebidas() {
        return listaBebidas;
    }
}

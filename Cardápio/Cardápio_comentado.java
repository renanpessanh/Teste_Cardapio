import java.util.Scanner; //Importando a biblioteca Scanner

public class Main { //Declarando class Main publico
    public static void main(String[] args) { //Declarando a função String do tipo void
        
        Scanner entrada = new Scanner(System.in); //Scanner é uma forma de armazenar a informação dada pelo usuário
        
        int codigo = 1, quantidade; //Declarando as variavéis CODIGO e QUANTIDADE como inteiras
        double preco, totalGeral = 0.0; //Declarando as variáveis PREÇO e TOTALGERAL como double (reais)

                System.out.println("------------------MENU-------------------"); //System.out.println = escrevendo oq vai aparecer na tela
                
  	    while (codigo != 0) { //Declarando que se o codigo for diferente de 0 ele continua rodando
  	    
                System.out.println("-----------------------------------------"); 
                System.out.println("");
                System.out.println(" COD   |        PRATO        |    PREÇO"); 
                System.out.println(""); 
                System.out.println(" 100   |   Cachorro Quente   |    R$1,20 "); 
                System.out.println(" 101   |   Bauru Simples     |    R$1,30 "); 
                System.out.println(" 102   |   Bauru com Ovo     |    R$1,50 "); 
                System.out.println(" 103   |   Hambúrguer        |    R$1,20 "); 
                System.out.println(" 104   |   Cheeseburguer     |    R$1,30 "); 
                System.out.println(" 105   |   Refrigerante      |    R$1,00 "); 
                System.out.println("-----------------------------------------"); 
                System.out.println("Informe o código do item escolhido (ou 0 para encerrar o pedido):"); //System.out.println = escrevendo oq vai aparecer na tela
                System.out.println("");
                
            codigo = entrada.nextInt(); //Escanear a variável CODIGO como inteira

                if (codigo == 0) { //Se o CODIGO digitado foi igual a 0, encerrar o programa
                System.out.println("Programa encerrado pelo usuário"); //System.out.println = escrevendo oq vai aparecer na tela, caso o usuário digite 0
            } else if (codigo != 0) { //Se o CODIGO digitado foi diferente de 0, continuar o programa com a quantidade desejada
                System.out.println("Informe a quantidade desejada:"); //System.out.println = escrevendo oq vai aparecer na tela
                
            quantidade = entrada.nextInt(); //Escanear a variável QUANTIDADE como inteira

                if (codigo == 100) { //Cachorro Quente
                    preco = 1.20; //Atribuindo valor à PREÇO
                } else if (codigo == 101) { // Bauru Simples
                    preco = 1.30; //Atribuindo valor à PREÇO
                } else if (codigo == 102) { //Bauru com Ovo
                    preco = 1.50; //Atribuindo valor à PREÇO
                } else if (codigo == 103) { //Hambúrguer
                    preco = 1.20; //Atribuindo valor à PREÇO
                } else if (codigo == 104) { //Cheeseburguer
                    preco = 1.30; //Atribuindo valor à PREÇO
                } else if (codigo == 105) { //Refrigerante
                    preco = 1.00; //Atribuindo valor à PREÇO
                } else {
                System.out.println("Código inválido. Tente novamente.");//System.out.println = escrevendo oq vai aparecer na tela caso o usuário escolha um codigo inexistente
                    continue;
                }

                double totalItem = preco * quantidade; //Cálculo do total do item (PREÇO X QUANTIDADE)
                System.out.printf("Item %d: %d x R$ %.2f = R$ %.2f", codigo, quantidade, preco, totalItem);//Printar na tela o cod,quant,preço e o total, limitando a 2 casa decimais (formatando)
                totalGeral += totalItem;//Somando as variáveis (TOTALGERAL = TOTALITEM + TOTALGERAL)
            }
        }
        System.out.printf("Total geral do pedido: R$ %.2f", totalGeral);//Somar os pedidos e limitar/formatar o valor a 2 casas decimais 
        entrada.close();//encerramento do Scanner
    }
}
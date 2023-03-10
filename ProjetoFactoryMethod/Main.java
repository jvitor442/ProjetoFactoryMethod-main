package TecnicasDeProgramacaoII.ProjetoFactoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String userChoice = "a";
        int contWhile = 35;
        String nome;
        String cargo;
        Validando validando = new Validando();
        while(contWhile != 2){
            System.out.println("Digite 1 Para adicionar uma pessoa\nDigite Q para sair");
            userChoice = ler.next();
            switch(userChoice){
                case "1":
                    System.out.println("Digite o nome:");
                    nome = ler.next();
                    System.out.println("Digite a relação:");
                    cargo = ler.next();
                    System.out.println(nome + validando.validar(cargo));
                    break;
                case "Q":
                    contWhile = 2;
                    break;
                default:
		            System.out.println("Opcao invalida !!!");
                    break;
            }
        }

        System.out.println("Programa encerrado");
    
    }
}

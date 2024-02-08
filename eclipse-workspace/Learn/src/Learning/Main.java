package Learning;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao Portão de Baldur! \nVamos jogar? \n(Y or N)");
		String ans= scanner.nextLine();
		if (ans.equalsIgnoreCase("y")){
			System.out.println("Perfeito! \nVAMOS JOGAR!");
		} else {
			System.out.println("Você não tem opção! \nVAMOS JOGAR!");
		}
	    System.out.println("");
		System.out.println("Vamos criar seu personagem: \nQual seu nome?");
		String name= scanner.nextLine();
		if(name.isEmpty()) {
			name = "Tav";
			System.out.println("Bem Vindo a Baldur!" + " "+ name);
			System.out.println("");
		}else{
			System.out.println("Bem Vindo a Baldur!" +" "+ name);
			System.out.println("");
		}
		String racex = " ";
		boolean escolhaValida = false;
		while (!escolhaValida) {
			System.out.println("Escolha sua Raça: \n1. Humano \n2. Orc \n3. Anão\n4. Elfo");
            int race = scanner.nextInt();
            scanner.nextLine(); 
            if (race == 1) {
                System.out.println("Você escolheu Humano");
                System.out.println("");
                racex = "Humano";
                escolhaValida = true;
            } else if (race == 2) {
                System.out.println("Você escolheu Orc");
                System.out.println("");
                racex = "Orc";
                escolhaValida = true;
            } else if (race == 3) {
                System.out.println("Você escolheu Anão");
                System.out.println("");
                racex = "Anão";
                escolhaValida = true;
            } else if (race == 4) {
                System.out.println("Você escolheu Elfo");
                System.out.println("");
                racex = "Elfo";
                escolhaValida = true;
            } 
            else {
                System.out.println("Opção inválida. Por favor, escolha uma das opções (1, 2, 3 ou 4)");
                System.out.println("");
            }
        }
		int classe = 0;
		String classex = " ";
		boolean escolhaValida1 = false;
		while (!escolhaValida1) {
			System.out.println("Escolha sua Classe: \n1. Guerreiro \n2. Bruxo \n3. Ladino");
            classe = scanner.nextInt();
            scanner.nextLine(); 
            if (classe == 1) {
                System.out.println("Você escolheu Guerreiro");
                System.out.println("");
                classex = "Guerreiro";
                escolhaValida1 = true;
            } else if (classe == 2) {
                System.out.println("Você escolheu Bruxo");
                System.out.println("");
                classex = "Bruxo";
                escolhaValida1 = true;
            } else if (classe == 3) {
                System.out.println("Você escolheu Ladino");
                System.out.println("");
                classex = "Ladino";
                escolhaValida1 = true;
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma das opções (1, 2 ou 3).");
                System.out.println("");
            }
        }
              System.out.println("Okay, vamos lá" + " " + name+", " + "Você! Um" +" " + racex + " " + classex +" "+"Está pronto para encarar alguns desafios?");
              System.out.println(" ");
              if(classe == 3) {
            	  System.out.println("Bem vindo a prisão de Baldurs \nVocê,"+" "+name+", "+"foi pego enquanto fazia suas missões de espionagem e acabou sendo capturado por guardas de Baldurs");
            	  System.out.println("Porém, você, como um bom ladino, está preparado para lidar com as situações mais adversas e tenho certeza que sabe o que fazer agora");
            	  System.out.println("O que você quer fazer?: \n1. Fugir \n2. Conversar com o colega de cela \n3. Fingir que está passando mal");
                int choice = 0;
                String choicex = " ";
          		boolean escolhaValida2 = false;
          		while (!escolhaValida2) {
                      choice = scanner.nextInt();
                      scanner.nextLine(); 
                      if (choice == 1) {
                          System.out.println("");
                          choicex = "Fugir";
                          escolhaValida2 = true;
                      } else if (choice == 2) {
                          System.out.println("");
                          choicex = "Conversar";
                          escolhaValida2 = true;
                      } else if (choice == 3) {
                          System.out.println("");
                          choicex = "Fingir";
                          escolhaValida2 = true;
                      } else {
                          System.out.println("Opção inválida. Por favor, escolha uma das opções (1, 2 ou 3).");
                          System.out.println("");
                      }
                  }
              }
        scanner.close();
    }
}

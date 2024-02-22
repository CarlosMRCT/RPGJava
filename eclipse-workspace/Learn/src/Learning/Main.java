package Learning;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// introdução )(
		System.out.println("Bem vindo ao Portão de Baldur! \nVamos jogar? \n(Y or N)");
		String ans = scanner.nextLine();
		if (ans.equalsIgnoreCase("y")) {
			System.out.println(" ");
			System.out.println("Perfeito! \nVAMOS JOGAR!");
		} else {
			System.out.println(" ");
			System.out.println("Você não tem opção! \nVAMOS JOGAR!");
		}
		// criação de personagem
		// nome
		System.out.println("");
		System.out.println("Vamos criar seu personagem: \nQual seu nome?");
		String name = scanner.nextLine();
		switch (name) {
		case "":
			name = "Tav";
			System.out.println(" ");
			System.out.println("Bem vindo ao mundo de baldurs " + name);
			break;
		default:
			System.out.println(" ");
			System.out.println("Bem vindo ao mundo de baldurs " + name);
			break;
		}
		// raça
		int race = 0;
		String racea = " ";
		System.out.println("Escolha sua raça:\n1. Humano\n2. Anão\n3. Elfo\n4. Morto-Vivo");
		boolean escolhaValida = false;
		while (!escolhaValida) {
			race = scanner.nextInt();
			switch (race) {
			case 1:
				racea = "Humano";
				System.out.println(" ");
				System.out.println("Humano!\nWOW\nNão tinha nada mais criativo em mente?");
				escolhaValida = true;
				break;
			case 2:
				racea = "Anão";
				System.out.println(" ");
				System.out.println("Anão!\nEscolha legal\nCom toda certeza você gosta de folk e cerveja.");
				escolhaValida = true;
				break;
			case 3:
				racea = "Elfo";
				System.out.println(" ");
				System.out.println("Elfo?!\nEscolha infantil\nCerteza que você tem 10 anos!");
				escolhaValida = true;
				break;
			case 4:
				racea = "Morto-Vivo";
				System.out.println(" ");
				System.out.println("Morto-Vivo!\nEstranho\nDeve ser algum maluco que gosta de morte.");
				escolhaValida = true;
				break;
			default:
				System.out.println("Escolha inválida! Por favor, escolha uma das opções disponíveis.");
				scanner.nextLine();
				System.out.println("Escolha sua raça:\n1. Humano\n2. Anão\n3. Elfo\n4. Morto-Vivo");
				break;
			}
		}
		// classe
		int classe = 0;
		String classex = " ";
		String[] skills = new String[3];
		System.out.println(" ");
		System.out.println("Escolha sua Classe: \n1. Guerreiro \n2. Bruxo \n3. Ladino");
		boolean escolhaValida1 = false;
		while (!escolhaValida1) {
			classe = scanner.nextInt();
			switch (classe) {
			case 1:
				classex = "Guerreiro";
				skills[0] = "Espadada";
				skills[1] = "Correr";
				skills[2] = "Brado do Guerreiro";
				escolhaValida1 = true;
				break;
			case 2:
				classex = "Bruxo";
				skills[0] = "Raio mistico";
				skills[1] = "Fugir";
				skills[2] = "Gargalhada maléfica de Athen";
				escolhaValida1 = true;
				break;
			case 3:
				classex = "Ladino";
				skills[0] = "Apunhalada";
				skills[1] = "Esconder";
				skills[2] = "Bomba de Luz";
				escolhaValida1 = true;
				break;
			default:
				System.out.println("Escolha inválida! Por favor, escolha uma das opções disponíveis.");
				scanner.nextLine();
				System.out.println("Escolha sua Classe: \n1. Guerreiro \n2. Bruxo \n3. Ladino");
				break;
			}
		}

		// história
		System.out.println("Okay, vamos lá" + " " + name + ", " + "Você! Um" + " " + racea + " " + classex + ", "
				+ "Está pronto para encarar alguns desafios?");
		System.out.println(" ");
		System.out.println("Suas habilidades são:");
		System.out.println(" ");
		for (String skill : skills) {
			System.out.println(skill);
		}
		System.out.println(" ");
		System.out.println("Bem vindo a prisão de Baldurs \nVocê," + " " + name + ", "
				+ "foi pego enquanto fazia suas missões de espionagem e acabou sendo capturado por guardas de Baldurs");
		System.out.println(
				"Porém, como um bom espião do governo creio que está preparado para lidar com as situações mais adversas e tenho certeza que sabe o que fazer agora");
		System.out.println(" ");
		System.out.println(
				"O que você quer fazer?: \n1. Fugir usando suas habilidades \n2. Conversar com o colega de cela \n3. Fingir que está passando mal");
		int choice = 0;
		String choicex = " ";
		boolean escolhaValida2 = false;
		boolean erro = false;
		while (!escolhaValida2) {
			if (erro == true) {
				System.out.println("Escolha novamente!");
				System.out.println(
						"O que você quer fazer?: \n1. Fugir usando suas habilidades \n2. Conversar com o guarda \n3. Fingir que está passando mal");
			}
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				if (classex == "Bruxo") {
					System.out.println(
							"Infelzimente suas dádivas de bruxo não lhe ensinaram como escapar de celas\nSeu esforço serviu de nada.");
					erro = true;
				}
				if (classex == "Guerreiro") {
					System.out.println(
							"Você é forte (muito forte diga-se de passagem), porém isso é uma CELA (de metal)\nSeu esforço serviu de nada");
					erro = true;
				} if (classex == "Ladino"){
					System.out.println(
							"Você é um ladino MUITO habilidoso, utilizando todo o seu conhecimento você consegue abrir a fechadura\nvocê passa pelos guardas, pega suas coisas e foge!");
					escolhaValida2 = true;
				}
				break;
			case 2:
				if (classex == "Bruxo") {
					System.out.println(
							"Você tenta se comunicar com o guarda, o mesmo resmunga e diz que não vai falar com você\nPorém você é um Bruxo, treinado e com um patrono generoso\nVocê usa suas habilidades e o mesmo não resiste ao seu charme e abre a cela para você");
					escolhaValida2 = true;
				}
				if (classex == "Guerreiro") {
					System.out.println(
							"Você não é dos seres mais carismáticos, os anos de treinamento lhe deixaram ranzinza e bruto\nSeu esforço serviu de nada");
					erro = true;
				} if (classex == "Ladino"){
					System.out.println(
							"Você até tenta se comunicar com o guarda, ele te ignora e cospe na sua sela\nSeu esforço serviu de nada");
					erro = true;
				}
				break;
			}
		}
		System.out.println("Você conseguiu sair, bem vindo as ruas");

		scanner.close();
	}
}

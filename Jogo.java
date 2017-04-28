import java.util.Random;
import java.util.Scanner;

public class Jogo{
	public static void main(String[] args) {
		int vida = 3;
		int nivel = 1;
		int pontos = 0;
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int resultado = 0;
		
		while (opcao != 2){
			System.out.println("\n");
			System.out.println(" ----- Raciocínio matemático ---- ");
			System.out.println("|                                |");
			System.out.println("|              Menú              |");
			System.out.println("| 1- Jogar                       |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("| 2- Sair                        |");
			System.out.println("|                                |");
			System.out.println(" -------------------------------- ");
			System.out.print("Digite a opção: ");
			opcao = sc.nextInt();
			
			if ( opcao == 1 ){
				System.out.println("");
				System.out.println("");
				while( vida > 0 ){
					System.out.println("Vidas: "+vida);
					System.out.println("Nível: "+nivel);
					System.out.println("");

					if ( nivel == 1 ){
						int n1 = rand.nextInt(20);
						int n2 = rand.nextInt(20);
						int operacao = rand.nextInt(2);
						if ( operacao == 0 ){
							resultado = n1 + n2;
							System.out.print(n1 + " + " + n2 + " = ");
						} else {
							resultado = n1 - n2;
							System.out.print(n1 + " - " + n2 + " = ");
						}
					} else if ( nivel == 2 ){
						int n1 = rand.nextInt(100);
						int n2 = rand.nextInt(10);
						int operacao = rand.nextInt(2);
						if ( operacao == 0 ){
							resultado = n1 * n2;
							System.out.print(n1 + " * " + n2 + " = ");
						} else {
							while ( n2 == 0 ){
								n2 = rand.nextInt(10);
							}
							resultado = (int) n1 / n2;
							System.out.print("Apenas o inteiro de: " + n1 + " / " + n2 + " = ");
						}
					} else if ( nivel == 3 ){
						int n1 = rand.nextInt(100);
						int n2 = rand.nextInt(10);
						int operacao = rand.nextInt(4);
						if ( operacao == 0 ){
							resultado = n1 + n2;
							System.out.print(n1 + " + " + n2 + " = ");
						} else if ( operacao == 1 ) {
							resultado = n1 - n2;
							System.out.print(n1 + " - " + n2 + " = ");
						} else if ( operacao == 3 ){
							resultado = n1 * n2;
							System.out.print(n1 + " * " + n2 + " = ");
						} else {
							while ( n2 == 0 ){
								n2 = rand.nextInt(10);
							}
							resultado = (int) n1 / n2;
							System.out.print("Apenas o inteiro de: " + n1 + " / " + n2 + " = ");
						}
					}

					int res = sc.nextInt();
					if ( res == resultado ){
						System.out.println("Você acertou!");
						pontos++;
						if ( pontos == 10 && nivel < 3 ){
							System.out.println("Parabéns, você subiu de Nível");
							nivel++;
							pontos = 0;
						}
					} else {
						System.out.println("Você errou!!");
						vida--;
					}
					System.out.println("");
					System.out.println("");
				}
				System.out.println(" Game Over!!");
			}
		}
	}
}
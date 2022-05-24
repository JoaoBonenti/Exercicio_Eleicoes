import java.util.Scanner;
public class Eleicoes01 {
 public static void main(String[] args) {
  //Uso do Scanner para entrada de dados
  Scanner scan = new Scanner(System.in);
  //Declaração das variáveis
  int numEleitor = 0;
  int PT=0, PDT=0, PL=0, PSDB=0, nulo=0, branco=0;
  
  //Uso do For para contagem e repetição do programa
  for(int i = 0; i < 50; i++)  {
    //Contador
    numEleitor++;
    System.out.println("\nEleitor " + numEleitor +", digite o numero do candidato a sua escolha.");
    //Declaração e entrada de dados da variável numero
    System.out.print("Digite '13' para PT, '12' para PDT, '22' para PL, '45' para PSDB, '0' para voto Nulo, ou digite '9' para voto em branco!\nSua escolha e: ");
    int numero = scan.nextInt();

   //Uso do Switch para determinar e organizar casos distintos, e também somar aos contadores
   switch (numero){
     case 13:
       System.out.println("Voce votou no Candito do partido PT!");
       PT++;
       break;
     case 12:
       System.out.println("Voce votou no Candito do partido PDT!");
       PDT++;
       break;
     case 22:
       System.out.println("Voce votou no Candito do partido PL!");
       PL++;
       break;
     case 45:
       System.out.println("Voce votou no Candito do partido PSDB!");
       PSDB++;
       break;
     case 0:
       System.out.println("Voce optou pelo voto Nulo!");
       nulo++;
       break;
     case 9:
       System.out.println("Voce optou por votar em Branco!");
       branco++;
       break;
     default:
       System.out.println("Voto invalido! Seu voto nao sera considerado na contagem final!"); 

    }
  }
    //Apresentação para o usuário dos valores agrupados e devidamente formatados
    System.out.printf("\nO total de votos para o PT foi igual a: " + PT + "!");
    System.out.printf("\nO total de votos para o PDT foi igual a: " + PDT + "!");
    System.out.printf("\nO total de votos para o PL foi igual a: " + PL + "!");
    System.out.printf("\nO total de votos para o PSDB foi igual a: " + PSDB + "!");
    System.out.printf("\nO total de votos nulos foi igual a: " + nulo + "!");
    System.out.printf("\nO total de votos em branco foi igual a: " + branco + "!"); 
 }
}

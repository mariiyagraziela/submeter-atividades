import java.awt.Toolkit;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // apresentação
    System.out.println("Ola usuário, me chamo Gab, irei lhe" +
        "ajudar no " +
        "cadastro do nosso aplicativo Meg!\n");
    // Pergutar o nome do usuario
    String terminar = "s";
    Scanner scanner2 = new Scanner(System.in);
    while (terminar.equals("s")) {

      System.out.println("Vamor começar o cadastro:\n");
      String sobreONome = "Em primeiro lugar, informe seu " +
          "nome: ";
      System.out.println(sobreONome);
      String nome = scanner.nextLine();
      System.out.println("\n");
      // Pergutar a idade do usuario
      String sobreAIdade = "Óla " + nome + ", é um prazer. " +
          "Agora eu gostaria de saber a sua idade: ";
      System.out.println(sobreAIdade);
      int idade = scanner.nextInt();
      System.out.println("\n");
      // Verificando a idade
      if (idade > 18) {
        System.out.println("vejo que o usuário é maior de idade " +
            "então estarei liberando o seu acesso ao nosso sistema, seja bem vindo!");
      } else {
        System.out.println("Infelizmente não vou poder continuar nosso " +
            "cadastro. Podemos continuar quando você for maior de idade, ate a próxima!");
        break;
      }
      // Perguntar se o usuario deseja continuar
      System.out.println("\n");
      System.out.println("- Deseja realizar mais um cadastro? " +
          "digite s!");
      System.out.println("- Caso deseje encerra por aqui, digite n!");
      String terminarPrograma = scanner2.nextLine();

      terminar = terminarPrograma;
      System.out.println("\n");

    }

    System.out.println("Tenha um otimo dia!");
    scanner.close();
    scanner2.close();
  }
}

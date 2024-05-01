import java.util.Scanner;

/**
 * Escreva uma descrição da classe personagem aqui.
 * classe personagem. faz parte do mineprojeto3. Outra metade da historia interativa
 * @author (Graziela) 
 * @version (30/04/2011)
 */
public class Main_mineprojeto3 {
    public static void  main(String[] args){
       Scanner scan = new Scanner(System.in);
       mineprojeto3_capitulo capitulo = new mineprojeto3_capitulo("Capitulo4", "Anos se passa e nasçe um novo heroi, que desde pequeno foi ensinado a lutar\n"+
        "para defender seu reino, em uma batalha contra terriveis feras.",null,null,100);
       String historia= "em processo";    
       
       //inicil da historia 
       capitulo.mostrar();
       System.out.println();
       //parte onde o personagem treina
       System.out.println("Missao: Treine com um boneco de palha");
       System.out.println("escolha seus golpes\n"+
       "Escolha atacar pela direita os esquerda.");
       capitulo.escolher();
       System.out.println("missao cumprida");
       System.out.println();
       System.out.println("Seu objetivo agora e fazer uma trilha pela floresta para recuperar um antigo artefato "+
       "Sua nova missao comecou:\n\n"+
       "voçe encontra dois caminhos, vai seguir pela direita ou esquerda");
       capitulo.escolhercaminho();
       System.out.println("Voçe encontra um inimigo na floresta. atacar pela direita, ou esquerda");
       capitulo.escolher();
       System.out.println("Voçe encontra dois caminhos a direita e o caminho mais perto, porem existe mostros,\n"+
       "e o caminho mais longo e mais seguro. Qual caminho escolher:?");
       capitulo.escolher();
       capitulo.escolhercaminho();
       if (capitulo.escolha == "direita"){
           System.out.println("escolha "+capitulo.escolha);
           System.out.println("Voçe encontra um inimigo na floresta. Atacar pela direita, ou esquerda");
           capitulo.escolhercaminho();
           System.out.println();
           System.out.println("Voçe encontra um inimigo na floresta. Atacar pela direita, ou esquerda");
           capitulo.escolhercaminho();
           System.out.println();
           System.out.println("A missao de recuperar o artefato foi concluido com sucesso");
       }
       else{
           System.out.println("A missao de recuperar o artefato foi concluido com sucesso");
       }
       System.out.println(capitulo.energiaPersonagem);
       }
}

  
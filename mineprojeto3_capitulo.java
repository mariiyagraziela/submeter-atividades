import java.util.Scanner;
/**
 * Escreva uma descrição da classe mineprojeto3 aqui.
 * Em relaçao a atividade mineprojeto3
 * @author (Graziela) 
 * @version (30/04/2024)
 */
//classe do projeto
public class mineprojeto3_capitulo
{
    String nome;
    String texto="texto";
    String escolha1= null;
    String escolha2=null;
    int energiaPersonagem = 30;
    String escolha;
    Scanner scan = new Scanner(System.in);
    // Construtor
    public mineprojeto3_capitulo(String nome, String texto, String escolha1, String escolha2, int alteracaoEnergia) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.energiaPersonagem = alteracaoEnergia;
    }

    // Método para mostrar as informações do capítulo
    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Texto: "+ texto);
        System.out.println("Energia: "+ energiaPersonagem );
        System.out.println("Caminho escolhido: "+ escolha );
        // Alterar a energia do personagem
    }

   // Método para escolher uma opção usando um loop for e validação de entrada
    public void escolher() {
        for(int j=1 ; j<4;j++){
           System.out.println("Escolha [1]direita os [2]esquerda. Digite 1 ou 2");
           int escolha_deataque = scan.nextInt();
           if(escolha_deataque == 1){
               System.out.println("Direita");
           }
           else{
               System.out.println("Esquerda");
           }  
       
           energiaPersonagem -= 5;
        }
    
    }
    public void escolhercaminho(){
         System.out.println("Escolha [1]direita os [2]esquerda. Digite 1 ou 2");
           int escolha_deataque = scan.nextInt();
           if(escolha_deataque == 1){
               System.out.println("Direita");
               escolha = escolha1 = "direita";
           }
           else{
               System.out.println("Esquerda");
               escolha = escolha2 = "Esquerda";
           }  
     
    }
}

// codigo de java atualizado
// codigo de java atualizado
import java.util.Scanner;
/**
 * Escreva uma descrição da classe Main_mineprojeto1 aqui.
 * Arquivo principal do projeto - mineprojeto2
 * @author (Graziela)
 * @version (um número da versão ou uma data)
 */

public class Main_mineprojeto2
{
   public static void  main(String[] args){
       //Declarando os objetos
       mineprojeto2 personagem1 = new mineprojeto2();
       mineprojeto2 personagem2 = new mineprojeto2();
       Scanner scan = new Scanner(System.in);
       String historia= "em processo";

       //Esquema para escolher do persongem
       System.out.println("Escolha o personagem");
       System.out.println("1-Joana, 22 anos, 24(HP)");
       System.out.println("2-Jarbas, 36 anos, 21(HP)");
       int escolha1 = scan.nextInt();
       String personagem;
       int energia;
       if (escolha1 == 1){
           personagem = personagem1.nome= "Joana";
           energia = personagem1.energia;
        }
       else{
          personagem = personagem2.nome= "Jarbas";
          energia = personagem2.energia;
        }
       System.out.println("Personagem escolhido= "+personagem+ "Energia= "+energia);

        //Começo da historia ou começo do loop
        while (energia > 0 && !historia.equals("final")){
           System.out.println("Capitulo 1");
           System.out.println("Energia:" + energia + "\n");
           System.out.println("Era uma vez um reino encantado. Em um dia chuvoso");
           System.out.println("um dragao atacou o reino e sequestrou a princesa. O");
           System.out.println("rei desesperado ofereceu tesouros ao bravo guerreiro ");
           System.out.println("que fosse em busca de sua amada filha e traze-la de");
           System.out.println("volta. Sem sucesso, pois todos estavam abalos com o ");
           System.out.println("ataque da grande fera, o rei estava sem esperaça.");
           System.out.println("De repente se apresentatando como o salvador, que iria");
           System.out.println("trazer a princesa de volta. Voçe, um simples aldeao");
           System.out.println("poderar cumprir essa arriscada missao? o rei incredulo");
           System.out.println("porem sem escolha, decide concorda com a sua decisao, e ");
           System.out.println("te oferece os melhores esquipamentos e uma poção que pode");
           System.out.println("aumentar os pontos de energia, ou pode matar que a consumir!");
           System.out.println("E assim começa uma grande jornada");
           System.out.println("Será que ainda da tempo de desistir!!!!!!!! \n");

           System.out.println(" Capitulo 2");
           System.out.println("Energia:" + energia + "\n");
           System.out.println("Você parte em uma grande jornada, ate que no meio do caminho voçe encontra um troll:");
           //Escolher a ação do personagem
           System.out.println("--Deseja enfrentar ou fungir (digite [1] para fugir] ou [2] para lutar. )--");
           int escolha2 = scan.nextInt();
           if (escolha2 == 2){
             System.out.println("Voçe ganhou a luta.");
             energia -= 15;
             System.out.println("Pontos de vida -15");
            }
           System.out.println("Voçe segue a viagem e depois de um tempo, se depara com dois caminhos ");
           System.out.println("O da direita e o da esquerda:");
           System.out.println("--Digite: [1] para ir pra a direita ou [2] para ir para a esquerda.--");
           int escolha3 = scan.nextInt();
           if (escolha3 == 1){
             System.out.println("Voçe acabou caindo em um buraco");
             energia -= energia;
             break;
            }
           System.out.println("Voçe encontra o caminho certo e continua a viagem e a cada passo dando");
           System.out.println("é possivel sentir o barulho do grande dragão, seu oponete final.");
           System.out.println("\n");
           

           System.out.println(" Capitulo 3");
           System.out.println("Energia:" + energia + "\n");
           System.out.println("chegando no castelo voçe avista acima do castelo, o sobrevoando, a temina");
           System.out.println("fera e no auto da torre a bela princesa! Voçe decide bolar um plano");
           System.out.println("1-Voçe toma coragem e cria para tomar a formula magica! ");
           System.out.println("2-Voçe decide tentar entrar no castelo sem ser visto.\n");

           // Decidir o caminho que o persongem vai seguir
           int escolha4 = scan.nextInt();
           if (escolha4 == 1){
             //primeiro final
             System.out.println("Decidido a tomar a formula magica, voçe sente seu corpo pegar fogo");
             System.out.println("então se torna capaz de enfrentar o dragão, e vence!");
             System.out.println("em seguida sobe na torre e leva de volta a princesa para casa!");
             System.out.println("E por sua nobre luta, se casa com sua amada princesa! ");
             System.out.println("no final vive uma vida longa e farta de prospeidade");
            }
           else{
            System.out.println("O personagem obtem sucesso na sua entrada sorrateira, porém a princesa se ");
            System.out.println("recusa a partir, por causa da sua entrada não \"triufante\" e decide ficar no");
            System.out.println("castelo. Se opção voçe a amarra com os lenções e a leva e volta para o castelo.");
            System.out.println("Sabendo de toda a hisoria, o rei resolve de dar metadeda recompensa! Por fim voçe");
            System.out.println("viver uma vida pacata, não luxuosa, vivendo em uma fazenda afastado da reino.");
            System.out.println("E vive feliz para sempre!");
           }
           System.out.println("parabéns "+personagem+" sua jornada foi memoravél, e irá ser contada por gerações!");
           historia ="final";
        }
        if (energia == 0){
            System.out.println("Voçe perdeu, acabou toda a sua energia!");
        }
        else{
            System.out.println("Final de historia!!");
        }

    }
}

/**
 * Projeto referente a atividade de programaçao "mineprojeto1".
 * 
 * @author (Graziela) 
 * @version (11/04/2024)
 */
\\arquivo modificado
\\modificado novamente
\\outra modificação
import java.util.Scanner;
public class mineprojeto1
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Historia: perdida");
        System.out.println("Era uma vez uma gata peluda e curiosa, um dia ela");
        System.out.println("se perdeu, levada pela sua curiosidade adentrou uma");
        System.out.println("floresta. por para tentar capitura uma borboleta ");
        System.out.println("e acabou entreando ainda mais na floresta.");
        
        System.out.println("\n CAPITULO 2");
        System.out.println("A felina percebeu que havia 2 caminhos");
        System.out.println("a sua frente, o primeiro caminho a sua esquerda e");
        System.out.println("o segundo caminho a sua direita.");
        System.out.println("\n");
        System.out.println("Digite: "+" (\"esquerda\") ou \"(Direita)\"");
        System.out.println(", Ou ela pode voltar de onde veio(\"voltar\")");
        String escolha1 = scan.nextLine();
        System.out.println(escolha1);
        if(escolha1.equalsIgnoreCase("direita")){
            System.out.println("Ela decide ir pelo caminho da direita,ao longo da ");
            System.out.println("sua caminhda ela percebeu movimentos, assustada ");
            System.out.println("ela corre desesperada, ate perceber que eram outros");
            System.out.println("felinos, que moravam naquele lugar.");
            System.out.println("1- Fazer amizade com os felinos: ");
            System.out.println("2- voltar e tentar outro caminho ");
            System.out.print("Digite\"amizade\" ou \" voltar\" ");
            String escolha2 = scan.nextLine();
        
            if(escolha2.equalsIgnoreCase("amizade"))
            {
                System.out.println("Ela decide fazer amizade com os moradores, pra sua");
                System.out.println("sorte eles conseguem a entender e a ajudam a encontrar");
                System.out.println("o caminho para fora da floresta.");
                System.out.println("FIM!");
            }
            if(escolha2.equalsIgnoreCase("voltar")){
                System.out.println("Ela decide ir pelo caminho da esquerda e percebe que");
                System.out.println("esta ficando mais perdida, entao decide voltar, na sua");
                System.out.println("volta ela encontra os Habitantes daquele lugar(gatos que");
                System.out.println(" moram por la) e decide morar com eles.");
                System.out.println("FIM!");
            }
    }
    if(escolha1.equalsIgnoreCase("esquerda"))
    {
            System.out.println("Ela decide ir pelo caminho da esquerda e percebe que");
            System.out.println("esta ficando mais perdida, entao decide voltar, na sua");
            System.out.println("volta ela encontra os Habitantes daquele lugar(gatos que");
            System.out.println("moram na floresta) e decide morar com eles.");
            System.out.println("FIM!");
        }
    if(escolha1.equalsIgnoreCase("voltar"))
    {
           System.out.println("Ela volta pelo mesmo caminho, pelo lugar que veio, muito tempo");
           System.out.println("depois, sem esperança de encontar o caminho, ela deita e começa");
           System.out.println("a chorar, em meio as lagrimas ela avista a borboleta de antes ");
           System.out.println("e corre atras, ate perceber que encontrou a saida.");
           System.out.println("FIM!");
        }
}
}


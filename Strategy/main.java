package Strategy;
import java.util.Scanner;

public class main{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Selecione um filme 1(comum) 2(recente) 3(lancamento)");
        int opcao = entrada.nextInt();
        TipoFilme tipoFilme = TipoFilme.values()[opcao -1];


        Filme f = tipoFilme.precoFilme();
        System.out.printf("O preco do seu filme :%.2f",f.PrecoFilme());
    }
}
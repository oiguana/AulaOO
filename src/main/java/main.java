//import java.util.Scanner;

import classes.Cao;
import jdk.nashorn.internal.parser.JSONParser;

public class main{
    public static void main(String[] args) {
        //Scanner ler = new Scanner(System.in);
        //n = ler.nextInt(); // 3.1 entrada de dados (lendo um valor inteiro)

        Cao rex = new Cao();

        rex.setNome("Rex");
        rex.setIdade(50);
        rex.setComprimentoPelos("Curto");
        rex.setCorPelos("Marrom, Preto, Branco");
        rex.setCorOlhos("Castanho");
        rex.setPeso(3.0);

        Cao snoopy = new Cao();

        snoopy.setNome("Snoopy");
        snoopy.setIdade(-2);
        snoopy.setComprimentoPelos("Curto");
        snoopy.setCorPelos("Preto, Bege, Branco");
        snoopy.setCorOlhos("Negros");
        snoopy.setPeso(6.5);


        System.out.println("===== REX =======");
        System.out.printf("Nome: %s \n", rex.getNome());
        System.out.printf("Idade: %d \n", rex.getIdade());
        System.out.printf("Pelos: %s %s \n", rex.getComprimentoPelos(), rex.getCorPelos() );
        System.out.printf("Olhos: %s \n", rex.getCorOlhos());
        System.out.printf("Peso: %f \n \n", rex.getPeso());

        System.out.println("===== SNOOPY =======");
        System.out.printf("Nome: %s \n", snoopy.getNome());
        System.out.printf("Idade: %d \n", snoopy.getIdade());
        System.out.printf("Pelos: %s %s \n", snoopy.getComprimentoPelos(), snoopy.getCorPelos() );
        System.out.printf("Olhos: %s \n", snoopy.getCorOlhos());
        System.out.printf("Peso: %f \n", snoopy.getPeso());
    }
}


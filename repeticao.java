package unifatecie;
import java.util.Scanner;

public class L10E3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome;
        int reps;
        System.out.println("Digite um nome");
        nome=input.next();
        System.out.println("Digite a quantidade de repetições desejadas");
        reps=input.nextInt();
        
        for(int i=0; i<reps;i++){
            System.out.println((i+1)+" - Seu nome é "+nome);
        } 
    }
}

import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);
        

        System.out.print("Me informe o seu Numero de Conta:  ");
        int numero = scanner.nextInt();

        System.out.print("Me informe a sua Agencia: ");
        String agencia = scanner.next();

        System.out.print("Me informe o Seu Nome: ");
        String nome = scanner.next();

        System.out.print("Saldo");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agencia é");
        System.out.println(agencia+", Conta: "+numero+" e seu saldo é de : "+saldo+" Já está Disponivel para saque");
        
        scanner.close();
    }

}

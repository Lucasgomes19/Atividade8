import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor que você ganha por hora: ");
        int valor = sc.nextInt();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horas = sc.nextInt();

        int salario = valor * horas;
        System.out.println("Você receberá " + salario + " esse mês.");
        sc.close();

        
    }
    
}

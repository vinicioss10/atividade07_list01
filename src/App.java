import java.util.Scanner;

/*Faça um Programa que calcule a área de um quadrado, em seguida 
mostre o dobro desta área para o usuário. */

public class App {
    public static void main(String[] args) throws Exception {
        double altura;
        double comprimento;
        double area;
        double dobro;
        Scanner dig;

        dig = new Scanner(System.in);
        System.out.println("Informe a altura do quadrado");
        altura = dig.nextInt();
        System.out.println("Informe o comprimento deste quadrado ");
        comprimento = dig.nextInt();
        area = altura * comprimento;
        dobro = area * 2;

        System.out.println("O dobro da area é " + dobro);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Helloooo!");
        System.out.println("If else");
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese dos numeros para hacer un promedio");
        int num=entrada.nextInt();
        int num1=entrada.nextInt();
        System.out.println("sus numeros son: " + num + "," + num1 );
        System.out.println("si su promedio es igual o mayor a 3, PASA LA MATERIA. De lo contrario LA PIERDE.");
        int promedio = ((num + num1) / 2);
        System.out.println("su promedio es: " + promedio);
        if (promedio >= 30)
            System.out.println("PASO LA MATERIA");
        else System.out.println("NO PASO LA MATERIA");
    }
}
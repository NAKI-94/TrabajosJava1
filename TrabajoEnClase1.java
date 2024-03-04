package co.com.ps.TrabajosEnClaseEntrega;

import java.util.Scanner;

public class TrabajoEnClase1 {
    //promerio
    public static void main(String[] args) {
        int numero1=0;
        int numero2=0;
        int numero3=0;
        double total;

        Integer numero1Wrapper=0;
        Integer numero2Wrapper=0;
        Integer numero3Wrapper=0;
        Double totalwrapper;

        Scanner scanner;
        scanner= new Scanner(System.in);
        System.out.println("Digite Primer Numero");
        numero1= scanner.nextInt();

        System.out.println("Digite Segundo Numero");
        numero2= scanner.nextInt();

        System.out.println("Digite Tercer Numero");
        numero3= scanner.nextInt();

        System.out.println("el promedio de los numero es  "+ ((numero1+numero2+numero3)/3));


    }


}
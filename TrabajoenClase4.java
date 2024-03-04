package co.com.ps.TrabajosEnClaseEntrega;

import java.util.Scanner;

// saber si un numero es positivo o negativo o 0
/*Crea un programa que solicite al usuario ingresar el precio de un artículo y
su categoría (por ejemplo, "electrónicos", "ropa", "alimentos").
Aplica un descuento del 10% si es electrónica, 5% si es ropa y 2%
si son alimentos. Imprime el precio final.
        */
public class TrabajoenClase4 {
    public static void main(String[] args) {

        int num;
        Scanner scanner;
        scanner= new Scanner(System.in);
        System.out.println("Digite  Numero");
        num= scanner.nextInt();
        if (num>0){
            System.out.println("el numero es positivo\n");
        } else if (num<0) {
            System.out.println("el numero es negativo\n");

        }else {
            System.out.println("el numero es 0\n");
        }

        int valorarticulo;
        int cate;
        double ele=0.1;
        double rop= 0.05;
        double alim=0.02;
        double desElec;
        double desRopa;
        double desAlim;

        System.out.println("Señor usuario ingresa el precio de un artículo y\n" +
                "su categoría (por ejemplo, \"electrónicos\", \"ropa\", \"alimentos\").\n" +
                "Aplica un descuento del 10% si es electrónica, 5% si es ropa y 2%\n" +
                "si son alimentos");

        System.out.println("Ingrese 1.la categoria electronica\nIngrese 2.la categoria de ropa\nIngrese 3.la categoria alimentos ");

        System.out.println("Ingrese la categoria");
        cate= scanner.nextInt();
        System.out.println("Ingrese el precio de un articulo");
        valorarticulo= scanner.nextInt();


        desElec = valorarticulo*ele;
        desRopa = valorarticulo*rop;
        desAlim = valorarticulo*ele;

        switch (cate){

            case 1:
                System.out.println("LA CATEGORIA ES ELECTRONICA CON DESCUENTO DEL 10% EL VALOR DEL ARTICULO QUE INGRESO ES " + valorarticulo + " EL VALOR DEL ARTICULO CON DESCUENTO ES "+ (valorarticulo-desElec));
                break;

            case 2:
                System.out.println("LA CATEGORIA ES ROPA CON DESCUENTO DEL 5% EL VALOR DEL ARTICULO QUE INGRESO ES "+ valorarticulo + " EL VALOR DEL ARTICULO CON DESCUENTO ES "+ (valorarticulo-desRopa));
                break;
            case 3:
                System.out.println("LA CATEGORIA ES ALIMENTO CON DESCUENTO DEL 2% EL VALOR DEL ARTICULO QUE INGRESO ES "+ valorarticulo + " EL VALOR DEL ARTICULO CON DESCUENTO ES "+ (valorarticulo-desAlim));
                break;
            default:
                System.out.println("error en la digitacion ");
        }



    }
}

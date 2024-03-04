package co.com.ps.TrabajosEnClaseEntrega;
import java.util.Arrays;
import java.util.List;

//Crear un programa que filtre las palabras que tengan mas de 5 caracteres
public class TrabajoEnClase5 {



    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Java", "Stream", "Ejemplo", "Programación", "Funcional");
        palabras.stream().filter(palabra -> palabra.length() >5).forEach(System.out::println);








    }
}
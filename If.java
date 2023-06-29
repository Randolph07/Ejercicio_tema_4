package EJERCICIO_TEM4;
import java.util.Scanner;

public class If {

    public static void main(String[] args){

        Scanner respuesta = new Scanner(System.in);

        int Numeroif = respuesta.nextInt();


        if (Numeroif > 0 ){

            System.out.println("Es un numero positivo.");


        } else if (Numeroif == 0 ) {


            System.out.println("Este numero segun los matematicos es un punto cardinal, " +
                    " que representa el conjunto vacio, por lo que es positivo y negativo.");

        }else {

            System.out.println("Es un numero negativo.");

        }



    }
}

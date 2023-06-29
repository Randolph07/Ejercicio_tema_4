package EJERCICIO_TEM4;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner respuesta = new Scanner(System.in);

        System.out.println("Introduzca la estacion del año.Ej:Invierno." +
                "(En mayuscula la primera letra).");
        var estacion = respuesta.nextLine();


      switch (estacion){

              case "Verano":
                System.out.println("Estara soliado y caluroso, es verano.");
                break;

              case  "Invierno":
              System.out.println("Estara frio, sera mejor que prepares chocolate caliente" +
                      "ES invierno.");
                 break;
              case  "Primavera":
                  System.out.println("Prepara el antialergico,es primavera.");
                  break;
              case  "Otoño":
                  System.out.println("Prepara abrigo y pala para recoger hojas , es Otoño.");
                  break;
          default:
              System.out.println("Intentelo de nuevo , por favor.");
                  break;

        }




    }





}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author UTPL
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    System.out.println("Ingrese su nombre:");
    String nombre = entrada.nextLine(); 
    System.out.println("Ingrese su apellido");
    String apellido = entrada.nextLine();
    System.out.println("Ingrese su usuario:");
    String usuario = entrada.nextLine();
    System.out.println("Ingrese su parroquia:");
    String parroquias = entrada.nextLine();
    System.out.println("Ingrese su edad:");
    int edad = entrada.nextInt();
    System.out.println("Ingrese el dia de pago:");
    int dia = entrada.nextInt();

    double costoFijo = 25.0;    
    double descuento = 25.0 * 0.05;
    double costoTotal;

   
    if ((dia<10) && (parroquias.equals("El Valle")|| parroquias.equals("El Sagrario"))){
    
    costoTotal = costoFijo - descuento;
    System.out.printf(
            "Nombre: %s\n"
            +"Apellido: %s\n"
            +"Usuario: %s\n"
            +"Parroquia: %s\n"
            +"Dia de pago: %d\n"
            +"Edad: %d\n"
            +"Descuento: %.2f\n"
            +"Total a pagar: %.2f\n",
            nombre, apellido, usuario, parroquias, dia, edad, descuento,
            costoTotal);

    
    }else { 
        System.out.printf(
            "Nombre: %s\n"
            +"Apellido: %s\n"
            +"Usuario: %s\n"
            +"Parroquia: %s\n"
            +"Dia de pago: %d\n"
            +"Edad: %d\n"      
            +"Total a pagar: %.2f\n",
            nombre, apellido, usuario, parroquias, dia, edad,
            costoFijo);
    
    }
    // TODO code application logic here
    }
    
}

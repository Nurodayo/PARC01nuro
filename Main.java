import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int selection, rut, nTargeta, ccv;
        String nombre, fVencimiento;
        
        System.out.println("Desea hacer una reservacion \n 1- Si. \n 2- No");
        selection = scan.nextInt();
        switch(selection){
            case 1:
                System.out.println("ingrese sus datos");
                System.out.println("rut:");
                rut = scan.nextInt();
                
                nombre = scan.nextLine();

                nTargeta = scan.nextInt();

                ccv = scan.nextInt();

                fVencimiento = scan.nextLine();

                CreditCard targeta = new CreditCard(nTargeta, ccv, fVencimiento);
                Cliente user = new Cliente(rut, nombre, targeta);


                break;
            case 2:
                System.out.println("Muchas gracias por usar nuestro servicio");
                break;
            default:
                System.out.println("por favor ocupe una de las dos opciones, intente de nuevo"); //deberia usar un ciclo pero no tengo tiempo
                break;
        }





    }
}
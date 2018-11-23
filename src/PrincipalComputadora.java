
import java.util.LinkedList;
import java.util.Scanner;

public class PrincipalComputadora {
    private static Scanner scanInt = new Scanner(System.in);
    private static Scanner scanLine = new Scanner(System.in);
    
    public static void main(String [] args){
        menu();
}

    private static void menu() {
        boolean bandera = true;
        ServiciosComputadora servicios = new ServiciosComputadora();
        System.out.println("Bienvenido a Tecnologia" + "Integradora");
        do{
            System.out.println("Ingresa la opcion deceada"
                    + "\n1) Añadir Computadora"
                    + "\n2) Revisar Lista"
                    + "\n3) Modificar Lista"
                    + "\n4) Eliminar"
                    + "\n5) SALIR");
            int opcion = scanInt.nextInt();
            switch(opcion){
                case 1:
                    Computadora compu = pedirDatosAUsuario();
                    boolean exito = servicios.create(compu);
                    if (exito)
                        System.out.println("Se agrego con exito");
                    else
                        System.out.println("No se ah agregado");
                    break;
                case 2:
                    LinkedList ListaDeCompus = servicios.leer();
                    imprimir(ListaDeCompus);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Escribe el Numero de la computadora que quieres eliminar");
                    int opcion2 = scanInt.nextInt();
                    LinkedList ListaDeCompus2 = servicios.delete(opcion2);
                    System.out.println("Has borrado tu lista");
                    break;
                default:
                    System.out.println("HAS SALIDO DEL PROGRAMA VUELVA PRONTO");
                    bandera = false;
                    break;
            }
        }while(bandera);
    }
    
    private static Computadora pedirDatosAUsuario() {
        System.out.println("Ingrese el No. serie");
        String noSerie = scanLine.nextLine();
        System.out.println("Ingrese el año de la computadora");
        String anio = scanLine.nextLine();
        System.out.println("Ingrese el modelo");
        String modelo = scanLine.nextLine();
        System.out.println("Ingrese el procesador");
        String procesador = scanLine.nextLine();
        System.out.println("Ingrese RAM");
        int ram = scanInt.nextInt();
        Computadora compu = new Computadora(noSerie, anio, modelo, procesador, ram);
        return compu;
    }
    
    private static void imprimir(LinkedList<Computadora> listaDeCompus) {
        for(Computadora compu : listaDeCompus){
            System.out.println(compu);
        }
        
    }
}

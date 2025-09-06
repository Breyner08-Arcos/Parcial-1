import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        Libro Libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 10, 5);
 
        Libro Libro2 = new Libro();
 
        System.out.println("Ingrese el título del libro:");
        String titulo = sc.nextLine();
 
        System.out.println("Ingrese el autor del libro:");
        String autor = sc.nextLine();
 
        System.out.println("Ingrese el número de ejemplares:");
        int nEjemplares = sc.nextInt();
 
        System.out.println("Ingrese el número de ejemplares prestados:");
        int nEjemplaresPrestados = sc.nextInt();
 
        Libro2.setTitulo(titulo);
        Libro2.setAutor(autor);
        Libro2.setnEJemplares(nEjemplares);
        Libro2.setnEJemplaresPrestados(nEjemplaresPrestados);
 
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mostrar información del Libro 1");
            System.out.println("2. Mostrar información del Libro 2");
            System.out.println("3. Prestar un ejemplar del Libro 1");
            System.out.println("4. Devolver un ejemplar del Libro 1");
            System.out.println("5. Prestar un ejemplar del Libro 2");
            System.out.println("6. Devolver un ejemplar del Libro 2");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
 
            switch (opcion) {
                case 1:
                    System.out.println(Libro1);
                    break;
                case 2:
                    System.out.println(Libro2);
                    break;
                case 3:
                    if (Libro1.prestamo()) {
                        System.out.println("Préstamo realizado en Libro 1.");
                    } else {
                        System.out.println("No quedan ejemplares disponibles en Libro 1.");
                    }
                    break;
                case 4:
                    if (Libro1.devolucion()) {
                        System.out.println("Devolución realizada en Libro 1.");
                    } else {
                        System.out.println("No hay ejemplares prestados para devolver en Libro 1.");
                    }
                    break;
                case 5:
                    if (Libro2.prestamo()) {
                        System.out.println("Préstamo realizado en Libro 2.");
                    } else {
                        System.out.println("No quedan ejemplares disponibles en Libro 2.");
                    }
                    break;
                case 6:
                    if (Libro2.devolucion()) {
                        System.out.println("Devolución realizada en Libro 2.");
                    } else {
                        System.out.println("No hay ejemplares prestados para devolver en Libro 2.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese nuevamente.");
            }
        } while (opcion != 0);
 
        sc.close();
    }
}
 
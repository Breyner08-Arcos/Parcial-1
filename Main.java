import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Libro Libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 5, 2);
        System.out.println("Libro predefinido:");
        System.out.println(Libro1.toString());

        Libro miLibro = new Libro();

        System.out.println("Ingrese el título del libro:");
        String titulo = sc.nextLine();
 
        System.out.println("Ingrese el autor del libro:");
        String autor = sc.nextLine();
 
        System.out.println("Ingrese el número de ejemplares:");
        int nEjemplares = sc.nextInt();
 
        System.out.println("Ingrese el número de ejemplares prestados:");
        int nEjemplaresPrestados = sc.nextInt();
 
        miLibro.setTitulo(titulo);
        miLibro.setAutor(autor);
        miLibro.setnEJemplares(nEjemplares);
        miLibro.setnEJemplaresPrestados(nEjemplaresPrestados);

        System.out.println("Libro ingresado por el usuario:");
        System.out.println(miLibro.toString());

        sc.close();
    }
}
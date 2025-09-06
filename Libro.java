public class Libro {
    private String titulo;
    private String autor;
    private int nEJemplares=0;
    private int nEJemplaresPrestados=0;
 
    public Libro(String titulo, String autor, int nEJemplares, int nEJemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nEJemplares = nEJemplares;
        this.nEJemplaresPrestados = nEJemplaresPrestados;
        }
 
    public Libro() {
    }
 
    public void getLibroVacio(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de ejemplares: " + nEJemplares);
        System.out.println("Número de ejemplares prestados: " + nEJemplaresPrestados);
    }
 
    public void setLibroVacio(String titulo, String autor, int nEJemplares, int nEJemplaresPrestados){
        this.titulo = titulo;
        this.autor = autor;
        this.nEJemplares = nEJemplares;
        this.nEJemplaresPrestados = nEJemplaresPrestados;
    }
 
    public String getTitulo() {
        return titulo;
    }
   
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public String getAutor() {
        return autor;
    }
 
    public void setAutor(String autor) {
        this.autor = autor;
    }
 
    public int getnEJemplares() {
        return nEJemplares;
    }
 
    public void setnEJemplares(int nEJemplares) {
        this.nEJemplares = nEJemplares;
    }
 
    public int getnEJemplaresPrestados() {
        return nEJemplaresPrestados;
    }
 
    public void setnEJemplaresPrestados(int nEJemplaresPrestados) {
        this.nEJemplaresPrestados = nEJemplaresPrestados;
    }
 
    public boolean prestamo(){
        if (nEJemplares>nEJemplaresPrestados) {
            nEJemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }
 
    public boolean devolucion(){
        if (nEJemplaresPrestados>0) {
            nEJemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }
 
    @Override
    public String toString() {
        return "Título: " + titulo + "\n"
             + "Autor: " + autor + "\n"
             + "Número de ejemplares: " + nEJemplares + "\n"
             + "Número de ejemplares prestados: " + nEJemplaresPrestados;
    }
    }
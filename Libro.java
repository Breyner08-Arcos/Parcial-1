public class Libro{
 // atributos
 private String titulo;
 private String autor;
 private int nEjemplares = 0;
 private int nEjemplaresPrestados = 0;

// constructor
    public Libro(String titulo, String autor, int nEjemplares, int nEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nEjemplares = nEjemplares;
        this.nEjemplaresPrestados = nEjemplaresPrestados;
    }

// metodos
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

    public int getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public int getnEjemplaresPrestados() {
        return nEjemplaresPrestados;
    }

    public void setnEjemplaresPrestados(int nEjemplaresPrestados) {
        this.nEjemplaresPrestados = nEjemplaresPrestados;
    }
    
    public boolean prestamo(){
        if (nEjemplares > nEjemplaresPrestados){
            nEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion(){
        if (nEjemplaresPrestados > 0){
            nEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", nEjemplares=" + nEjemplares
                + ", nEjemplaresPrestados=" + nEjemplaresPrestados + "]";
    }


}
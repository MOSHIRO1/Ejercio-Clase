import java.util.List;

interface Reproducible {
    void reproducir();
    int getDuracionSeg();

}

interface Descargable {

    double calcularTamanoMB();
}

abstract class Contenido {

    String titulo;
    String autor;

    public Contenido(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public abstract String tipo();

    @Override 
    public String toString() {
        return tipo() + ": " + titulo + ": " + autor;
    }


    
//adding inheritance using implements and extends

     
    
}

class Cancion extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;

    public Cancion(String autor, String titulo, int duracionSeg) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
    }
    
    @Override 
    public void reproducir() {
        System.out.println("Reproduciendo: " + getTitulo());
    }

    @Override 
    public int getDuracionSeg() {
        return duracionSeg;
    }

    @Override
    public double calcularTamanoMB() {
        return (duracionSeg / 60) * 1.5;
    }

    @Override 
    public String tipo() {
        return "Cancion";
    }


    
}

class Podcast extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;
    private int episodio;

    public Podcast (String titulo, String autor, int duracionSeg, int episodio) {
        super (titulo, autor);
        this.duracionSeg = duracionSeg;
        this.episodio = episodio;


    }

    @Override 
    public void reproducir() {
        System.out.println("Reproduciendo podcast: " + episodio + ":" + getTitulo());

    }

    @Override
    public int getDuracionSeg() {
        return duracionSeg;
    }

    @Override public double calcularTamanoMB() {
        return (duracionSeg / 60.0) * 1.5;
    }

    @Override 
    public String tipo() {
        return "podcast";
    }



}


class LibroDigital extends Contenido implements Descargable {
    private  int paginas;

    public LibroDigital(String titulo, String autor, int paginas)
}
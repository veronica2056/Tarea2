/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private String Investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, String Investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.Investigador = Investigador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getInvestigador() {
        return Investigador;
    }

    public void setInvestigador(String Investigador) {
        this.Investigador = Investigador;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Investigador: " + this.Investigador);
        System.out.println();
    }
}

package uni1a;
public class Streaming extends ContenidoAudiovisual {
  private String canal;

    public Streaming(String titulo, int duracionEnMinutos, String genero, String canal) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }
   @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + this.canal);
        System.out.println();
    }
}

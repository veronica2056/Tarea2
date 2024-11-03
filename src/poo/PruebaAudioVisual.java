package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios","Sam Worthington","Zoe Saldana");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8, 73);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy","Neil deGrasse Tyson");
        contenidos[3] = new Cortometraje ("Si algo me pasa, los quiero", 12,"Drama", "Michael Govier" );
        contenidos[4] = new Streaming ("Video Juegos", 530, "Thriller", "AuronPlay");

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
public class pelicula {

    private String titulo;
    private String director;
    private int duracionMinutos;

    public pelicula(String titulo, String director, int duracionMinutos) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
    }

    public pelicula() {
    }

    public static void mostrarInformacion(String titulo, String director, int duracionMinutos) {
        System.out.println("Película: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracionMinutos + " minutos");
    }

}

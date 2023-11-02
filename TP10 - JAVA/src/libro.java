public class libro {

    private String titulo;
    private String autor;
    private int aniodepublicacion;

    public libro(String titulo, String autor, int aniodepublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.aniodepublicacion = aniodepublicacion;
    }

    public libro() {

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

    public Integer getAniodepublicacion() {
        return aniodepublicacion;
    }

    public void setAniodepublicacion(Integer aniodepublicacion) {
        this.aniodepublicacion = aniodepublicacion;
    }

    public static void infoLibro(String autor, String titulo, int anio){

        System.out.println("Autor: " + autor + ", Titulo: " + titulo + ", Año: " + anio);

    }
}
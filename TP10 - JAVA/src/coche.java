public class coche {

    private String marca;
    private String modelo;
    private int anio;
    private int velocidad;

    public coche(String marca, String modelo, int anio, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = velocidad;
    }

    public coche() {
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void acelerar(int incrementoVelocidad) {
        this.velocidad += incrementoVelocidad;
        System.out.println("El coche ha acelerado. Velocidad actual: " + this.velocidad + " km/h");
    }

    public void frenar(int decrementoVelocidad) {
        if (this.velocidad - decrementoVelocidad >= 0) {
            this.velocidad -= decrementoVelocidad;
            System.out.println("El coche ha frenado. Velocidad actual: " + this.velocidad + " km/h");
        } else {
            this.velocidad = 0; // El coche no puede tener velocidad negativa
            System.out.println("El coche se ha detenido.");
        }
    }



}

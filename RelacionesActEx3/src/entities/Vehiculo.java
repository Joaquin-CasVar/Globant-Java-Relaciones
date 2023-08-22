package entities;

// @author Haze
public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private int numDeMotor;
    private String chasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, int numDeMotor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numDeMotor = numDeMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
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

    public int getNumDeMotor() {
        return numDeMotor;
    }

    public void setNumDeMotor(int numDeMotor) {
        this.numDeMotor = numDeMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

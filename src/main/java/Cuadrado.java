public class Cuadrado {
    float lado;
    public Cuadrado(float lado) {
        this.lado=lado;
    }
    float getLado() {
        return lado;
    }
    void setLado(float lado) {
        this.lado=lado;
    }
    float perimetro() {
        return 4*this.lado;
    }
}

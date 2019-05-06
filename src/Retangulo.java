public class Retangulo implements ICalcGeometria {
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcPerimetro() {
        return ((this.base + this.altura) *2);
    }

    @Override
    public double calcArea() {
        return (this.base * this.altura);
    }
}

import java.sql.SQLOutput;

public class Main2 {
    public void main(String args[]){
        Quadrado q = new Quadrado (10);
        System.out.println ( q.calcArea());
        System.out.println( q.calcPerimetro());
        Circulo c = new Circulo(10);
        System.out.println( c.calcArea());
        System.out.println( c.calcPerimetro);

    }
}

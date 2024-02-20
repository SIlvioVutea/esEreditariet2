public class Rettangolo extends Forma {
    private double base = 0.0;
    private double altezza = 0.0;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }

    public double calcolaArea() {
        System.out.print("l'area del rettangolo si ottiene moltiplicando la base per l'altezza e corrisponde a : ");
        return base * altezza;

    }
}


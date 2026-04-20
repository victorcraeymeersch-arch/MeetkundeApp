public class Cirkel implements Vorm {
    private final double straal; // private voor encapsulatie [cite: 223]

    public Cirkel(double straal) {
        if (straal <= 0) throw new IllegalArgumentException("Straal moet positief zijn");
        this.straal = straal;
    }

    @Override
    public double berekenOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public String getNaam() {
        return "Cirkel";
    }
}
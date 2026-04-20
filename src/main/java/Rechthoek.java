public class Rechthoek implements Vorm {
    private final double lengte;
    private final double breedte;

    public Rechthoek(double lengte, double breedte) {
        if (lengte <= 0 || breedte <= 0) {
            throw new IllegalArgumentException("Afmetingen moeten positief zijn");
        }
        this.lengte = lengte;
        this.breedte = breedte;
    }

    @Override
    public double berekenOppervlakte() {
        return lengte * breedte;
    }

    @Override
    public String getNaam() {
        return "Rechthoek";
    }
}
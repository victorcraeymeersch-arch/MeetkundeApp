import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CirkelTest {

    @Test
    void berekenOppervlakteMetPositieveStraal() {
        // Arrange [cite: 495, 500]
        Vorm cirkel = new Cirkel(5.0);

        // Act [cite: 496, 502]
        double resultaat = cirkel.berekenOppervlakte();

        // Assert [cite: 497, 504]
        // We gebruiken een delta van 0.01 voor afrondingen bij doubles
        assertEquals(78.54, resultaat, 0.01);
    }

    @Test
    void constructorGooitExceptionBijNegatieveStraal() {
        // Act & Assert [cite: 1208, 1267]
        assertThrows(IllegalArgumentException.class, () -> new Cirkel(-1.0));
    }

    @Test
    void getNaamGeeftCirkelTerug() {
        Vorm cirkel = new Cirkel(1.0);
        assertEquals("Cirkel", cirkel.getNaam());
    }
}
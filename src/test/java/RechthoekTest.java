import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RechthoekTest {

    @Test
    void berekenOppervlakteMetGeldigeAfmetingen() {
        // Arrange [cite: 495]
        Vorm rechthoek = new Rechthoek(10.0, 2.0);

        // Act [cite: 496]
        double resultaat = rechthoek.berekenOppervlakte();

        // Assert [cite: 497, 513]
        assertEquals(20.0, resultaat);
    }

    @Test
    void constructorGooitExceptionBijBreedteNul() {
        // Act & Assert [cite: 1224, 1234]
        assertThrows(IllegalArgumentException.class, () -> new Rechthoek(10.0, 0));
    }

    @Test
    void getNaamGeeftRechthoekTerug() {
        Vorm rechthoek = new Rechthoek(5.0, 5.0);
        assertEquals("Rechthoek", rechthoek.getNaam());
    }
}
import org.example.CalculatriceAire;
import org.example.Cercle;
import org.example.IForme;
import org.example.Rectangle;
import org.junit.Test;
import org.mockito.Mockito;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatriceAireTest {
    List<IForme> formes = Arrays.asList(new Cercle(2.0), new Rectangle(2, 4));
    CalculatriceAire calculatriceAire = new CalculatriceAire();

    @Test
    public void testAire() {
        assertEquals(20.56, CalculatriceAire.aire(formes), 0.01);
    }

    @Test
    public void testAire2() {
        IForme carre = Mockito.mock(IForme.class);
        when(carre.aire()).thenReturn(4.0);
        List<IForme> formes = Arrays.asList(new Cercle(2.0), new Rectangle(2, 4), carre);
        assertEquals(24.56, calculatriceAire.aire(formes), 0.01);
        verify(carre, times(1)).aire();
    }
}
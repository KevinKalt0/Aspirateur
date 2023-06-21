import org.example.Aspirateur;
import org.example.Orientation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class testaspirateur {
    @Test
        public void testPositionFinale() {
            int dimensionX = 10;
            int dimensionY = 10;
            int positionInitialeX = 5;
            int positionInitialeY = 5;
            Orientation orientationInitiale = Orientation.N;
            String instructions = "DADADADAA";

            Aspirateur aspirateur = new Aspirateur(positionInitialeX, positionInitialeY, orientationInitiale);
            aspirateur.executerInstructions(instructions);

            int positionFinaleX = 5;
            int positionFinaleY = 6;
            Orientation orientationFinale = Orientation.N;

            Assertions.assertEquals(positionFinaleX, aspirateur.getX());
            Assertions.assertEquals(positionFinaleY, aspirateur.getY());
            Assertions.assertEquals(orientationFinale, aspirateur.getOrientation());
        }
    }



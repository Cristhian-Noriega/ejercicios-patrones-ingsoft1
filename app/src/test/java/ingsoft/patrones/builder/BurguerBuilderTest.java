package ingsoft.patrones.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BurguerBuilderTest {

    @Test
    public void testSimpleBurger() {
        BurguerPart burger = new BurguerBuilder()
                .build();
        assertEquals("Cheese", burger.getDescription());
        assertEquals(2, burger.getCost());
    }
    @Test
    public void testBurguerWithBreadMeetAndCheese() {
        BurguerPart burguer = new BurguerBuilder()
                .addMeat()
                .addBread()
                .build();

        assertEquals("Bread+Cheese+Meet+Bread", burguer.getDescription());
        assertEquals(8, burguer.getCost());
    }
}

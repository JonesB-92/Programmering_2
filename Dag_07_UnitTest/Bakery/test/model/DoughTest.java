package model;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DoughTest {

@Test
void createCookie_addsNewCookies() {

    // Arrange
    int pieces = 10;
    Recipe recipe = new Recipe("Chocolate chip cookies", pieces);
    Dough dough = new Dough(recipe);

    // Act
    Cookie[] createdCookies = new Cookie[pieces];
    for (int i = 0; i < pieces; i++) {
        createdCookies[i] = dough.createCookie();
    }

    // Assert
    assertArrayEquals(createdCookies, dough.getCookies());
}

@Test
void createCookie_throwsException() {

    // Arrange
    int pieces = 10;
    Recipe recipe = new Recipe("Chocolate chip cookies", pieces);
    Dough dough = new Dough(recipe);
    for (int i = 0; i < pieces; i++) {
        dough.createCookie();
    }

    // Act & Assert
    Exception exception = assertThrows(RuntimeException.class, () -> {
        dough.createCookie();
    });
    assertEquals(exception.getMessage(), "No dough left");
}
}
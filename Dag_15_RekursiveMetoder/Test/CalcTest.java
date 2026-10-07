import Opgaver_RekursiveMetoder.OpgaverRekursiv;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {


    @Test
    void test_factorial() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();

        // Act
        int expected = 24;
        int actual = calculator.factorial(4);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_power() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();
        int n = 3;
        int p = 9;
        // Act
        double expected = Math.pow(n, p);
        int actual = calculator.power(n, p);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_power2() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();
        int n = 3;
        int p = 9;

        // Act
        int expected = (int) Math.pow(n, p);
        int actual = calculator.power2(n, p);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_product() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();
        int a = 3;
        int b = 4;

        // Act
        int expected = a * b;
        int actual = calculator.product(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_productRus() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();
        int a = 3;
        int b = 9;

        int a1 = 19;
        int b1 = 3;

        // Act
        int expected = a * b;
        int actual = calculator.productRus(a, b);

        int expected1 = a1 * b1;
        int actual1 = calculator.productRus(a1, b1);

        // Assert
        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
    }

    @Test
    void test_reverseString() {
        // Arrange
        OpgaverRekursiv calc = new OpgaverRekursiv();
        String s = "RANSLIRPA";

        // Act
        String expected = "APRILSNAR";
        String actual = calc.reverse(s);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_sfdEven_A_Biggest() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();
        int a = 16;
        int b = 4;

        // Act
        int expected = b;
        int actual = calculator.sfd(a, b);

        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void test_sfdEven_B_Biggest() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();
        int a = 4;
        int b = 16;

        // Act
        int expected = b;
        int actual = calculator.sfd(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_sfdUneven_A_Biggest() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();
        int a = 42;
        int b = 18;

        // Act   a   b                   18  42 % 18
        /** sfd(42, 18) -> (a > b) -> sfd(b, a % b )
         * → 42 % 18 = 6  → sfd(18, 6) -> (a >= b && a % b == 0)
         * → result = b   → b = 6 */
        int expected = 6;
        int actual = calculator.sfd(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_sfdUneven_B_Biggest() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();
        int a = 18;
        int b = 42;

        // Act   a   b                   42  18
        /** sfd(18, 42) -> (a < b) -> sfd(b, a)
         *      a   b                    18,  42 % 18
         * sfd(42, 18)  -> (a > b) -> sfd(b, a % b)
         * sfd(18, 42 % 18) → 42 % 18 = 6  → sfd(18, 6)
         * sfd(18, 6) -> (a > b) -> (a >= b && a % b = 0)
         * -> result = b, result = 6 */
        int expected = 6;
        int actual = calculator.sfd(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_sfd_B_is_0() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();
        int a = 4;
        int b = 0;

        // Act
        int expected = a;
        int actual = calculator.sfd(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_sfd_A_is_0() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();
        int a = 0;
        int b = 4;

        // Act
        int expected = b;
        int actual = calculator.sfd(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_sfd_A_and_B_is_0() {
        // Arrange
        OpgaverRekursiv calculator = new OpgaverRekursiv();
        int a = 0;
        int b = 0;

        // Act
        int expected = 0;
        int actual = calculator.sfd(a, b);

        // Assert
        assertEquals(expected, actual);
    }

}

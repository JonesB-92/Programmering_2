import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    // Følgende tekststreng returnerer true: (3+{5{99{*}}[23[{67}67]]})
    // Følgende tekststreng returnerer false: ({)}
    @Test
    void test_validator_canValidateBrackets() {
        //Arrange
        Validator validator = new Validator();
        String trueString = "(3+{5{99{*}}[23[{67}67]]})";
        String falseString = "({)}";

        //Act & Assert
        assertTrue(validator.validateBrackets(trueString));
        assertFalse(validator.validateBrackets(falseString));
    }

    @Test
    void test_validator_canValidateBrackets_ClosedBracketFirst() {
        //Arrange
        Validator validator = new Validator();
        String falseString = ")]}(  {[]";

        //Act & Assert
        assertFalse(validator.validateBrackets(falseString));
    }

    @Test
    void test_validator_canValidateBrackets_OpenBracketLast() {
        //Arrange
        Validator validator = new Validator();
        String falseString = "([{}])(";

        //Act & Assert
        assertFalse(validator.validateBrackets(falseString));
    }
    @Test
    void test_validator_canValidateBrackets_ClosedBracketFirstAlone() {
        //Arrange
        Validator validator = new Validator();
        String falseString = ")]}";

        //Act & Assert
        assertFalse(validator.validateBrackets(falseString));
    }
}
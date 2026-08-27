package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {

    private PasswordValidator validator;

    @BeforeEach
    void setUp() {
        validator = new PasswordValidator();
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"short", "1234567"})
    void invalidPassword(String password) {
        assertFalse(validator.isValid(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345678", "123456789"})
    void validPassword(String password) {
        assertTrue(validator.isValid(password));
    }
}
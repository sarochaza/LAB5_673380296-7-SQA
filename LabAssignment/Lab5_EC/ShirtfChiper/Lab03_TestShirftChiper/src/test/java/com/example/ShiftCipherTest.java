package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

public class ShiftCipherTest {

    private ShiftCipher cipher;

    @BeforeEach
    void setUp() {
        cipher = new ShiftCipher();
    }

   
    // SECTION 1: LAB 5.1 - SHIFT CIPHER ENCRYPTION
    

    @ParameterizedTest(name = "{0}: encrypt(\"{1}\", {2}) -> Expected: \"{3}\"")
    @CsvSource({
        "TC001, ABC, 5, FGH",
        "TC002, ATTACK, -5, XQQXZH"
    })
    @DisplayName("1. Encryption - Valid Inputs (EC1, EC2)")
    void testEncryptValidInputs(String testId, String message, int key, String expectedResult) {
        String actualResult = cipher.shift(message, key);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest(name = "{0}: encrypt(\"{1}\", {2}) -> Expecting Exception")
    @CsvSource({
        "TC004, A1B, 3",  
        "TC005, aBc, 3",  
        "TC007, A B, 3"   
    })
    @DisplayName("2. Encryption - Invalid Characters (EC4, EC5, EC7)")
    void testEncryptInvalidCharacters(String testId, String message, int key) {
        assertThrows(IllegalArgumentException.class, () -> {
            cipher.shift(message, key);
        });
    }

    @ParameterizedTest(name = "TC006: encrypt(null, 3) -> Expecting Exception")
    @NullSource
    @DisplayName("3. Encryption - Null Message (EC6)")
    void testEncryptNullInput(String message) {
        assertThrows(IllegalArgumentException.class, () -> {
            cipher.shift(message, 3);
        });
    }

    
    // SECTION 2: LAB 5.1 - SHIFT CIPHER DECRYPTION
   

    @ParameterizedTest(name = "{0}: decrypt(\"{1}\", {2}) -> Expected: \"{3}\"")
    @CsvSource({
        "TC001, FGH, 5, ABC",        // shift("FGH", -5) -> "ABC"
        "TC002, XQQXZH, -3, ATTACK"  // shift("XQQXZH", -(-3)) -> "ATTACK"
    })
    @DisplayName("4. Decryption - Valid Inputs (EC1, EC2)")
    void testDecryptValidInputs(String testId, String cipherText, int key, String expectedResult) {
        // การถอดรหัสทำได้โดยการ Shift ด้วยคีย์ตรงข้าม (-key)
        String actualResult = cipher.shift(cipherText, -key);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest(name = "{0}: decrypt(\"{1}\", {2}) -> Expecting Exception")
    @CsvSource({
        "TC004, F1G, 3",  // EC4: มีตัวเลข
        "TC005, fGh, 3",  // EC5: มีอักษรพิมพ์เล็ก
        "TC007, F G, 3"   // EC7: มีช่องว่าง/อักขระพิเศษ
    })
    @DisplayName("5. Decryption - Invalid Characters (EC4, EC5, EC7)")
    void testDecryptInvalidCharacters(String testId, String cipherText, int key) {
        assertThrows(IllegalArgumentException.class, () -> {
            cipher.shift(cipherText, -key);
        });
    }

    @ParameterizedTest(name = "TC006: decrypt(null, 3) -> Expecting Exception")
    @NullSource
    @DisplayName("6. Decryption - Null Message (EC6)")
    void testDecryptNullInput(String cipherText) {
        assertThrows(IllegalArgumentException.class, () -> {
            cipher.shift(cipherText, -3);
        });
    }
}
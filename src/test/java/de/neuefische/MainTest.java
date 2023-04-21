package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkPasswordLength(){
        //given
        String password = "something";
        int expected = 9;
        //when
        int actual = Main.checkPasswordLength(password);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void checkIfContainsNumber(){
        //given
        String password = "s0mething";
        //when
        boolean actual = Main.checkIfContainsNumber(password);
        //then
        assertTrue(actual);
    }

}
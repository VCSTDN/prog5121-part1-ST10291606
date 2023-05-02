/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.poe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aron McDonald
 */
public class KankanboardTest {
    Kankanboard kankanboard = new Kankanboard();

    Kankanboard kankanboard2 = new Kankanboard();
    
    public KankanboardTest() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testCheckUsername() {
        
        
        boolean expected = true;
        boolean actual = kankanboard.checkUsername("kyl_1");
        
        assertEquals(expected, actual);
        
        boolean expected2 = false;
        boolean actual2 = kankanboard2.checkUsername("kyle!!!!!!!");
        
        assertEquals(expected2, actual2);
        
        
        
        
    }

    @Test
    public void testCheckPassword() {
        
        
        boolean expected = true;
        boolean actual = kankanboard.checkPassword("Ch&&sec@ke99!");
        
        assertEquals(expected, actual);
        
        boolean expected2 = false;
        boolean actual2 = kankanboard.checkPassword("password");
        
        assertEquals(expected2, actual2);
        
    }

    @Test
    public void testLoginUser() {
        
        
    }

    @Test
    public void testRegisterUser() {
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.validationprogram.ValidationProgram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class ValidTest {
    ValidationProgram vald = new ValidationProgram();
   @Test
   public void addTest() {
         assertEquals(5, vald.add(1, 2));
    } 
    
}

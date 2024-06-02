package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    Main obj = new Main();

   @Test
    void testAddd(){
         int actual  = obj.add(5,4);
         assertEquals(9,actual);
   }
}

package test;

import util.Algoritmos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Prueba {

        @Test
        void testFibonacci(){
            double numEsperado = 2;
            double numObtenido= Algoritmos.fibonacci(3);
            assertEquals(numEsperado, numObtenido);

        }

        @Test
        void testFactorial(){
            double numEsperado = 720;
            double numObtenido= Algoritmos.factorial(6);
            assertEquals(numEsperado, numObtenido);

        }

        @Test
        void testEsPrimo(){
            boolean valorEsperado = true;
            boolean valorObtenido= Algoritmos.esPrimo(3);
            assertEquals(valorEsperado, valorObtenido);

        }
   
}
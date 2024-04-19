package app;

import java.util.Random;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		
		//Array de 5 numeros aleatorios del 1 al 10
        int[] numeros = generarNumerosAleatorios(5);

        //Sucesion de Fibonacci de los numeros del array
        int[] resultadoFibonacci = calcularFibonacci(numeros);

        //Factorial de los numeros del array
        int[] resultadoFactorial = calcularFactorial(numeros);

        //Comprobar si los numeros del array son primos
        boolean[] resultadoPrimos = verificarPrimos(numeros);
    }

    //Metodo para generar un array de numeros aleatorios del 1 al 10
    private static int[] generarNumerosAleatorios(int cantidad) {
        Random random = new Random();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(10) + 1;
        }
        return numeros;
    }

    //Metodo para calcular la sucesion de Fibonacci de un array de numeros
    private static int[] calcularFibonacci(int[] numeros) {
        int[] resultadoFibonacci = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
        }
        return resultadoFibonacci;
    }

    //Metodo para calcular el factorial de un array de numeros
    private static int[] calcularFactorial(int[] numeros) {
        int[] resultadoFactorial = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
        }
        return resultadoFactorial;
    }

    //Metodo para verificar si un array de numeros es primo
    private static boolean[] verificarPrimos(int[] numeros) {
        boolean[] resultadoPrimos = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);
        }
        return resultadoPrimos;
    }

}

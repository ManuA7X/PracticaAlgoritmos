package util;

public abstract class Algoritmos {

	/**
     * Calcula la sucesion de Fibonacci de un numero dado
     *
     * @param numero 		El numero del cual se calculara la sucesion de Fibonacci
     * @return 				La sucesion de Fibonacci correspondiente al numero dado
     */
    public static int fibonacci(int numero) {
        if (numero <= 1)
            return numero;
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
    
    /**
     * Calcula el factorial de un numero dado
     *
     * @param numero 		El numero del cual se calculara el factorial
     * @return 				El factorial del numero dado
     */
    public static int factorial(int numero) {
        if (numero == 0)
            return 1;
        return numero * factorial(numero - 1);
    }
    
    /**
     * Te dice si un numero es o no es primo
     *
     * @param numero 		Se verificara si el numero dado es primo
     * @return 				true si el numero dado es primo, false si no lo es
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
    
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        
        return true; 
    }
}

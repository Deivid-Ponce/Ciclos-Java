package com.ebac.modulo38;

public class Operadores {
    public static void main(String[] args){
        int numeroUno = 12;
        int numeroDos = 5;

        int operacionSuma = numeroUno + numeroDos;
        int operacionResta = numeroUno - numeroDos;
        int operacionMultiplicacion = numeroUno * numeroDos;
        int operacionDivision = numeroUno / numeroDos;
        int modulo = numeroDos % numeroDos;

        System.out.println("Operaciones aritmeticas");
        System.out.println("Resultado de suma: " + operacionSuma);
        System.out.println("Resultado de resta: " + operacionResta);
        System.out.println("Resultado de multiplicacion " + operacionMultiplicacion);
        System.out.println("Resultado de division: " + operacionDivision);
        System.out.println("Resultado de modulo: " + modulo);

        //Operacion de asignacion
        System.out.println("\nOperador de asignacion");
        int valor = 10;

        valor += 23;
        System.out.println("Resultado de asignacion valor += 23 -> " + valor);

        int numero = 15;
        numero -= 10;
        System.out.println("Resultado de asignacion numer -= 15 -> " + numero);

        //Operadores logicos

        boolean condicion1 = true;
        boolean condicion2 = false;

        System.out.println("\nOperadores logicos");
        System.out.println("AND " + (condicion1 && condicion2));
        System.out.println("OR " + (condicion1 || condicion2));
        System.out.println("NOT "+ (!condicion1));
    }
}

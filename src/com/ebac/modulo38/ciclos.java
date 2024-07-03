package com.ebac.modulo38;

public class ciclos {
    public static void main(String[] args){
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};{

            //Recorriendo arreglo con ciclo for
            System.out.println("\nRecorriendo el arreglo con ciclo FOR");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("El valor del arreglo en la posicion " + i + " es = "+arreglo[i]);
            }
            //Recorriendo arreglo con ciclo while
            System.out.println("\nRecorriendo el arreglo con ciclo WHILE");
            int k = 0;
            while (k < arreglo.length){
                System.out.println("Posicion "+k+" numero de la posicion " +arreglo[k]);
                k++;
            }
            //Recorriendo arreglo con ciclo do while
            System.out.println("\nRecorriendo el arreglo con DO WHILE");
            int c = 0;
            do{
            System.out.println("Posicion " + c + " Numero de la posicion "+arreglo[c]);
            c++;
            }while(c<arreglo.length);
        }
    }
}

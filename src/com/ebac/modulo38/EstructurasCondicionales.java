package com.ebac.modulo38;

public class EstructurasCondicionales {
    public static void main(String[] args){
        int edad = 21;
        String nombre = "Cesar";

        if (edad >= 18) {
            System.out.println("La persona con nombre "+ nombre + " Es mayor de edad\n");
        }else if (edad >= 12){
            System.out.println("La persona con nombre " + nombre + " Es un adolescente/a\n");
        }else{
            System.out.println("La persona con nombre "+nombre+" Es pequeño de edad\n");
        }

        String diaSemana = "Domingo";

        switch (diaSemana){
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Es un dia laborar ya que es "+diaSemana);
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("Es fin de semana ");
                break;
            default:
                System.out.println("Dia no valido");
        }
    }
}

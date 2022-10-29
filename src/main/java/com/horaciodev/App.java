package com.horaciodev;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lopez19 > Horacio L.
 */
public class App {

    //Ejercicio #1: Invertir una cadena
    private void e1invertirString(String text) {

        //Desde 0 (Algoritmo)
        //Texto de entrada
        System.out.println("Texto Original: " + text);

        //Variables
        String[] arrayStrings = text.split("");
        StringBuilder newTextBuilder = new StringBuilder();

        for (int i = arrayStrings.length; i > 0; i--) {

            //Agrege de atras haci adelante
            newTextBuilder.append(arrayStrings[i - 1]);

        }
        System.out.println("Texto Invertido: " + newTextBuilder);

        //Usando Clases de Java
        System.out.println("Texto Original: " + text);

        String newString = new StringBuilder(text).reverse().toString();

        System.out.println("Texto Invertido: " + newString);

    }

    //Ejercicio #2: Determinar si un numero es capicua (se puede leer igual de atras hacia adelante)
    private void e2comprobarCapicua(int number) {
        //Variables
        String numberString = String.valueOf(number);
        String reverseString = new StringBuilder(numberString).reverse().toString();

        if (numberString.equals(reverseString)) {

            System.out.println("Los numeros son capicuas \n");
            System.out.println("Numero Original: " + numberString);
            System.out.println("Numero Reverso: " + reverseString);

        } else {
            System.out.println("Los numeros NO son capicuas \n");
            System.out.println("Numero Original: " + numberString);
            System.out.println("Numero Reverso: " + reverseString);
        }

    }

    //Ejercicio #3: Contador de caracteres
    private void e3contarCaracteres(String text) {

        int i, lenght, counter[] = new int[256];

        lenght = text.length();

        for (i = 0; i < lenght; i++) {
            //counter[text.charAt(i)] = counter[text.charAt(i)] +1;
            counter[text.charAt(i)]++;
        }

        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }

    }

    //Ejercicio #4: Caracteres Repetidos
    private void e4caracteresRepetidos(String text) {
        int i, lenght, counter[] = new int[256];

        lenght = text.length();

        for (i = 0; i < lenght; i++) {
            //counter[text.charAt(i)] = counter[text.charAt(i)] +1;
            counter[text.charAt(i)]++;
        }

        for (i = 0; i < 256; i++) {
            if (counter[i] > 1) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }

    //Ejercicio #5: Numero Multiplo de Algo
    private void e5multiplidealgo(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Es multiplo");
        } else {
            System.out.println("No es multiplo");
        }
    }

    //Ejercicio #6: Año Bisiesto
    private void e6añoBisiesto(int año) {
        boolean esBiciesto = LocalDate.of(año, 1, 1).isLeapYear();

        System.out.println("Año: " + año);

        String respuesta;

        if (esBiciesto) {
            respuesta = "¡Si!";
        } else {
            respuesta = "No";
        }

        System.out.println("Es Bisiesto: " + respuesta);
    }

    //Ejercicio #7: Ordenar Aleatoriamente String
    private void e7randomOrdenString(String text) {
        if (text != null) {
            String[] arrayStrings = text.split("");
            List<String> list = Arrays.asList(arrayStrings);
            Collections.shuffle(list);
            list.forEach(System.out::print);
        }
    }

    //Ejercicio #8: Ver solo los elementos no duplicados de una lista
    private void e8verSoloNoDuplicadosList(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::print);
    }

    //Ejercicio #9: Consultar si hay vocales en una cadena de String
    private void e9vocalesEnString(String text) {

//        
//        LOGICA
//
//        String[] array = text.split("");
//        boolean siExite = false;
//        for(String s : array){
//            if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
//                siExite = true;
//                break;
//            }
//        }
//        System.out.println("Si existe: " + siExite);
//
        //Usando clases de Java y Expresiones regulares
        boolean resultado = text.matches(".*[aeiou].*");
        System.out.println("Si contiene vocales Regx: " + resultado);

        boolean rpta = Arrays.asList(text.split("")).stream().anyMatch(s -> s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u"));
        System.out.println("Si contiene vocales UC: " + rpta);
    }

    //Ejercicio #10: Palindrome == Que se puede leer igual de <- -> ej: oro
    private String e10palindrome(String text) {
        boolean resultado = true;
        int longitud = text.length();

        for (int i = 0; i < longitud / 2; i++) {
            //Comparamos los extremos
            if (text.charAt(i) != text.charAt(longitud - i - 1)) {
                resultado = false;
                break;
            }
        }

        String rpta;

        if (resultado) {
            rpta = "Texto: " + text + "\n" + "Si == " + resultado;
        } else {
            rpta = "Texto: " + text + "\n" + "No == " + resultado;
        }

        return rpta;
    }

    public static void main(String[] args) {

//Instanicamos la clase
        App app = new App();

//Ejercicio #1
//        app.e1invertirString("Horaciodev");
//Ejercicio #2
//        app.e2comprobarCapicua(2001);
//Ejercicio #3
//        app.e3contarCaracteres("Horacio");
//Ejercicio #4
//        app.e4caracteresRepetidos("Horacio Lopez Moreno");
//Ejercicio #5
//        app.e5multiplidealgo(4);
//Ejercicio #6
//        app.e6añoBisiesto(2028);
//Ejercicio #7
//        app.e7randomOrdenString("Horacio");
//Ejercicio #8
//        app.e8verSoloNoDuplicadosList(Arrays.asList(1,2,3,4,5,5,6,7,7,9));
//Ejercicio #9
//        app.e9vocalesEnString("Horacio");
//Ejercicio #10
//        System.out.println("¿Es palindrome?: \n" + app.e10palindrome("oro"));
    }

}

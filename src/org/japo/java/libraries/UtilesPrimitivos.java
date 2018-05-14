/* 
 * Copyright 2018 Juan Alcocer Canet - juanasir1995@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

/**
 *
 * @author Juan Alcocer Canet - juanasir1995@gmail.com
 */
public class UtilesPrimitivos {

    // Constantes referenciales
    public static final int MAYOR = 1;
    public static final int MENOR = -1;
    public static final int IGUAL = 0;

    // Comprueba la paridad de un número entero
    public static boolean validarParidad(int num) {
        return num % 2 == 0;
    }

    // Comprueba la paridad de un número real
    public static boolean validarParidad(double num) {
        return num % 2 == 0;
    }

    // Comprueba el signo de un número entero
    public static boolean validarSigno(int num) {
        return num >= 0;
    }

    // Comprueba el signo de un número real
    public static boolean validarSigno(double num) {
        return num >= 0;
    }

    // Devuelve el mayor de dos números enteros
    public static int obtenerMayor(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    // Devuelve el mayor de dos números reales
    public static double obtenerMayor(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    // Devuelve el menor de dos números enteros
    public static int obtenerMenor(int n1, int n2) {
        return n1 < n2 ? n1 : n2;
    }

    // Devuelve el menor de dos números reales
    public static double obtenerMenor(double n1, double n2) {
        return n1 < n2 ? n1 : n2;
    }

    // Devuelve la relación entre dos números
    public static int obtenerRelacion(double n1, double n2) {
        return n1 > n2 ? MAYOR : n1 < n2 ? MENOR : IGUAL;
    }
}

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
public class UtilesColorCSS {

    public static final int obtenerNivelR(String color) {

        int nivel;
        if (validarColorCSS(color)) {
            String colorR = color.substring(1, 3);

            try {
                nivel = Integer.parseInt(colorR, 16);
            } catch (NumberFormatException e) {
                nivel = -1;
            }
        } else {
            nivel = -1;
        }
        return nivel;
    }

    public static final int obtenerNivelV(String color) {

        int nivel;
        if (validarColorCSS(color)) {
            String colorV = color.substring(3, 5);

            try {
                nivel = Integer.parseInt(colorV, 16);
            } catch (NumberFormatException e) {
                nivel = -1;
            }
        } else {
            nivel = -1;
        }
        return nivel;
    }

    public static final int obtenerNivelA(String color) {

        int nivel;
        if (validarColorCSS(color)) {
            String colorA = color.substring(5, 7);

            try {
                nivel = Integer.parseInt(colorA, 16);
            } catch (NumberFormatException e) {
                nivel = -1;
            }
        } else {
            nivel = -1;
        }
        return nivel;
    }

    public static final boolean validarColorCSS(String color) {

        boolean testOK = true;
        try {
            if (color.charAt(0) != '#') {
                testOK = false;
            } else if (color.length() != 7) {
                testOK = false;
            } else {
                for (int i = 1; i < color.length(); i++) {
                    if (!"123456789ABCDEFabcdef".contains(color.charAt(i) + "")) {
                        testOK = false;
                    }
                }
            }
        } catch (Exception e) {
            testOK = false;
        }
        return testOK;
    }
}

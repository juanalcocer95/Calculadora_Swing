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

import java.util.Scanner;


/**
 *
 * @author Juan Alcocer Canet - juanasir1995@gmail.com
 */
public class UtilesSiNo {

    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static final boolean leerSiNo(String msg) {

        boolean testOK;

        System.out.print(msg);
        String respuesta = SCN.nextLine();
        if (respuesta.equalsIgnoreCase("SI")) {
            testOK = true;
        } else if (respuesta.equalsIgnoreCase("S")) {
            testOK = true;
        } else if (respuesta.equalsIgnoreCase("NO")) {
            testOK = false;
        } else {
            testOK = false;
        }
        return testOK;
    }
}

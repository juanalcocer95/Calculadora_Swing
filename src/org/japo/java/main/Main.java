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
package org.japo.java.main;

import java.util.Properties;
import javax.swing.SwingUtilities;
import org.japo.java.forms.GUI;
import org.japo.java.libraries.UtilesApp;

/**
 *
 * @author Juan Alcocer Canet - juanasir1995@gmail.com
 */
public class Main {
    // Fichero Propiedades App
    public static final String RECURSO_PROPIEDADES = "properties/app.properties";

    // Entrada a la Aplicación
    public static void main(String[] args) {
        // Lanzar GUI
        SwingUtilities.invokeLater(() -> {
            // Cargar Propiedades App
            Properties prp = UtilesApp.importarPropiedadesRecurso(RECURSO_PROPIEDADES);
            
            // Instanciar GUI
            GUI gui = new GUI(prp);

            // Mostrar GUI
            gui.setVisible(true);
        });
    }
}

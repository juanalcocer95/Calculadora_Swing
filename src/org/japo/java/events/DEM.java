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
package org.japo.java.events;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.japo.java.forms.GUI;

/**
 *
 * @author Juan Alcocer Canet - juanasir1995@gmail.com
 */

public class DEM implements DocumentListener {

    // Referencia al GUI
    private final GUI gui;

    // Constructor
    public DEM(GUI gui) {
        this.gui = gui;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}

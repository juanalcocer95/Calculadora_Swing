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

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Juan Alcocer Canet - juanasir1995@gmail.com
 */
public class UtilesFiltros{
    
    public static class IntFiltro extends DocumentFilter{
        
        @Override    
        public void insertString(FilterBypass fb, int offset, String string,
        AttributeSet attr) throws BadLocationException {

            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));
            sb.insert(offset, string);

            if (test(sb.toString())) {
               super.insertString(fb, offset, string, attr);
            } else {
               // warn the user and don't allow the insert
            }
         }

         private boolean test(String text) {
            try {
               Integer.parseInt(text);
               return true;
            } catch (NumberFormatException e) {
               return false;
            }
         }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text,
               AttributeSet attrs) throws BadLocationException {

            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));
            sb.replace(offset, offset + length, text);

            if (test(sb.toString())) {
               super.replace(fb, offset, length, text, attrs);
            } else if (text.equals("")) {
               super.remove(fb, offset, length);                       
            }

         }

        @Override
        public void remove(FilterBypass fb, int offset, int length)
               throws BadLocationException {
            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));
            sb.delete(offset, offset + length);
            if(sb.toString().length() == 0) {
                super.replace(fb, offset, length, "", null);
            } else {
                if (test(sb.toString())) {
                    super.remove(fb, offset, length);
                } else {
                    // warn the user and don't allow the insert
                  }
            }
         }
    }
    
    // DoubleFiltro PENDIENTE DE VALIDAR
    
    public static class DoubleFiltro extends DocumentFilter{
        
        @Override    
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string,
        AttributeSet attr) throws BadLocationException {
                try {
                    if (string.equals(".")
                            && !fb.getDocument()
                                    .getText(0, fb.getDocument().getLength())
                                    .contains(".")) {
                        super.insertString(fb, offset, string, attr);
                        return;
                    }
                    Double.parseDouble(string);
                    super.insertString(fb, offset, string, attr);
                } catch (NumberFormatException | BadLocationException e) {
                    Toolkit.getDefaultToolkit().beep();
                }
        }            
         private boolean test(String text) {
            try {
               Integer.parseInt(text);
               return true;
            } catch (NumberFormatException e) {
               return false;
            }
         }

        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text,
               AttributeSet attrs) throws BadLocationException {
                try {
                    if (text.equals(".")
                            && !fb.getDocument()
                                    .getText(0, fb.getDocument().getLength())
                                    .contains(".")) {
                        super.insertString(fb, offset, text, attrs);
                        return;
                    }
                    if (text.equals("")) {
                        super.remove(fb, offset, length);
                        return;
                    }
                    Double.parseDouble(text);
                    super.replace(fb, offset, length, text, attrs);
                } catch (NumberFormatException | BadLocationException e) {
                    Toolkit.getDefaultToolkit().beep();
                }

         }

        public void remove(FilterBypass fb, int offset, int length,
                    String text, AttributeSet attrs)
                    throws BadLocationException {
                try {
                    if (text.equals(".")
                            && !fb.getDocument()
                                    .getText(0, fb.getDocument().getLength())
                                    .contains(".")) {
                        super.insertString(fb, offset, text, attrs);
                        return;
                    }
                    Double.parseDouble(text);
                    super.remove(fb, offset, length);
                } catch (NumberFormatException | BadLocationException e) {
                    Toolkit.getDefaultToolkit().beep();
                }
    }
}
}

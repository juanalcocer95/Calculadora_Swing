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
package org.japo.java.forms;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;
import org.japo.java.events.AEM;
import org.japo.java.events.KEM;
import org.japo.java.libraries.UtilesFiltros;
import org.japo.java.libraries.UtilesSwing;

/**
 *
 * @author Juan Alcocer Canet - juanasir1995@gmail.com
 */
public class GUI extends JFrame {

    // Propiedades App
    public static final String PRP_LOOK_AND_FEEL_PROFILE = "look_and_feel_profile";
    public static final String PRP_FAVICON_RESOURCE = "favicon_resource";
    public static final String PRP_BACKGROUND_RESOURCE = "background_resource";
    public static final String PRP_FONT_RESOURCE = "font_resource";
    
    
    // Valores por Defecto
    public static final String DEF_LOOK_AND_FEEL_PROFILE = UtilesSwing.LNF_WINDOWS_PROFILE;
    public static final String DEF_FAVICON_RESOURCE = "images/favicon.png";
    public static final String DEF_BACKGROUND_RESOURCE = "images/background.png";
    public static final String DEF_FONT_RESOURCE = "fonts/default_font.ttf";

    // Referencias
    private Properties prp;
    
    private String memoria1;
    private String memoria2;
    private String signo;
    
    
    private JTextField caja;
    //botones
    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton num0;
    private JButton btnSuma;
    private JButton btnResta;
    private JButton btnMulti;
    private JButton btnDivi;
    private JButton btnPunto;
    private JButton btnIgual;
    
    // Constructor
    public GUI(Properties prp) {
        // Inicialización Anterior
        initBefore(prp);

        // Creación Interfaz
        initComponents();

        // Inicializacion Posterior
        initAfter();
    }

    // Construcción - GUI
    private void initComponents() {
        
        //Campo de escritura
        caja = new JTextField();
        caja.setFont(UtilesSwing.importarFuenteRecurso(prp.getProperty(
                        PRP_FONT_RESOURCE, DEF_FONT_RESOURCE)).
                            deriveFont(Font.BOLD + Font.ITALIC, 30f));
        caja.setSize(345, 50);
        caja.setLocation(25, 20);
        caja.setHorizontalAlignment(JLabel.CENTER);
        
        //Filtro escritura de caracteres no numericos
        PlainDocument doc = (PlainDocument) caja.getDocument();
        doc.setDocumentFilter(new UtilesFiltros.DoubleFiltro());
     
    //Botones Numeros
    
        //Boton numero 1
        num1 = new JButton("1");
        num1.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        num1.setLocation(25, 90);
        num1.setSize(70, 70);
        num1.addActionListener(new AEM(this));
        num1.addKeyListener(new KEM(this));
        
        //Boton numero 2
        num2 = new JButton("2");
        num2.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        num2.setLocation(120, 90);
        num2.setSize(70, 70);
        num2.addActionListener(new AEM(this));
        num2.addKeyListener(new KEM(this));
        
        //Boton numero 3
        num3 = new JButton("3");
        num3.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        num3.setLocation(210, 90);
        num3.setSize(70, 70);
        num3.addActionListener(new AEM(this));
        num3.addKeyListener(new KEM(this));
        
        //Boton numero 4
        num4 = new JButton("4");
        num4.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        num4.setLocation(25, 180);
        num4.setSize(70, 70);
        num4.addActionListener(new AEM(this));
        num4.addKeyListener(new KEM(this));
        
        //Boton numero 5
        num5 = new JButton("5");
        num5.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        num5.setLocation(120, 180);
        num5.setSize(70, 70);
        num5.addActionListener(new AEM(this));
        num5.addKeyListener(new KEM(this));
        
        //Boton numero 6
        num6 = new JButton("6");
        num6.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        num6.setLocation(210, 180);
        num6.setSize(70, 70);
        num6.addActionListener(new AEM(this));
        num6.addKeyListener(new KEM(this));
        
        //Boton numero 7
        num7 = new JButton("7");
        num7.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        num7.setLocation(25, 270);
        num7.setSize(70, 70);
        num7.addActionListener(new AEM(this));
        num7.addKeyListener(new KEM(this));
        
        //Boton numero 8
        num8 = new JButton("8");
        num8.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        num8.setLocation(120, 270);
        num8.setSize(70, 70);
        num8.addActionListener(new AEM(this));
        num8.addKeyListener(new KEM(this));
        
        //Boton numero 9
        num9 = new JButton("9");
        num9.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        num9.setLocation(210, 270);
        num9.setSize(70, 70);
        num9.addActionListener(new AEM(this));
        num9.addKeyListener(new KEM(this));
        
        //Boton numero 0
        num0 = new JButton("0");
        num0.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        num0.setLocation(120, 360);
        num0.setSize(70, 70);
        num0.addActionListener(new AEM(this));
        num0.addKeyListener(new KEM(this));
    
    //Botones Operaciones
    
        //Boton division
        btnDivi = new JButton("÷");
        btnDivi.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        btnDivi.setLocation(300, 90);
        btnDivi.setSize(70, 70);
        btnDivi.addActionListener(new AEM(this));
        btnDivi.addKeyListener(new KEM(this));
        
        //Boton Multiplicacion
        btnMulti = new JButton("x");
        btnMulti.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        btnMulti.setLocation(300, 180);
        btnMulti.setSize(70, 70);
        btnMulti.addActionListener(new AEM(this));
        btnMulti.addKeyListener(new KEM(this));
        
        //Boton Resta
        btnResta = new JButton("-");
        btnResta.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        btnResta.setLocation(300, 270);
        btnResta.setSize(70, 70);
        btnResta.addActionListener(new AEM(this));
        btnResta.addKeyListener(new KEM(this));
        
        //Boton Suma
        btnSuma = new JButton("+");
        btnSuma.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        btnSuma.setLocation(300, 360);
        btnSuma.setSize(70, 70);
        btnSuma.addActionListener(new AEM(this));
        btnSuma.addKeyListener(new KEM(this));
                     
        //Boton Punto
        btnPunto = new JButton(".");
        btnPunto.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        btnPunto.setLocation(25, 360);
        btnPunto.setSize(70, 70);
        btnPunto.addActionListener(new AEM(this));
        btnPunto.addKeyListener(new KEM(this));
        
        //Boton Igual
        btnIgual = new JButton("=");
        btnIgual.setFont(new Font("Montserrat-Regular", Font.BOLD, 30));
        btnIgual.setLocation(210, 360);
        btnIgual.setSize(70, 70);
        btnIgual.addActionListener(new AEM(this));
        btnIgual.addKeyListener(new KEM(this));
        
        // Panel Principal
        JPanel pnlPpal = new JPanel();
                
        // Ventana Principal
        setContentPane(pnlPpal);
        pnlPpal.setLayout(null);
        setTitle("Calculadora");
        setResizable(false);
        setSize(400, 500);
        setUndecorated(false);
        setLocationRelativeTo(null);
        
        pnlPpal.add(caja);
        pnlPpal.add(num1);
        pnlPpal.add(num2);
        pnlPpal.add(num3);
        pnlPpal.add(num4);
        pnlPpal.add(num5);
        pnlPpal.add(num6);
        pnlPpal.add(num7);
        pnlPpal.add(num8);
        pnlPpal.add(num9);
        pnlPpal.add(num0);
        
        pnlPpal.add(btnDivi);
        pnlPpal.add(btnMulti);
        pnlPpal.add(btnResta);
        pnlPpal.add(btnSuma);
        pnlPpal.add(btnPunto);
        pnlPpal.add(btnIgual);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            

        }
    
    // Inicialización Anterior    
    private void initBefore(Properties prp) {
        // Memorizar Referencia
        this.prp = prp;

        // Establecer LnF
        UtilesSwing.establecerLookAndFeelProfile(prp.getProperty(PRP_LOOK_AND_FEEL_PROFILE, DEF_LOOK_AND_FEEL_PROFILE));
    }

    // Inicialización Posterior
    private void initAfter() {
        // Establecer Favicon
        UtilesSwing.establecerFavicon(this, prp.getProperty(PRP_FAVICON_RESOURCE, DEF_FAVICON_RESOURCE));
    }

    
    public void procesarTecla(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                UtilesSwing.terminarPrograma(this);
                break;
            case KeyEvent.VK_ENTER:
                if (e.getSource().equals(btnIgual)) {
                    //procesarCredencial();
                    caja.requestFocus();
                }
                break;
        }
    }
    
    public void procesarAccion(ActionEvent e){
        if(e.getSource().equals(num1)){
            caja.setText(caja.getText()+"1");
        }else if(e.getSource().equals(num2)){
            caja.setText(caja.getText()+"2");
        }else if(e.getSource().equals(num3)){
            caja.setText(caja.getText()+"3");
        }else if(e.getSource().equals(num4)){
            caja.setText(caja.getText()+"4");
        }else if(e.getSource().equals(num5)){
            caja.setText(caja.getText()+"5");
        }else if(e.getSource().equals(num6)){
            caja.setText(caja.getText()+"6");
        }else if(e.getSource().equals(num7)){
            caja.setText(caja.getText()+"7");
        }else if(e.getSource().equals(num8)){
            caja.setText(caja.getText()+"8");
        }else if(e.getSource().equals(num9)){
            caja.setText(caja.getText()+"9");
        }else if(e.getSource().equals(num0)){
            caja.setText(caja.getText()+"0");
        }
        
        //Signos y operaciones
        else if(e.getSource().equals(btnPunto)){
            caja.setText(caja.getText()+".");
        }else if(e.getSource().equals(btnIgual)){
            String resultado;
            memoria2 = caja.getText();
            if(!memoria2.equals("")){
                resultado = calculo(memoria1, memoria2, signo);
                caja.setText(resultado);
            }
        }else if(e.getSource().equals(btnDivi)){
            if(!caja.getText().equals("")){
                memoria1 = caja.getText();
                signo = "/";
                caja.setText("");
                caja.requestFocus();  
            }  
        }else if(e.getSource().equals(btnMulti)){
            if(!caja.getText().equals("")){
                memoria1 = caja.getText();
                signo = "*";
                caja.setText("");
                caja.requestFocus();   
            }    
        }else if(e.getSource().equals(btnSuma)){
            if(!caja.getText().equals("")){
                memoria1 = caja.getText();
                signo = "+";
                caja.setText("");
                caja.requestFocus();  
            }    
        }else if(e.getSource().equals(btnResta)){
            if(!caja.getText().equals("")){
                memoria1 = caja.getText();
                signo = "-";
                caja.setText("");
                caja.requestFocus();
                
            }
        }
    }
    
    public static String calculo(String memoria1, String memoria2, String signo){
        String respuesta;
        double resultado = 0.0;
        switch (signo) {
            case "-":
                resultado = Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
                break;
            case "+":
                resultado = Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
                break;
            case "*":
                resultado = Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
                break;
            case "/":
                if(Double.parseDouble(memoria2) != 0){
                    resultado = Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
                }else{
                    resultado = Double.parseDouble(memoria1);
                }
                break;    
        }
        respuesta = resultado + "";
        return respuesta;
    }
}
        

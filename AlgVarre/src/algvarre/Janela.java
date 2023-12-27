/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algvarre;

import javax.swing.JFrame;

/**
 *
 * @author pamplona
 */
public class Janela extends JFrame{

    public Janela() {
        
        this.add(new Desenha());
        
        this.setTitle("Algoritmo de Preenchimento - Varredura");
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}

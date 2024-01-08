/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algreclinhas;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author pamplona
 */
public class Janela extends JFrame{

    public Janela() {
        
        this.add(new Recorte());
        
        this.setTitle("Algoritmo de Recorte de Linhas");
        this.setSize(500,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    class Recorte extends JComponent{
        
    }
    
}

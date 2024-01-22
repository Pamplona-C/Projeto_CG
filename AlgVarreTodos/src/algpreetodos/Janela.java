/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algpreetodos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pamplona
 */
public class Janela extends JFrame{
    
    private JPanel p1,p2,p3,p4;
    private JLabel l1,l2,l3,l4;

    public Janela() {
        
        setLayout(new GridLayout(2,2));
        l1 = new JLabel("Alg Nativo");
        l2 = new JLabel("Alg Varredura");
        l3 = new JLabel("Alg BoundaryFill");
        l4 = new JLabel("Alg Analise");
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        
        p1.setLayout(new BorderLayout());
        p2.setLayout(new BorderLayout());
        p3.setLayout(new BorderLayout());
        p4.setLayout(new BorderLayout());
        
        p1.add(l1, BorderLayout.NORTH);
        p2.add(l2, BorderLayout.NORTH);
        p3.add(l3, BorderLayout.NORTH);
        p4.add(l4, BorderLayout.NORTH);
        
        p1.add(new Desenha1());
        p2.add(new Desenha2());
        p3.add(new Desenha3());
        p4.add(new Desenha4());
        
        
        add(p1);add(p2);add(p3);add(p4);
        
        
        this.setTitle("Todos algoritmos de preenchimento - Comparação");
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}

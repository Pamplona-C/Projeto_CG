package algnativos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;

/**
 *
 * @author pamplona
 */
public class Desenha extends JFrame{
    
    Polygon p = new Polygon();

    public Desenha() {
        
        this.setTitle("Algoritmos Nativos");
        this.setSize(300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        p.addPoint(50, 50);
        p.addPoint(200, 50);
        p.addPoint(200, 150);
        p.addPoint(50, 150);
        
        
    }
    
    /**
     *
     * @param g
     */
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawPolygon(p);
        g.fillPolygon(p);
        
        g.setColor(Color.blue);
        g.fillOval(100, 150, 50, 50);
    }
        
    
}

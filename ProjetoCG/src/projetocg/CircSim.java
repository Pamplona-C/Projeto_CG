
package projetocg;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author pamplona
 */
public class CircSim extends JFrame {
    
    private int desloc;

    public CircSim() {
        this.setTitle("Circunferencia com simetria");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        
        desloc = 150;
    }
    
    @Override
    public void paint(Graphics g){
        algIncS(g, 100);
        
    }
    
    public void algIncS(Graphics g, int raio){
        int x = 0, y =0;
        double ang = 0.0;
        while(ang < Math.PI/4){
                x = (int) (raio * Math.cos(ang));
                y = (int) (raio * Math.sin(ang));
                //putPixel(g, x, y);
                simetria(g, x, y);
                
                ang = ang+(double) 1/raio;
            
        }
    }
    
    public void simetria(Graphics g, int x ,int y){
        putPixel(g, x, y);
        putPixel(g, x, -y);
        putPixel(g, -x, y);
        putPixel(g, -x,- y);
        
        putPixel(g, y, x);
        putPixel(g, y, -x);
        putPixel(g, -y, x);
        putPixel(g, -y,- x);
    }
    
    public void putPixel(Graphics g, int x, int y){
        g.drawLine(x+desloc, y+desloc, x+desloc, y+desloc);
    }
    
}

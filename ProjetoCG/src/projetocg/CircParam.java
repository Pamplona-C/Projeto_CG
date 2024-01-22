
package projetocg;

import java.awt.Graphics;

import javax.swing.JFrame;

/**
 *
 * @author pamplona
 */
public class CircParam extends JFrame {
    
    private int desloc;

    public CircParam() {
        
        this.setTitle("Circunferencia");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        desloc = 150;
    }
    
    @Override
    public void paint(Graphics g){
        algParam(g, 50);
        
    }
    
    public void algParam(Graphics g, int raio){
        int x, y;
        for(int ang = 0;ang<360;ang++){
            x = (int) (raio * Math.cos(Math.PI*ang/180));
            y = (int) (raio * Math.sin(Math.PI*ang/180));
            putPixel(g,x,y);
            
        }
    }
    
    public void putPixel(Graphics g, int x, int y){
        g.drawLine(x+desloc, y+desloc, x+desloc, y+desloc);
    }
    
}

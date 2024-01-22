package algpreetodos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JComponent;

/**
 *
 * @author pamplona
 */
public class Desenha1 extends JComponent {
   
    int px1 = 50, px2 = 200, px3 = 200, px4 = 50,
         py1 = 50, py2 = 50, py3 = 150, py4 = 150;
    Polygon p;
    
    public Desenha1(){
        p = new Polygon();
        
        p.addPoint(px1, py1);
        p.addPoint(px2, py2);
        p.addPoint(px3, py3);
        p.addPoint(px4, py4);
        
        }
    
    public void paint(Graphics g){
        
        g.setColor(Color.blue);
        
        g.fillPolygon(p);
        
        g.setColor(Color.black);
        
        g.drawPolygon(p);
    }
        
}
  
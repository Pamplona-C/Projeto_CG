package geracaolinhas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author pamplona
 */
public class Desenha extends JFrame{

    public Desenha() {
        this.setTitle("Geração de linhas - Analitico | Bresenhan | DDA");
        this.setSize(550,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public void putPixel(Graphics g, int x, int y){
        g.drawLine(x, y, x, y);
    }
    
    @Override
    public void paint(Graphics g){
         g.setColor(Color.red);
        algBres(g,10,40,60,90);
        algBres(g, 10, 40, 50, 100);
        algBres(g, 10, 40, 80, 40);
        algBres(g, 10, 40, 10, 90);
        
        
        g.setColor(Color.green);
        algAnalitico(g, 300, 40, 500, 40);
        algAnalitico(g, 300, 150, 500, 40);
        algAnalitico(g, 250, 100, 500, 40);
        
        g.setColor(Color.blue);
        algDDA(g, 10, 200, 10, 350);
        algDDA(g, 10, 200, 200, 200);
        algDDA(g, 10, 200, 200, 250);
        algDDA(g, 10, 200, 100, 300);
    }

     private void algBres(Graphics g, int xi, int yi, int xf, int yf) {
        
       int x = xi, y = yi, d=0, dx = xf-xi, dy = yf-yi, c, m, incX=1, incY=1;
       
       if(dx < 0) {incX = -1; dx = -dx;}
       if(dy < 0) {incY = -1; dy = -dy;}
        System.out.println(dx+"-"+dy+"-"+incX+"-"+incY);
       
       if(dy <= dx) {
           c = 2 * dx;
           m = 2 * dy;
         
           if(incX < 0) dx++;
           for(;;) {
               putPixel(g,x,y);
               if (x == xf) break;
               x += incX;
               d += m;
               if(d >= dx) {
                   y += incY;
                   d -= c;
               }
              
           }
       } else {
           c = 2 * dy; 
           m = 2 * dx;
          
           
           if(incY < 0) dy++;
           
           for(;;) {
               putPixel(g,x,y);
               if (y == yf) break;
               y += incY;
               d += m;
               if(d >= dy) {
                   x += incX;
                   d -= c;
               }
               
       }
       
    }
    }
    public void algDDA(Graphics g, int xi, int yi, int xf, int yf) {
        int steps;
        float x = xi, y = yi, incX, incY;
        
        int dx = xf - xi;
        int dy = yf - yi;
        
        if (Math.abs(dx) > Math.abs(dy)) {
            steps = Math.abs(dx);
            incX = 1;
            incY = (float) dy/dx;   
        }
        else{
            steps = Math.abs(dy);
            incX = (float) dx/dy;
            incY = 1;
        }
        
        for (int i = 0; i<steps; i++) {
            x = x + incX;
            y = y + incY;
            putPixel(g,Math.round(x), Math.round(y));
            
        }
    }
    public void algAnalitico(Graphics g, int x1, int y1, int x2, int y2){
        //equação da reta  (y = m*x+b)
        // m = dy / dx 
        
        float m,b, dy, dx; 
        
        //delta de y = y final menos y inicial
        dy = y2 - y1; //300 - 300 = 0
        //delta de x = x final menos x inicial
        dx = x2 - x1; // 390- 10 = 380
        
        // m = coeficiente angular
        m = (float) dy/dx; //0
        
        //coeficiente linear 
        b = (float) (y1 - m * x1); // 300 - 0 = 0
        
        for (int x = x1; x <= x2; x++) { 
            int y = (int)(m * x + b);
            putPixel(g, x, y);
            
        }
        
        
    }
}

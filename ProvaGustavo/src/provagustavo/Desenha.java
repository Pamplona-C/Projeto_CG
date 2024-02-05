package provagustavo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author pamplona
 */
public class Desenha extends JFrame{
    
    private int raio = 45;
    
    int pixels[][];
    
    public Desenha(){
        
       
       
        
        this.setTitle("Prova de Computação Gráfica");
        this.setSize(500,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int centerX = e.getX();
                int centerY = e.getY();
                preeBF(getGraphics(), centerX, centerY);
            }
        });
        
      
    }
    
    public void poligono(Graphics g){
        algBres(g,150,50,350,50);
        algBres(g, 350, 50, 350, 250);
        algBres(g, 350, 250, 150, 250);
        algBres(g, 150, 250, 150, 50);
    }

    
    public void paint(Graphics g){
        
        pixels = new int[500][300];
        
        g.setColor(Color.blue);
        poligono(g);
        
        g.setColor(Color.black);
        algBres(g, 100, 50, 400, 250);
        algBres(g, 400, 50, 100, 250);
        
        g.setColor(Color.red);
        algCircBres(g, raio,250,150);
        
        g.setColor(Color.red);
        //preeBF(g, 230, 130);
        
        
        
    }
    
    private void preeBF(Graphics g, int x, int y) {
        if (getPixel(x, y) != 1) {
            
            System.out.println(pixels[x][y]);
            putPixelBF(g, x, y);
            preeBF(g, x + 1, y);
            preeBF(g, x - 1, y);
            preeBF(g, x, y + 1);
            preeBF(g, x, y - 1);
        }
    }
    
    public void putPixel(Graphics g, int x, int y){
        pixels[x][y] = 1;
        g.drawLine(x, y, x, y);
    }
    
    public int getPixel(int x, int y) {
        return pixels[x][y];
    }
    
    private void algBres(Graphics g, int xi, int yi, int xf, int yf) {
        int x = xi, y = yi, d=0, dx = xf-xi, dy = yf-yi, c, m, incX=1, incY=1;
       
       if(dx < 0) {incX = -1; dx = -dx;}
       if(dy < 0) {incY = -1; dy = -dy;}
     
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
    
    private void algCircBres(Graphics g, int raio, int x, int y) {
        int a = 0, b = raio;
        int u = 1;
        int v = 2 * raio;
        int e = 0;
        while (a <= b) {
            simetria(g, x, y, a, b);
            a++;
            e = e + u;
            u = u + 2;
            if (v < (2 * e)) {
                b--;
                e = e - v;
                v = v - 2;
            }
        }
    }
    
    private void simetria(Graphics g, int x, int y, int a, int b) {
        putPixelC(g, x, y, a, b);
        putPixelC(g, x, y, a, -b);
        putPixelC(g, x, y, -a, b);
        putPixelC(g, x, y, -a, -b);
        putPixelC(g, x, y, b, a);
        putPixelC(g, x, y, b, -a);
        putPixelC(g, x, y, -b, a);
        putPixelC(g, x, y, -b, -a);
    }
    private void putPixelC(Graphics g, int x, int y, int a, int b) {
        g.drawLine(a + x, b + y, a + x, b + y);
        pixels[x+a][y+b]=1;
        
    }
    
    void putPixelBF(Graphics g, int x, int y){
        g.drawLine(x, y, x, y);
        pixels[x-1][y-1] = 1;
    }
        
        
}

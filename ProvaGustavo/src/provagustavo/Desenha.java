package provagustavo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author pamplona
 */
public class Desenha extends JFrame{
    

    
    int pixels[][];
    
    public Desenha(){
        
        pixels = new int[500][300];
       
        
        this.setTitle("Prova de Computação Gráfica");
        this.setSize(500,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
      
    }
    
    public void poligono(Graphics g){
        algBres(g,150,50,350,50);
        algBres(g, 350, 50, 350, 250);
        algBres(g, 350, 250, 150, 250);
        algBres(g, 150, 250, 150, 50);
    }

    
    public void paint(Graphics g){
        g.setColor(Color.blue);
        poligono(g);
        
        g.setColor(Color.black);
        algBres(g, 100, 50, 400, 250);
        algBres(g, 400, 50, 100, 250);
        
        g.setColor(Color.red);
        algCircBres(g, 45);
        
        g.setColor(Color.red);
        preeBF(g, 230, 130);
        
        
        
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
    
    public void algCircBres(Graphics g, int raio) {
        int x=0, y=raio, u=1, v=2 *raio-1, e=0;
               
        while(x<=y) {
            simetria(g,x,y);
            x++;
            e = e + u;
            u = u + 2;
            if (v<(2*e)) {y--; e=e-v; v=v-2;}
        }
           
    }
    

    private void simetria(Graphics g, int x, int y) {
        putPixelCirc(g,x,y);
        putPixelCirc(g,x,-y);
        putPixelCirc(g,-x,y);
        putPixelCirc(g,-x,-y);
        
        putPixelCirc(g,y,x);
        putPixelCirc(g,y,-x);
        putPixelCirc(g,-y,x);
        putPixelCirc(g,-y,-x);
        
          
    }
    private void putPixelCirc(Graphics g, int x, int y) {
        int centerX = getWidth() / 2;  
        int centerY = getHeight() / 2; 
        g.drawLine(x + centerX, y + centerY, x + centerX, y + centerY);
    }
    
    void putPixelBF(Graphics g, int x, int y){
        g.drawLine(x, y, x, y);
        pixels[x-1][y-1] = 1;
    }
        
        
}

package algpreetodos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JComponent;

/**
 *
 * @author pamplona
 */
public class Desenha3 extends JComponent{
    
    int pixels[][];
    
    public Desenha3(){
        pixels = new int[300][300];
    }
    
    @Override
    public void paint(Graphics g){
        
        g.setColor(Color.black);
        poligono(g);
        g.setColor(Color.blue);
        preeBF(g, 100, 100);
        g.setColor(Color.black);
   
      
    }
    
    public void poligono(Graphics g){
        algBres(g, 50, 50, 200, 50);
        algBres(g,50,50,50,150);
        algBres(g,50,150,200,150);
        algBres(g,200,150,200,50);
    }
    
    private void preeBF(Graphics g, int x, int y) {
    if (getPixel(g, x, y) == 0) {
        putPixel(g, x, y);
        
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            int currentX = current.x;
            int currentY = current.y;

            if (getPixel(g, currentX + 1, currentY) == 0) {
                putPixel(g, currentX + 1, currentY);
                queue.add(new Point(currentX + 1, currentY));
            }
            if (getPixel(g, currentX - 1, currentY) == 0) {
                putPixel(g, currentX - 1, currentY);
                queue.add(new Point(currentX - 1, currentY));
            }
            if (getPixel(g, currentX, currentY + 1) == 0) {
                putPixel(g, currentX, currentY + 1);
                queue.add(new Point(currentX, currentY + 1));
            }
            if (getPixel(g, currentX, currentY - 1) == 0) {
                putPixel(g, currentX, currentY - 1);
                queue.add(new Point(currentX, currentY - 1));
            }
        }
    }
}

     
    void putPixel(Graphics g, int x, int y){
        g.drawLine(x, y, x, y);
        pixels[x-1][y-1] = 1;
    }
    
    public int getPixel(Graphics g, int x, int y){
        return pixels[x-1][y-1];
    }
    
    public void algBres(Graphics g, int xi, int yi, int xf, int yf){
        int t, dist;
        int xerr = 0, yerr = 0, dx, dy;
        int incX, incY;
        
        dx = xf - xi;
        dy = yf - yi;
        
        if (dx > 0) {
            incX = 1;
            
        }else if(dx == 0 ){
            incX = 0;
        }else{
            incX = -1;
        }
        
        if (dy > 0) {
            incY = 1;
            
        }else if(dy == 0 ){
            incY = 0;
        }else{
            incY = -1;
        }
        
        dx = Math.abs(dx);
        dy = Math.abs(dy);
        
        if (dx > dy ) {
            dist = dx; 
        }else{
            dist = dy;
        }
        
        for (int k = 0; k<= dist;k++) {
            putPixel(g, xi, yi);
            xerr = xerr + dx;
            yerr = yerr + dy;
            
            if (xerr > dist) {
                xerr = xerr - dist;
                xi = xi + incX;
            }
            if (yerr > dist) {
                yerr = yerr - dist;
                yi = yi + incY;
            }
        }
    }
    
}
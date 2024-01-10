/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algpreebf;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author pamplona
 */
public class Desenha extends JComponent{
    
    int pixels[][];
    
    public Desenha(){
        pixels = new int[300][300];
    }
    
    @Override
    public void paint(Graphics g){
        
        g.setColor(Color.red);
        poligono(g);
        g.setColor(Color.blue);
        preeBF(g, 170, 170);
      
    }
    
    public void poligono(Graphics g){
        algBres(g, 150, 150, 200, 150);
        algBres(g,200,150,200,200);
        algBres(g,200,200,150,200);
        algBres(g,150,200,150,150);
    }
    
    private void preeBF(Graphics g, int x, int y){
        
        if (getPixel(g, x, y) == 0) {
            putPixel(g,x,y);
            preeBF(g, x+1, y);
            preeBF(g, x-1, y);
            preeBF(g, x, y+1);
            preeBF(g, x, y-1);
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocg;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author pamplona
 */
public class Varredura extends JFrame {

    int pixels[][];
    
    public Varredura() {
        this.setTitle("Varredura");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        
        
        pixels = new int[300][300];
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.blue);
        poligono(g);
        g.setColor(Color.black);
        preeVarred(g, 50, 50, 200, 150);
        g.setColor(Color.blue);
        poligono(g);
    }
    
    public void preeVarred(Graphics g, int xmin, int ymin, int xmax, int ymax){
        boolean liga = false;
        
        for(int y = ymin; y <= ymax; y++){
            for(int x = xmin; x <= xmax; x++){
                
                if (getPixel(g, x, y) > 0) {
                    liga = !liga;
                }
                if(liga){
                    putPixel(g, x, y);
                }
            }
        }
    }
    
    public void poligono(Graphics g){
        algBres(g, 50, 50, 200, 50);
        algBres(g,50,50,50,150);
        algBres(g,50,150,200,150);
        algBres(g,200,150,200,50);
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
    
    private void putPixel(Graphics g, int x, int y){
        g.drawLine(x, y, x, y);
        pixels[x-1][y-1] = 1;
    }
    
    private int getPixel(Graphics g, int x, int y){
        return pixels[x-1][y-1];
    }
    
}

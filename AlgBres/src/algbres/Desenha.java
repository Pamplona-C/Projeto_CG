/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algbres;

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
        this.setSize(400,400);
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
        algBres(g,10,40,200,40);
        algBres(g, 10, 40, 10, 200);
        algBres(g, 10, 40, 200, 200);
    }

    private void algBres(Graphics g, int xi, int yi, int xf, int yf) {
        int x = xi, y = yi, d = 0, dx= xf-xi, dy = yf-yi, c, m, incX = 1, incY = 1;
        
        if (dx < 0) {
            incX = -1;
            dx = -dx; 
        }
        if (dy < 0) {
            incY = -1;
            dy = -dy;   
        }
        if(dy <= dx){
            c = 2*dx;
            m = 2*dy;
            if (incX < 0) {
                dx++;  
            }
            for (;;) {
                putPixel(g, x, y);
                if (x == xf)break;
                x += incX;
                d =+ m;
                if ( d >= dx) {
                    y =+ incY;
                    d -= c;
                }
            }
        }else{
             c = 2*dy;
            m = 2*dx;
            if (incY  < 0) {
                dy++;  
            }
            for (;;) {
                putPixel(g, x, y);
                if (y == yf)break;
                y += incY;
                d =+ m;
                if ( d >= dy) {
                    x =+ incX;
                    d -= c;
                }
            }
        }
    }
}

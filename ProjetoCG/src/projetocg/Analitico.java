package projetocg;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class Analitico extends JFrame{
    
    public int xi ,yi, xf, yf, color;
   

    public Analitico(int xi, int yi, int xf, int yf, int color) {
        this.xi = xi;
        this.yi = yi;
        this.xf = xf;
        this.yf = yf;
        this.color = color;
    }

    public int getXi() {
        return xi;
    }

    public void setXi(int xi) {
        this.xi = xi;
    }

    public int getYi() {
        return yi;
    }

    public void setYi(int yi) {
        this.yi = yi;
    }

    public int getXf() {
        return xf;
    }

    public void setXf(int xf) {
        this.xf = xf;
    }

    public int getYf() {
        return yf;
    }

    public void setYf(int yf) {
        this.yf = yf;
    }

    public Analitico() {
        
        this.setTitle("Algoritmo Analítico");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
       
    }
    
    

    @Override
    public void paint(Graphics g){
        if(color == 1){
            g.setColor(Color.red);
        }else{
            if(color == 2){
                g.setColor(Color.green);
            }else{
                if(color == 3)g.setColor(Color.blue);
            }
        }
        algAnalitico(g, xi, yi, xf, yf);
        algAnalitico(g,10,50,100,50);
        algAnalitico(g, 10, 50, 80, 100);
        
        
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
    
    public void putPixel( Graphics g,int x, int y){
        g.drawLine(x, y, x, y);
    }
    
}

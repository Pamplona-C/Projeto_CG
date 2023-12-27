package alganalitico;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Desenha extends JFrame{
    
    public Desenha(){
        this.setTitle("Linha Reta - Algotitmo Analítico");
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.red);
        algAnalitico(g, 10, 50, 60, 100);
        
        
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

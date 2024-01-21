package algpreeageo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author pamplona
 */
public class Desenha extends JComponent{
    
    private Lados lados[];
    private Vx vx[];
    
    int px1 = 50, px2 = 250, px3 = 210, px4 = 200,
         py1 = 49, py2 = 50, py3 = 200, py4 = 210;
    
    public Desenha(){
        
        lados = new Lados[4];
        vx = new Vx[312];
        for(int i = 0; i < 312; i++){
            vx[i] = new Vx();
        }
        
    }
    @Override
    public void paint(Graphics g){
       
        
        criaLados();
        g.setColor(Color.blue);
        peeAGeo(g);
        
         g.setColor(Color.black);
        algBres(g,px1,py1,px2,py2);
        algBres(g,px2,py2,px3,py3);
        algBres(g,px3,py3,px4,py4);
        algBres(g,px4,py4,px1,py1);
        
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
    public void putPixel(Graphics g, int x, int y){
        g.drawLine(x, y, x, y);
    }

    private void criaLados() {
        
//        px1 = 50, px2 = 250, px3 = 210, px4 = 200,
//         py1 = 49, py2 = 50, py3 = 200, py4 = 210;
//        lados[?] = new Lados(ymin, ymax, xymin, 1/m);

        lados[0] = new Lados(1,49,50,50,200); 
        lados[1] = new Lados(2,50,200,250,-0.2666); 
        lados[2] = new Lados(3,200,210,210,-1); 
        lados[3] = new Lados(4,49,210,50,0.9375); 
    }

    private void peeAGeo(Graphics g) {
        int x;
        for(int i = 0;i <4;i++){
            for(int yvar = lados[i].ymin; yvar <= lados[i].ymax; yvar++){
                x = (int) (lados[i].um_s_m * (yvar-lados[i].ymin) + lados[i].xymin);
                if(vx[yvar].x1 == -1){
                    vx[yvar].x1 = x;
                }else{
                    vx[yvar].x2 = x;
                }
            }
        }
        ordenaVx();
        imprimeVx(g);
    }

    private void ordenaVx() {
        for(int y= 0; y < 312; y++){
            int aux = vx[y].x1;
            if(vx[y].x1 > vx[y].x2){
                vx[y].x1 = vx[y].x2;
                vx[y].x2 = aux;
            }
        }
    }

    private void imprimeVx(Graphics g) {
          for(int y= 0; y < 312; y++){
              if(vx[y].x1 != -1){
                  algBres(g,vx[y].x1,y,vx[y].x2,y);
              }
        }
    }

    public class Lados {

        int lado;
        int ymin;
        int ymax;
        int xymin;
        double um_s_m;
        
        public Lados() {
            
            this(0,0,0,0,0.0);
        }

        public Lados(int lado, int ymin, int ymax, int xymin, double um_s_m) {
            this.lado = lado;
            this.ymin = ymin;
            this.ymax = ymax;
            this.xymin = xymin;
            this.um_s_m = um_s_m;
        }
        
        
    }

        public class Vx {
        
        int x1;
        int x2;

        public Vx() {
            this.x1 = -1;
            this.x2 = -1;
        }
    }
    
}

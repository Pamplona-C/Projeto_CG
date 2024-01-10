package algreclinhas;

import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author pamplona
 */
public class Janela extends JFrame{

    public Janela() {
        
        this.add(new Recorte());
        
        this.setTitle("Algoritmo de Recorte de Linhas");
        this.setSize(500,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    class Recorte extends JComponent{
        public Recorte(){
            
            addMouseListener(new MouseAdater){
            
                public void mousePressed(MouseEvent evt){
                    
                }
            
            }
        }
    }
    
}

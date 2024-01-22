package algcircparam;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author pamplona
 */
public class Janela extends JFrame{

    public Janela() {
        
        this.add(new Desenha());
        
         this.setTitle("Algoritmo de circunferencia - Parametrica");
        this.setSize(300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}

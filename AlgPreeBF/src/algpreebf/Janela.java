package algpreebf;

import javax.swing.JFrame;

/**
 *
 * @author pamplona
 */
public class Janela extends JFrame{

    public Janela() {
        this.add(new Desenha());
        
        this.setTitle("Algoritmo BoundaryFill");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}

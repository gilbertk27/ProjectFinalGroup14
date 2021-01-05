package PacmanGame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Mario extends JFrame {

    public Mario() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setTitle("Mario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new Mario();
            ex.setVisible(true);
        });
    }
}
//adam satria
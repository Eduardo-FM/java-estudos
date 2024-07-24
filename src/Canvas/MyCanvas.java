package Canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class MyCanvas extends Canvas{

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 800, 800); // Desenha um quadrado vermelho
    }

}

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Canvas Example");
        Canvas canvas = new MyCanvas();
        canvas.setSize(800, 800); // Define o tamanho do canvas
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
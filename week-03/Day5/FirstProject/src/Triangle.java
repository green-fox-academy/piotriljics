import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
    public static void mainDraw(Graphics graphics) {
        int y = HEIGHT-10;
        int globalx = 0;
        int localx = 0;
        int size = 20;
        for (int i = 0; i < 16; i++) {
                localx = globalx;
            for (int j = 0 + i; j < 16; j++) {
                triangle(graphics, localx, y, size);
                localx = localx + size;
            }
            y=y-size;
            globalx=globalx+size/2;

        }
    }
    public static void triangle(Graphics graphics, int x, int y, int a) {
                graphics.drawLine(x, y, x + a / 2, y - a);
                graphics.drawLine(x + a / 2, y - a, x + a, y);
                graphics.drawLine(x + a, y, x, y);
        }




    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
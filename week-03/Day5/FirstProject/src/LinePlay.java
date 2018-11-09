import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        int x = 0;
        int y = 0;
        int x2 = 0;
        int y2 = 320;

        for (int i = 0; i < 16; i++) {
            graphics.setColor(Color.blue);
            lines(graphics, x, y, x2, y2);
            y = y + 20;
            x2 = x2 + 20;
        }
        x2 = 0;
        y = 0;
        for (int j = 0; j < 16; j++) {
            graphics.setColor(Color.yellow);
            lines(graphics, x, y, y2, x2);
            x = x + 20;
            x2 = x2 + 20;
        }
    }

    public static void lines(Graphics graphics, int x1, int y1, int x2, int y2) {
        graphics.drawLine(x1, y1, x2, y2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
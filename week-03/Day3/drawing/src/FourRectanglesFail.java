import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectanglesFail {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.
        int x = 50;
        int y = 50;
        for (int i = 0; i <= 120; i = i + 30) {

            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    graphics.setColor(Color.green);
                    graphics.drawRect(x, y, i, i);
                } else if (j == 1) {
                    graphics.setColor(Color.red);
                    graphics.drawRect(x+i, y+i, i, i);
                } else if (j == 2) {
                    graphics.setColor(Color.yellow);
                    graphics.drawRect(x, y+i, i, i);
                } else {
                    graphics.setColor(Color.pink);
                    graphics.drawRect(x+i, y, i, i);
                }
            }
        }
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
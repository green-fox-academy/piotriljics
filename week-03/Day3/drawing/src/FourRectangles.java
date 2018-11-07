import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.
        int x = 20;
        int y = 60;
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                drawRect(graphics, x, y, Color.green);
            } else if (i == 1) {
                drawRect(graphics, y, x, Color.red);
            } else if (i == 2) {
                drawRect(graphics, y*i, x*i, Color.yellow);
            } else {
                drawRect(graphics, x+30, y+30, Color.black);
            }
        }
    }

    private static void drawRect(Graphics graphics, int x, int y, Color color) {
        graphics.setColor(color);
        graphics.drawRect(x, y, x, y);
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
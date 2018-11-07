import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int y = 320;
        for (int i = 0; i < 10; i++) {
            Integer random = random(255);

            Color color = new Color(random, random(255), random(255));
            fillSquare(graphics, y, color);
            y = y - 30;
        }


    }

    private static Integer random(int x) {
        int random = (int) (Math.random() * x);
        return random;
    }

    private static void fillSquare(Graphics graphics, int y, Color color) {
        graphics.setColor(color);
        graphics.fillRect((WIDTH-y) / 2, (HEIGHT - y) / 2, y, y);
        return;
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
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int z = 40;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                drawSquare(graphics,i*2*z,j*2*z,z);
                drawSquare(graphics,z+z*i*2,z+z*j*2,z);
            }


               /* if (i % 2 == 0) {
                    graphics.setColor(Color.white);
                    drawSquare(graphics, x, y, z);
                    x = x + z;
                } else {
                    graphics.setColor(Color.black);
                    drawSquare(graphics, x, y, z);
                    x = x + z;

                }*/

            }
        }



    public static void drawSquare(Graphics graphics, int x, int y, int z) {
        graphics.fillRect(x, y, z, z);
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
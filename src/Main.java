import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    private static final int windowSize = 720;
    private static final int cellSize = 35;
    private static final int gridSize = 20;
    private static final int margin = 10;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the grid
        g.setColor(Color.BLACK);
        for (int i = 0; i <= gridSize; i++) {
            int x = margin + i * cellSize;
            int y = margin + i * cellSize;
            g.drawLine(x, margin, x, windowSize - margin);  // Vertical lines
            g.drawLine(margin, y, windowSize - margin, y);  // Horizontal lines
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(windowSize, windowSize);
        frame.add(new Main());
        frame.setVisible(true);
    }
}

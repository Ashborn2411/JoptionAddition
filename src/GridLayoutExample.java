import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        // Create a panel with GridLayout: 2 rows, 3 columns
        JPanel panel = new JPanel(new GridLayout(2, 3, 10, 10)); // horizontalgap=10, virticalgap=10
        // Add buttons to fill the grid
       for(int i=0;i<10;i++){
           panel.add(new JButton("Button "+Integer.toString(i)));
       }
        frame.add(panel);
        frame.setVisible(true);
    }
}
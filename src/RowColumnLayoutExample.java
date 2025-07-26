import javax.swing.*;
import java.awt.*;

public class RowColumnLayoutExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Row & Column Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the main column panel
        Column column = new Column();

        // Create a row with two buttons
        Row row1 = new Row();
        row1.addComponent(new JButton("Button 1"));
        row1.addComponent(new JButton("Button 2"));

        // Create another row with a label and text field
        Row row2 = new Row();
        row2.addComponent(new JLabel("Name:"));
        row2.addComponent(new JTextField(10));

        // Add rows to the column
        column.addComponent(row1);
        column.addComponent(Box.createVerticalStrut(10)); // Spacer
        column.addComponent(row2);

        // Add the column to the frame
        frame.getContentPane().add(column);
        frame.setVisible(true);
    }
}
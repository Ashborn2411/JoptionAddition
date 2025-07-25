import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CustomLabel extends JFrame {
    private List<JLabel> labels = new ArrayList<>();

    public CustomLabel() {
        super("Testing JLabel");
        setLayout(new FlowLayout());

        // Label 1
        JLabel jLabel1 = new JLabel("Label with text");
        jLabel1.setToolTipText("This is label 1");
        labels.add(jLabel1);
        add(jLabel1);

        // Label 2 with icon
        JLabel jLabel2 = new JLabel("Label with icon");
        ImageIcon icon = new ImageIcon("src\\photo-album.png");
        Image scaledimage=icon.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH);
        ImageIcon icon1=new ImageIcon(scaledimage);
        jLabel2.setIcon(icon1);
        jLabel2.setToolTipText("This is label 2");
        labels.add(jLabel2);
        add(jLabel2);

        // Label 3
        JLabel jLabel3 = new JLabel("Another label");
        jLabel3.setToolTipText("This is label 3");
        labels.add(jLabel3);
        add(jLabel3);

        // Example: print all label texts and tooltips
        for (JLabel label : labels) {
            System.out.println("Text: " + label.getText() + ", Tooltip: " + label.getToolTipText());
        }
    }

    public static void main(String[] args) {
        CustomLabel instance = new CustomLabel();
        instance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instance.setSize(300, 200);
        instance.setVisible(true);
    }
}
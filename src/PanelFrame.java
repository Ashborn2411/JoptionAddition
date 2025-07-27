import javax.swing.*;
import java.awt.*;

public class PanelFrame extends JFrame {
    private final JPanel buttonPanel;
    private final JButton[] buttons;
    public PanelFrame(){
        super("Panel Demo");
        buttons=new JButton[5];
        buttonPanel=new JPanel();
        buttonPanel.setLayout(new GridLayout(1,buttons.length));
        for(int i=0;i<buttons.length;i++){
            buttons[i]=new JButton("Button "+(i+1));
            buttonPanel.add(buttons[i]);
        }
        add(buttonPanel,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        PanelFrame frame=new PanelFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,200);
        frame.setVisible(true);
    }

}

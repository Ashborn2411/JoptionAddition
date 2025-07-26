import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private final JButton plainJButton;
    private final JButton fancyButton;
    private class ButtonHandelr implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame.this,
                    String.format("You Pressed %s",event.getActionCommand()));
        }
    }
    public ButtonFrame(){
        super("Testing button");
        setLayout(new FlowLayout());
        plainJButton=new JButton("PlainButton");
        add(plainJButton);
        fancyButton=new JButton("FancyButton");
        ImageIcon icon = new ImageIcon("src\\photo-album.png");
        Image scaledimage=icon.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH);
        ImageIcon icon1=new ImageIcon(scaledimage);
        fancyButton.setIcon(icon1);
        add(fancyButton);
        ButtonHandelr handelr=new ButtonHandelr();
        fancyButton.addActionListener(handelr);
        plainJButton.addActionListener(handelr);
    }
    public static void main(String[] args) {
        ButtonFrame buttonFrame=new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275,110);
        buttonFrame.setVisible(true);
    }

}


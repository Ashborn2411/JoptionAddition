import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxFrame extends JFrame {
    private final JTextField textField;
    private final JCheckBox bold,italic;
    public CheckBoxFrame(){
        super("JCheckBox Test");
        setLayout(new FlowLayout());

        textField=new JTextField("Watch the font style change",20);
        textField.setFont(new Font("Serif",Font.PLAIN,14));
        add(textField);

        bold=new JCheckBox("Bold");
        italic=new JCheckBox("Italic");
        add(bold);
        add(italic);

        CheckBoxHandeler handeler=new CheckBoxHandeler();
        italic.addItemListener(handeler);
        bold.addItemListener(handeler);


    }
    private class CheckBoxHandeler implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent event){
            Font font=null;
            if(bold.isSelected()&&italic.isSelected()){
                font=new Font("Serif",Font.BOLD+Font.ITALIC,14);
            }else if(bold.isSelected()){
                font=new Font("Serif",Font.BOLD,14);
            }else if(italic.isSelected()){
                font =new Font("Serif",Font.ITALIC,14);
            }else {
                font =new Font("Serif",Font.PLAIN,14);
            }
            textField.setFont(font);
        }

    }
    public static void main(String[] args) {
       CheckBoxFrame checkBoxFrame=new CheckBoxFrame();
       checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       checkBoxFrame.setSize(275,100);
       checkBoxFrame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame {
    private JTextField textField1,textField2;
    private JPasswordField passwordField;
    public TextFieldFrame(){
        super("Test TextField");
        setLayout(new FlowLayout());
        textField1=new JTextField("First Name",10);
        textField1.setName("First Name");

        add(textField1);
        textField2=new JTextField("Second Name",10);
        textField2.setName("Second Name");
        add(textField2);
        passwordField=new JPasswordField("Hidden text");

        add(passwordField);
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    private class TextFieldHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            String string="";
            if(event.getSource()==textField1){
                string=String.format("textField: %s",event.getActionCommand());
            }else if(event.getSource()==textField2){
                string=String.format("textfield :%s",event.getActionCommand());
            }else if(event.getSource()==passwordField){
                string =String.format("PasswordFeild: %s",event.getActionCommand());

            }
            JOptionPane.showMessageDialog(null,string);
        }
    }

    public static void main(String[] args) {
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350,100);
        textFieldFrame.setVisible(true);
    }
}

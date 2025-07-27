import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaFrame extends JFrame {
    private final JTextArea textArea1,textArea2;
    private final JButton copyButton;
    public TextAreaFrame(){
        super("TextArea Demo");
        Box box=Box.createHorizontalBox();
        String demo="This is a demo string to\n"+"illustrate copying text\nfrom one textarea to\n"+"another textarea using an\nexternal event\n";
        textArea1=new JTextArea(demo,10,15);
        box.add(new JScrollPane(textArea1));

        copyButton=new JButton("Copy>>>");
        box.add(copyButton);
        copyButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textArea2.setText(textArea1.getSelectedText());
                    }
                }
        );
        textArea2=new JTextArea(10,15);
        textArea2.setEditable(false);
        box.add(new JScrollPane(textArea2));
        add(box);
    }

    public static void main(String[] args) {
        TextAreaFrame textAreaFrame=new TextAreaFrame();
        textAreaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textAreaFrame.setSize(425,200);
        textAreaFrame.setVisible(true);
    }
}

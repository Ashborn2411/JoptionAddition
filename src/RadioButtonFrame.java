import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonFrame extends JFrame {
    private final JTextField textField;
    private final Font plainFont,boldFont,italicFont,boldItalicFont;
    private final JRadioButton plainRadioButton,
            boldRadioButton,
            italicRadiobutton,
            bolditalicRadionbutton;

    private final ButtonGroup radionGroup;
    public RadioButtonFrame(){
        super("RadioButton");
        setLayout(new FlowLayout());

        textField=new JTextField(25);
        add(textField);
        plainRadioButton=new JRadioButton("plain",true);
        boldRadioButton=new JRadioButton("Bold",false);
        italicRadiobutton=new JRadioButton("italic",false);
        bolditalicRadionbutton=new JRadioButton("Bold-Italic",false);
        add(plainRadioButton);
        add(italicRadiobutton);
        add(boldRadioButton);
        add(bolditalicRadionbutton);

        radionGroup=new ButtonGroup();
        radionGroup.add(plainRadioButton);
        radionGroup.add(boldRadioButton);
        radionGroup.add(italicRadiobutton);
        radionGroup.add(bolditalicRadionbutton);

        plainFont=new Font("Serif",Font.PLAIN,14);
        boldFont=new Font("Serif",Font.BOLD,14);
        italicFont=new Font("Serif",Font.ITALIC,14);
        boldItalicFont=new Font("Serif",Font.BOLD+Font.ITALIC,14);

        plainRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        boldRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicRadiobutton.addItemListener(new RadioButtonHandler(italicFont));
        bolditalicRadionbutton.addItemListener(new RadioButtonHandler(boldItalicFont));

    }
    private class RadioButtonHandler implements ItemListener{
        private Font font;
        public RadioButtonHandler(Font f){
            font =f;
        }
        @Override
        public void itemStateChanged(ItemEvent event){
            textField.setFont(font);
        }
    }

    public static void main(String[] args) {
        RadioButtonFrame radioButtonFrame=new RadioButtonFrame();
        radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioButtonFrame.setSize(300,100);
        radioButtonFrame.setVisible(true);
    }

}

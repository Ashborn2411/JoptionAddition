import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleSelectionFrame extends JFrame {
    private final JList<String>colorList;
    private final JList<String>copyList;
    private final JButton copyButton;
    private static final String[] colorNames={"Black", "Blue", "Cyan",
             "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
            "Pink", "Red", "White", "Yellow"};

    public MultipleSelectionFrame(){
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        colorList=new JList<String>(colorNames);
        colorList.setVisibleRowCount(5);
        colorList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorList));

        copyButton=new JButton("Copy>>");
        copyButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        copyList.setListData(
                                colorList.getSelectedValuesList().toArray(new String[0])
                        );
                    }
                }
        );
        add(copyButton);
        copyList=new JList<String>();
        copyList.setVisibleRowCount(5);
        copyList.setFixedCellHeight(15);
        copyList.setFixedCellWidth(100);
        copyList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyList));
    }

    public static void main(String[] args) {
        MultipleSelectionFrame instance=new  MultipleSelectionFrame();
        instance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instance.setSize(350,150);
        instance.setVisible(true);
    }
}

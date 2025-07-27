import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListFrame extends JFrame {
    private final JList<String>colorList;
    private static final String[] colorNames={"Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] color={Color.BLACK, Color.BLUE,
            Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
             Color.RED, Color.WHITE, Color.YELLOW};
    public ListFrame(){
        super("");
        setLayout(new FlowLayout());
        colorList=new JList<String>(colorNames);
        colorList.setVisibleRowCount(5);

        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(colorList));

        colorList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                getContentPane().setBackground(
                        color[colorList.getSelectedIndex()]
                );
            }
        });
    }

    public static void main(String[] args) {
        ListFrame listFrame=new ListFrame();
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listFrame.setSize(350,150);
        listFrame.setVisible(true);
    }
}

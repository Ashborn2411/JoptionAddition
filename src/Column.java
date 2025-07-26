import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.function.Consumer;

public class Column extends JPanel {
    private int spacing = 5;

    public Column() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setAlignmentX(Component.LEFT_ALIGNMENT);
    }

    public void addComponent(Component comp) {
        prepareComponent(comp);
        add(comp);
        add(Box.createVerticalStrut(spacing));
    }

    public void setSpacing(int pixels) {
        this.spacing = pixels;
    }

    public void setPadding(int top, int left, int bottom, int right) {
        setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
    }

    public void addResizeListener(Consumer<Dimension> resizeCallback) {
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                resizeCallback.accept(getSize());
            }
        });
    }

    private void prepareComponent(Component comp) {
        if (comp instanceof JComponent jc) {
            jc.setMaximumSize(jc.getPreferredSize());
            jc.setAlignmentX(Component.LEFT_ALIGNMENT);
        }
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.function.Consumer;

public class Row extends JPanel {
    private int spacing = 5;

    public Row() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setAlignmentX(Component.LEFT_ALIGNMENT);
    }

    public void addComponent(Component comp) {
        prepareComponent(comp);
        add(comp);
        add(Box.createHorizontalStrut(spacing));
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
            jc.setAlignmentY(Component.CENTER_ALIGNMENT);
        }
    }
}
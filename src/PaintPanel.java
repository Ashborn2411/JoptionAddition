import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PaintPanel extends JPanel {
    private final ArrayList<Point>points=new ArrayList<Point>();
    public PaintPanel() {
        addMouseMotionListener(
                new MouseAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        points.add(e.getPoint());
                        repaint();
                    }
                }
        );
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (Point point:points){
            g.fillOval(point.x,point.y,4,4);
        }
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        PaintPanel paintPanel=new PaintPanel();
        frame.add(paintPanel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setVisible(true);

    }


}

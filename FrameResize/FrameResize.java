
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;


public class FrameResize extends JFrame {

    JTextArea txtStatus;

    public static void main(String[] args) {
        FrameResize fr = new FrameResize();
        fr.setVisible(true);
    }

    public FrameResize() {
        setSize(300, 300);
        setLocationRelativeTo(null);
        setTitle("XLF Updater");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Adding a component listener to `this` gives updates only
         * after the resize. Adding it to the content pane instead
         * will give updates at every step.
         */
        this.getContentPane().addComponentListener(new ComponentListener() {
            @Override 
            public void componentResized(ComponentEvent e) {
                txtStatus.append("new size (" + e.getComponent().getWidth() +
                                 ", " + e.getComponent().getHeight() + ")\n");
            }
            @Override public void componentMoved(ComponentEvent e) { }
            @Override public void componentShown(ComponentEvent e) { }
            @Override public void componentHidden(ComponentEvent e) { }
        });

        txtStatus = new JTextArea();
        // txtStatus.setTabSize(4);
        txtStatus.setEditable(false);
        txtStatus.setBorder(null);
        JScrollPane scrollPane = new JScrollPane(txtStatus);
        scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(scrollPane);
    }
}

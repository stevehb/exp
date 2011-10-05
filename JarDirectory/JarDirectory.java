import java.io.File;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

public class JarDirectory extends JFrame {
    JTextArea txtStatus;

    public static void main(String[] args) throws Exception {
        JarDirectory jd = new JarDirectory();
        jd.setVisible(true);
    }

    public JarDirectory() throws Exception {
        setSize(700, 300);
        setLocationRelativeTo(null);
        setTitle("JAR Directory");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txtStatus = new JTextArea();
        txtStatus.setEditable(false);
        txtStatus.setBorder(null);
        JScrollPane scrollPane = new JScrollPane(txtStatus);
        scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(scrollPane);

        String dir = JarDirectory.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        txtStatus.append("line=JarDirectory.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()\n");
        txtStatus.append("dir=" + dir + "\n");

        dir = new File(JarDirectory.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getAbsolutePath();
        txtStatus.append("line=new File(JarDirectory.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getAbsolutePath()\n");
        txtStatus.append("dir=" + dir + "\n");

        dir = new File(JarDirectory.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getAbsolutePath();
        txtStatus.append("line=new File(JarDirectory.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getAbsolutePath()\n");
        txtStatus.append("dir=" + dir + "\n");

        dir = new File(JarDirectory.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParent();
        txtStatus.append("line=new File(JarDirectory.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParent()\n");
        txtStatus.append("dir=" + dir + "\n");

        dir = new File(JarDirectory.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent();
        txtStatus.append("line=new File(JarDirectory.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent()\n");
        txtStatus.append("dir=" + dir + "\n");
    }
}

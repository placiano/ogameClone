import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private int count;
    private JPanel panel1;
    private JButton button1;
    private JLabel Label;

    public static void main(String[] args){
        GUI run = new GUI();

        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(run.panel1);
        frame.pack();
        frame.setVisible(true);

        for(;;){
            try { Thread.sleep(10000); } catch (Exception e) { }
        }
    }

    public GUI() {
        count = 0;
        Label.setText(Integer.toString(count));
        panel1.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count++;
                Label.setText(Integer.toString(count));
            }
        });
    }
}

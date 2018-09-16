import javax.swing.*;
import game.*;

public class Client implements Runnable{
    private JLabel metalVal;
    private JLabel crystalVal;
    private JLabel deutVal;
    private Player player;
    private Planet selectedPlanet;

    public Client(){
        player = new Player();
        selectedPlanet = new Planet(player);
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(this.panel1);
        frame.pack();
        frame.setVisible(true);
    }

    public void run(){
        for(;;){
            metalVal.setText(Integer.toString(selectedPlanet.getMetal()));
            crystalVal.setText(Integer.toString(selectedPlanet.getCrystal()));
            deutVal.setText(Integer.toString(selectedPlanet.getDeuterium()));
            try { Thread.sleep(1000); } catch (Exception e) { }
        }
    }
}

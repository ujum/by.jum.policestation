package by.jum.policestation.window;

import javax.swing.JFrame;
import java.awt.Toolkit;

public class MainMenuWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     /*   try {
            BufferedImage image = ImageIO.read(new File("src/by/jum/policestation/resourse/image/policeIcon.jpg"));
            frame.setIconImage(image);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        ShootingPanel shootingPanel = new ShootingPanel();
        ShootingPanelModel shootingPanelModel = new ShootingPanelModel();

        ShootingPanelController shootingPanelController = new ShootingPanelController(shootingPanel, shootingPanelModel, frame);
        shootingPanelController.setCountBox(7);
        shootingPanelController.addEnemies();
        shootingPanelController.addScoreLabel();


        frame.add(shootingPanel);
        frame.setVisible(true);
    }
}
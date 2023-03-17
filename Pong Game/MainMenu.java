import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {
    
    MainMenu(){
        
        // JLabel
        JLabel imageLabel = new JLabel();
        ImageIcon spaceImage = new ImageIcon("Home.gif");
        imageLabel.setIcon(spaceImage);
        // Add image to frame
        this.add(imageLabel);


        // JButton
        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 30));

      

        // Event handler
        EventHandler handler = new EventHandler();
        button.addActionListener(handler);

        // Add button to frame
        this.add(button);

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        this.setTitle("Pong Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(610,435);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.BLACK);
        // lock frame
        this.setResizable(false);
    }
        
     // Event handler class
     private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            // Switches to Player menu
            new DifficultyMenu();

            // Closes main menu
            dispose();
        }
    }
}
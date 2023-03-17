import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Player2 extends JFrame {

    JTextField textField;

    Player2() {
        super("Pong Game");
        this.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel();
        label.setText("Type in player number 2: ");
        label.setForeground(Color.RED);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        
        JLabel imageLabel = new JLabel();
        ImageIcon player2Image = new ImageIcon("Player2.gif");
        imageLabel.setIcon(player2Image);
        this.add(imageLabel, BorderLayout.NORTH);
       

        // JTextField
        textField = new JTextField(25);
       
        // Adds event to textfield
        EventHandler handler = new EventHandler();
        textField.addKeyListener(handler);

        // Add components to frame
        this.add(label);
        this.add(textField);
      

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(610, 410);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(Color.BLACK);

    }

    private class EventHandler implements KeyListener {

        public void keyPressed(KeyEvent event) {

            // If ENTER button is pressed, do this
            if (event.getKeyCode() == KeyEvent.VK_ENTER) {

                GamePanel.player2 = textField.getText();

                // Close playermenu frame
                dispose();

                // Go to game frame
                new GameFrame();
            }
        }

        public void keyTyped(KeyEvent event) {
            //
        }

        public void keyReleased(KeyEvent event) {
            //
        }
    }
}
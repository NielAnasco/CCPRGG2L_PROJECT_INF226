import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Player1 extends JFrame {

    JTextField textField;

    Player1() {
        super("Pong Game");
        this.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel();
        label.setText("Type in player number 1: ");
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        
        JLabel imageLabel = new JLabel();
        ImageIcon player1Image = new ImageIcon("Player1.gif");
        imageLabel.setIcon(player1Image);
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

                GamePanel.player1 = textField.getText();

                // Close playermenu frame
                dispose();

                // Go to game frame
                new Player2();
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
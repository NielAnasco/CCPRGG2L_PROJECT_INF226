import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultyMenu extends JFrame {
    DifficultyMenu() {
        super("Pong");
        this.setLayout(new FlowLayout());


        JLabel imageLabel = new JLabel();
        ImageIcon DifficultyImage = new ImageIcon("Difficulty.gif");
        imageLabel.setIcon(DifficultyImage);
        // Add image to frame
        this.add(imageLabel);

        JButton easyButton = new JButton();
        easyButton.setText("EASY");
        easyButton.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 30));
        // Add event to easy button
        EventHandler easyHandler = new EventHandler(2);
        easyButton.addActionListener(easyHandler);

        JButton mediumButton = new JButton();
        mediumButton.setText("MEDIUM");
        mediumButton.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 30));
        // Add event to easy button
        EventHandler mediumHandler = new EventHandler(4);
        mediumButton.addActionListener(mediumHandler);

        JButton hardButton = new JButton();
        hardButton.setText("HARD");
        hardButton.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 30));
        // Add event to easy button
        EventHandler hardHandler = new EventHandler(6);
        hardButton.addActionListener(hardHandler);

        add(easyButton);
        add(mediumButton);
        add(hardButton);

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(610, 435);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(Color.BLACK);
    }

    private class EventHandler implements ActionListener {

        int ballSpeed;

        // Constructor
        EventHandler(int speed) {
            this.ballSpeed = speed;
        }

        public void actionPerformed(ActionEvent event) {

            Ball.initialSpeed = ballSpeed;

            // Goes to Ball Color Menu
            new BallColorMenu();

            // Closes difficulty menu frame
            dispose();
        }
    }
}
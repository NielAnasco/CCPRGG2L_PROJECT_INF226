import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgain extends JFrame {
    TryAgain() {
        super("Pong Game");
        this.setLayout(new FlowLayout());

        JLabel imageLabel = new JLabel();
        ImageIcon PlayAgainImage = new ImageIcon("Play Again.gif");
        imageLabel.setIcon(PlayAgainImage);
        // Add image to frame
        this.add(imageLabel);

        // Declare Winner
        if (Score.player1 > Score.player2) {
            JLabel label = new JLabel();
            label.setText(GamePanel.player1 + " Wins!");
            label.setForeground(Color.BLUE);
            label.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
            this.add(label);
        }
        else{
            JLabel label = new JLabel();
            label.setText(GamePanel.player2 + " Wins!");
            label.setForeground(Color.RED);
            label.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
            this.add(label);
        }
        
        // Difficulty Button
        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("TRY AGAIN");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 30));
     
        TryAgainEventHandler tryHandler = new TryAgainEventHandler();
        tryAgainButton.addActionListener(tryHandler);

        JButton exitButton = new JButton();
        exitButton.setText("EXIT");
        exitButton.setFont(new Font("Arial", Font.BOLD, 30));
      
        ExitEventHandler exitHandler = new ExitEventHandler();
        exitButton.addActionListener(exitHandler);

        this.add(tryAgainButton);
        this.add(exitButton);

        this.setLayout(new FlowLayout());
        this.setTitle("Pong Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(610, 435);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private class TryAgainEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            PongGame.main(null);
            dispose();
        }
    }

    private class ExitEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }
}
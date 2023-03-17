import java.awt.Color;
import java.awt.Font;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class BallColorMenu extends JFrame {

    JList list;
    private String[] colorlist = { "BLUE", "WHITE", "MAGENTA", "YELLOW", "RED", "ORANGE", "CYAN", "GREEN", "LIGHT GRAY", "PINK" };
    private Color[] colors = { Color.BLUE, Color.WHITE, Color.MAGENTA, Color.YELLOW, Color.RED, Color.ORANGE, Color.CYAN, Color.GREEN, Color.LIGHT_GRAY, Color.PINK};

    BallColorMenu() {
        super("Pong Game");
        this.setLayout(new FlowLayout());

        
        // JLabel component
        JLabel imageLabel = new JLabel();
        ImageIcon ballColorImage = new ImageIcon("Ball Color.gif");
        imageLabel.setIcon(ballColorImage);
        // Add image to frame
        this.add(imageLabel);

        JLabel label = new JLabel();
        label.setText("Ball Color ----->  ");
        label.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 35));
        label.setForeground(Color.WHITE);

        // Jlist component
        list = new JList(colorlist);
        list.setFont(new Font("Comic Sans MS", Font.BOLD,15));
        list.setVisibleRowCount(3);

        // Sets JList to selection one option at a time
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add event
        EventHandler handler = new EventHandler();
        list.addListSelectionListener(handler);

        // JScrollPane
        JScrollPane scrollPane = new JScrollPane(list);

        // ADd components to frame
        this.add(label);
        this.add(scrollPane);

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(610, 450);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(Color.BLACK);
    }

    // Event handler
    private class EventHandler implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {
            
            
            Ball.BallColor = colors[list.getSelectedIndex()];
            
            // goes to player 1 menu
            new Player1();

            // closes color menu
            dispose();
        }
    }
}
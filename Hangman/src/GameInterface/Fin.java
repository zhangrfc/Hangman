package GameInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fin extends JFrame implements Runnable
{
  
  private JLabel imageLabel;

  /**
   * Launch the application.
   */
  public void run()
  {
    setVisible(true);
  }

  /**
   * Create the frame.
   */
  protected Fin()
  {
    getContentPane().setBackground(Color.WHITE);
    setBounds(100, 100, 900, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);
    
    imageLabel = new JLabel("");
    imageLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\7.png"));
    imageLabel.setBounds(110, 98, 299, 440);
    getContentPane().add(imageLabel);
    
    JLabel titleLabel = new JLabel("");
    titleLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\gameover.gif"));
    titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
    titleLabel.setBounds(99, 10, 666, 136);
    getContentPane().add(titleLabel);
    
    JButton btnBack = new JButton("Back");
    btnBack.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Back button pressed");
        ModeSelection ms = new ModeSelection();
        ms.run();
        setVisible(false);
        dispose();
      }
    });
    btnBack.setFont(new Font("Calibri", Font.BOLD, 70));
    btnBack.setBounds(491, 318, 274, 136);
    getContentPane().add(btnBack);
    
    JLabel msgLabel = new JLabel("You Lost");
    msgLabel.setFont(new Font("Calibri", Font.BOLD, 40));
    msgLabel.setHorizontalAlignment(SwingConstants.CENTER);
    msgLabel.setBounds(472, 216, 308, 80);
    getContentPane().add(msgLabel);
  }
}

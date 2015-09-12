package GameInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Intro extends JFrame implements Runnable
{


  /**
   * Launch the application.
   */
  public void run()
  {
    setVisible(true);
  }

  /**
   * Create the application.
   */
  /**
   * Initialize the contents of the frame.
   */
  protected Intro()
  {
    getContentPane().setBackground(Color.WHITE);
    setBounds(100, 100, 900, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);
    
    JLabel titleLabel = new JLabel("");
    titleLabel.setIcon(new ImageIcon("title.jpg"));
    titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
    titleLabel.setBounds(222, 29, 438, 97);
    getContentPane().add(titleLabel);
    
    JLabel imageLabel = new JLabel("");
    imageLabel.setIcon(new ImageIcon("7.png"));
    imageLabel.setBounds(110, 98, 299, 440);
    getContentPane().add(imageLabel);
    
    JButton btnMode = new JButton("Single Player");
    btnMode.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ModeSelection ms = new ModeSelection();
        ms.run();
        setVisible(false);
        dispose();
      }
    });
    btnMode.setFont(new Font("Calibri", Font.BOLD, 25));
    btnMode.setBounds(501, 189, 200, 50);
    getContentPane().add(btnMode);
    
    JLabel lblNewLabel = new JLabel("Designed By:");
    lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
    lblNewLabel.setBounds(502, 270, 146, 38);
    getContentPane().add(lblNewLabel);
    
    JLabel lblQingyiPan = new JLabel("Qingyi Pan");
    lblQingyiPan.setFont(new Font("Calibri", Font.BOLD, 25));
    lblQingyiPan.setBounds(501, 330, 146, 38);
    getContentPane().add(lblQingyiPan);
  }
}

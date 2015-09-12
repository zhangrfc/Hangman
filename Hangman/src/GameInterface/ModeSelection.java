package GameInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

public class ModeSelection extends JFrame implements Runnable
{
  /**
   * Launch the application.
   */
  private JButton btnFood;
  private JButton btnFoodimg;
  private JButton btnAnimal;
  private JButton btnAnimalimg;
  private JButton btnSports;
  private JButton btnSportsimg;
  private String word = "iloveq";
  private ArrayList<String> wordal;
  
  public void run()
  {
    setVisible(true);
  }
  /**
   * Create the frame.
   */
  protected ModeSelection()
  {
    System.out.println("mode selection");
    getContentPane().setBackground(Color.WHITE);
    setBounds(100, 100, 900, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);
    
    wordal = new ArrayList<String>();
    
    JLabel titleLabel = new JLabel("");
    titleLabel.setIcon(new ImageIcon("title.jpg"));
    titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
    titleLabel.setBounds(222, 29, 438, 97);
    getContentPane().add(titleLabel);
    
    JLabel imageLabel = new JLabel("");
    imageLabel.setIcon(new ImageIcon("7.png"));
    imageLabel.setBounds(110, 98, 299, 440);
    getContentPane().add(imageLabel);
    
    JLabel CategoryLabel = new JLabel("Category:");
    CategoryLabel.setFont(new Font("Calibri", Font.BOLD, 50));
    CategoryLabel.setBounds(465, 119, 243, 72);
    getContentPane().add(CategoryLabel);
    
    btnFood = new JButton("Food");
    btnFood.setFont(new Font("Calibri", Font.BOLD, 40));
    btnFood.setBounds(465, 217, 158, 61);
    getContentPane().add(btnFood);
    btnFood.addActionListener(new msButtonListener());
    
    btnAnimal = new JButton("Animal");
    btnAnimal.setFont(new Font("Calibri", Font.BOLD, 40));
    btnAnimal.setBounds(465, 304, 158, 61);
    getContentPane().add(btnAnimal);
    btnAnimal.addActionListener(new msButtonListener());
    
    btnSports = new JButton("Sports");
    btnSports.setFont(new Font("Calibri", Font.BOLD, 40));
    btnSports.setBounds(465, 387, 158, 61);
    getContentPane().add(btnSports);
    btnSports.addActionListener(new msButtonListener());
    
    btnFoodimg = new JButton("");
    btnFoodimg.setIcon(new ImageIcon("food.jpg"));
    btnFoodimg.setBounds(658, 225, 63, 53);
    getContentPane().add(btnFoodimg);
    btnFoodimg.addActionListener(new msButtonListener());
    
    btnAnimalimg = new JButton("");
    btnAnimalimg.setIcon(new ImageIcon("animal.jpg"));
    btnAnimalimg.setBounds(660, 310, 55, 47);
    getContentPane().add(btnAnimalimg);
    btnAnimalimg.addActionListener(new msButtonListener());
    
    btnSportsimg = new JButton("");
    btnSportsimg.setIcon(new ImageIcon("sports.jpg"));
    btnSportsimg.setBounds(658, 390, 63, 53);
    getContentPane().add(btnSportsimg);
    btnSportsimg.addActionListener(new msButtonListener());
  }
  
  protected class msButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      if(event.getSource() == btnFood || event.getSource() == btnFoodimg){
        System.out.println("food chosen");
        String line;
        try{
          FileInputStream finput = new FileInputStream("fooddic");
          InputStreamReader isr = new InputStreamReader(finput, Charset.forName("UTF-8"));
          BufferedReader br = new BufferedReader(isr);
          while((line = br.readLine()) != null){
            wordal.add(line);
          }
        }catch(FileNotFoundException exc){
          System.out.println("File Not Found");
          return;
        }
        catch( IOException e )
        {
          System.out.println("Readline Fail");
          return;
        }
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(wordal.size());
        word = wordal.get(randomInt);
        System.out.println("retrieve word " + word + " from " + wordal.size() + " items.");
        Gaming game = new Gaming("food", word);
        game.run();
        setVisible(false);
        dispose();
      }else if(event.getSource() == btnAnimal || event.getSource() == btnAnimalimg){
        System.out.println("animal chosen");
        String line;
        try{
          FileInputStream finput = new FileInputStream("animaldic");
          InputStreamReader isr = new InputStreamReader(finput, Charset.forName("UTF-8"));
          BufferedReader br = new BufferedReader(isr);
          while((line = br.readLine()) != null){
            wordal.add(line);
          }
        }catch(FileNotFoundException exc){
          System.out.println("File Not Found");
          return;
        }
        catch( IOException e )
        {
          System.out.println("Readline Fail");
          return;
        }
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(wordal.size());
        word = wordal.get(randomInt);
        System.out.println("retrieve word " + word + " from " + wordal.size() + " items.");
        Gaming game = new Gaming("animal", word);
        game.run();
        setVisible(false);
        dispose();
      }else if(event.getSource() == btnSports || event.getSource() == btnSportsimg){
        System.out.println("sports chosen");
        String line;
        try{
          FileInputStream finput = new FileInputStream("sportsdic");
          InputStreamReader isr = new InputStreamReader(finput, Charset.forName("UTF-8"));
          BufferedReader br = new BufferedReader(isr);
          while((line = br.readLine()) != null){
            wordal.add(line);
          }
        }catch(FileNotFoundException exc){
          System.out.println("File Not Found");
          return;
        }
        catch( IOException e )
        {
          System.out.println("Readline Fail");
          return;
        }
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(wordal.size());
        word = wordal.get(randomInt);
        System.out.println("retrieve word " + word + " from " + wordal.size() + " items.");
        Gaming game = new Gaming("sports", word);
        game.run();
        setVisible(false);
        dispose();
      }
    }
  }

}

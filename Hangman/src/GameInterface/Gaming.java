package GameInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Stack;

import javax.swing.JTextField;
import javax.swing.JTextArea;

import GameInterface.ModeSelection.msButtonListener;

public class Gaming extends JFrame implements Runnable
{
  /**
   * Launch the application.
   */
  
  private JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;
  private JButton btnBack, btnRetry;
  private JLabel lineLabel0, lineLabel1, lineLabel2, lineLabel3, lineLabel4, lineLabel5, lineLabel6, lineLabel7, lineLabel8;
  private JLabel answerLabel0, answerLabel1, answerLabel2, answerLabel3, answerLabel4, answerLabel5, answerLabel6, answerLabel7, answerLabel8;
  private JLabel imageLabel;
  private String game_word;
  private String game_category;
  private int wordLength;
  private HashSet<String> wordHs;
  private int counter; 
  private int prevcounter;
  private int correct;
  
  public void run()
  {
    setVisible(true);
  }

  /**
   * Create the frame.
   */
  protected Gaming(String category, String word)
  {
    
    getContentPane().setBackground(Color.WHITE);
    setBounds(100, 100, 900, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);
    
    game_word = word.toUpperCase();
    game_category = category;
    wordLength = game_word.length();
    wordHs = new HashSet<>();
    counter = 0;
    
    for(int i = 0; i < wordLength; i++){
      wordHs.add("" + game_word.charAt(i));
    }
    
    btnQ = new JButton("Q");
    btnQ.setFont(new Font("Calibri", Font.BOLD, 20));
    btnQ.setBounds(303, 257, 52, 52);
    getContentPane().add(btnQ);
    btnQ.addActionListener(new gameButtonListener());
    
    btnW = new JButton("W");
    btnW.setFont(new Font("Calibri", Font.BOLD, 20));
    btnW.setBounds(361, 257, 52, 52);
    getContentPane().add(btnW);
    btnW.addActionListener(new gameButtonListener());
    
    btnE = new JButton("E");
    btnE.setFont(new Font("Calibri", Font.BOLD, 20));
    btnE.setBounds(419, 257, 52, 52);
    getContentPane().add(btnE);
    btnE.addActionListener(new gameButtonListener());
    
    btnR = new JButton("R");
    btnR.setFont(new Font("Calibri", Font.BOLD, 20));
    btnR.setBounds(477, 257, 52, 52);
    getContentPane().add(btnR);
    btnR.addActionListener(new gameButtonListener());
    
    btnT = new JButton("T");
    btnT.setFont(new Font("Calibri", Font.BOLD, 20));
    btnT.setBounds(535, 257, 52, 52);
    getContentPane().add(btnT);
    btnT.addActionListener(new gameButtonListener());
    
    btnY = new JButton("Y");
    btnY.setFont(new Font("Calibri", Font.BOLD, 20));
    btnY.setBounds(593, 257, 52, 52);
    getContentPane().add(btnY);
    btnY.addActionListener(new gameButtonListener());
    
    btnU = new JButton("U");
    btnU.setFont(new Font("Calibri", Font.BOLD, 20));
    btnU.setBounds(651, 257, 52, 52);
    getContentPane().add(btnU);
    btnU.addActionListener(new gameButtonListener());
    
    btnI = new JButton("I");
    btnI.setFont(new Font("Calibri", Font.BOLD, 20));
    btnI.setBounds(709, 257, 52, 52);
    getContentPane().add(btnI);
    btnI.addActionListener(new gameButtonListener());
    
    btnO = new JButton("O");
    btnO.setFont(new Font("Calibri", Font.BOLD, 20));
    btnO.setBounds(768, 257, 52, 52);
    getContentPane().add(btnO);
    btnO.addActionListener(new gameButtonListener());
    
    btnP = new JButton("P");
    btnP.setFont(new Font("Calibri", Font.BOLD, 20));
    btnP.setBounds(825, 257, 52, 52);
    getContentPane().add(btnP);
    btnP.addActionListener(new gameButtonListener());
    
    btnA = new JButton("A");
    btnA.setFont(new Font("Calibri", Font.BOLD, 20));
    btnA.setBounds(331, 315, 52, 52);
    getContentPane().add(btnA);
    btnA.addActionListener(new gameButtonListener());
    
    btnS = new JButton("S");
    btnS.setFont(new Font("Calibri", Font.BOLD, 20));
    btnS.setBounds(389, 315, 52, 52);
    getContentPane().add(btnS);
    btnS.addActionListener(new gameButtonListener());
    
    btnD = new JButton("D");
    btnD.setFont(new Font("Calibri", Font.BOLD, 20));
    btnD.setBounds(448, 315, 52, 52);
    getContentPane().add(btnD);
    btnD.addActionListener(new gameButtonListener());
    
    btnF = new JButton("F");
    btnF.setFont(new Font("Calibri", Font.BOLD, 20));
    btnF.setBounds(506, 315, 52, 52);
    getContentPane().add(btnF);
    btnF.addActionListener(new gameButtonListener());
    
    btnG = new JButton("G");
    btnG.setFont(new Font("Calibri", Font.BOLD, 20));
    btnG.setBounds(564, 315, 52, 52);
    getContentPane().add(btnG);
    btnG.addActionListener(new gameButtonListener());
    
    btnH = new JButton("H");
    btnH.setFont(new Font("Calibri", Font.BOLD, 20));
    btnH.setBounds(622, 315, 52, 52);
    getContentPane().add(btnH);
    btnH.addActionListener(new gameButtonListener());
    
    btnJ = new JButton("J");
    btnJ.setFont(new Font("Calibri", Font.BOLD, 20));
    btnJ.setBounds(680, 315, 52, 52);
    getContentPane().add(btnJ);
    btnJ.addActionListener(new gameButtonListener());
    
    btnK = new JButton("K");
    btnK.setFont(new Font("Calibri", Font.BOLD, 20));
    btnK.setBounds(738, 315, 52, 52);
    getContentPane().add(btnK);
    btnK.addActionListener(new gameButtonListener());
    
    btnL = new JButton("L");
    btnL.setFont(new Font("Calibri", Font.BOLD, 20));
    btnL.setBounds(797, 315, 52, 52);
    getContentPane().add(btnL);
    btnL.addActionListener(new gameButtonListener());
    
    btnZ = new JButton("Z");
    btnZ.setFont(new Font("Calibri", Font.BOLD, 20));
    btnZ.setBounds(389, 377, 52, 52);
    getContentPane().add(btnZ);
    btnZ.addActionListener(new gameButtonListener());
    
    btnX = new JButton("X");
    btnX.setFont(new Font("Calibri", Font.BOLD, 20));
    btnX.setBounds(448, 377, 52, 52);
    getContentPane().add(btnX);
    btnX.addActionListener(new gameButtonListener());
    
    btnC = new JButton("C");
    btnC.setFont(new Font("Calibri", Font.BOLD, 20));
    btnC.setBounds(506, 377, 52, 52);
    getContentPane().add(btnC);
    btnC.addActionListener(new gameButtonListener());
    
    btnV = new JButton("V");
    btnV.setFont(new Font("Calibri", Font.BOLD, 20));
    btnV.setBounds(564, 377, 52, 52);
    getContentPane().add(btnV);
    btnV.addActionListener(new gameButtonListener());
    
    btnB = new JButton("B");
    btnB.setFont(new Font("Calibri", Font.BOLD, 20));
    btnB.setBounds(622, 377, 52, 52);
    getContentPane().add(btnB);
    btnB.addActionListener(new gameButtonListener());
    
    btnN = new JButton("N");
    btnN.setFont(new Font("Calibri", Font.BOLD, 20));
    btnN.setBounds(680, 377, 52, 52);
    getContentPane().add(btnN);
    btnN.addActionListener(new gameButtonListener());
    
    btnM = new JButton("M");
    btnM.setFont(new Font("Calibri", Font.BOLD, 20));
    btnM.setBounds(738, 377, 52, 52);
    getContentPane().add(btnM);
    btnM.addActionListener(new gameButtonListener());
    
    imageLabel = new JLabel("");
    imageLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\1.png"));
    imageLabel.setBounds(10, 46, 248, 419);
    getContentPane().add(imageLabel);
    
    JTextArea txtrClickOnThe = new JTextArea();
    txtrClickOnThe.setEditable(false);
    txtrClickOnThe.setFont(new Font("Calibri", Font.BOLD, 15));
    txtrClickOnThe.setText("Click on the letters to guess which letters are in this word.\r\n                   Make 6 wrong guesses and you lose.");
    txtrClickOnThe.setBounds(417, 456, 373, 52);
    getContentPane().add(txtrClickOnThe);
    
    JTextArea categoryLabel = new JTextArea();
    categoryLabel.setEditable(false);
    categoryLabel.setFont(new Font("Calibri", Font.BOLD, 50));
    categoryLabel.setText("Category:");
    categoryLabel.setBounds(264, 48, 217, 65);
    getContentPane().add(categoryLabel);
    
    lineLabel0 = new JLabel("");
    lineLabel0.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\line.png"));
    lineLabel0.setBounds(268, 194, 58, 35);
    getContentPane().add(lineLabel0);
    
    lineLabel1 = new JLabel("");
    lineLabel1.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\line.png"));
    lineLabel1.setBounds(332, 194, 58, 35);
    getContentPane().add(lineLabel1);
    
    lineLabel2 = new JLabel("");
    lineLabel2.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\line.png"));
    lineLabel2.setBounds(396, 194, 58, 35);
    getContentPane().add(lineLabel2);
    
    lineLabel3 = new JLabel("");
    lineLabel3.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\line.png"));
    lineLabel3.setBounds(460, 194, 58, 35);
    getContentPane().add(lineLabel3);
    
    lineLabel4 = new JLabel("");
    lineLabel4.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\line.png"));
    lineLabel4.setBounds(524, 194, 58, 35);
    getContentPane().add(lineLabel4);
    
    lineLabel5 = new JLabel("");
    lineLabel5.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\line.png"));
    lineLabel5.setBounds(593, 194, 58, 35);
    getContentPane().add(lineLabel5);
    
    lineLabel6 = new JLabel("");
    lineLabel6.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\line.png"));
    lineLabel6.setBounds(657, 194, 58, 35);
    getContentPane().add(lineLabel6);
    
    lineLabel7 = new JLabel("");
    lineLabel7.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\line.png"));
    lineLabel7.setBounds(721, 194, 58, 35);
    getContentPane().add(lineLabel7);
    
    lineLabel8 = new JLabel("");
    lineLabel8.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\line.png"));
    lineLabel8.setBounds(785, 194, 58, 35);
    getContentPane().add(lineLabel8);
    
    answerLabel0 = new JLabel("A");
    answerLabel0.setFont(new Font("Calibri", Font.BOLD, 50));
    answerLabel0.setHorizontalAlignment(SwingConstants.CENTER);
    answerLabel0.setBounds(268, 158, 58, 52);
    getContentPane().add(answerLabel0);
    
    answerLabel1 = new JLabel("A");
    answerLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    answerLabel1.setFont(new Font("Calibri", Font.BOLD, 50));
    answerLabel1.setBounds(331, 158, 58, 52);
    getContentPane().add(answerLabel1);
    
    answerLabel2 = new JLabel("A");
    answerLabel2.setHorizontalAlignment(SwingConstants.CENTER);
    answerLabel2.setFont(new Font("Calibri", Font.BOLD, 50));
    answerLabel2.setBounds(396, 158, 58, 52);
    getContentPane().add(answerLabel2);
    
    answerLabel3 = new JLabel("A");
    answerLabel3.setHorizontalAlignment(SwingConstants.CENTER);
    answerLabel3.setFont(new Font("Calibri", Font.BOLD, 50));
    answerLabel3.setBounds(460, 158, 58, 52);
    getContentPane().add(answerLabel3);
    
    answerLabel4 = new JLabel("A");
    answerLabel4.setHorizontalAlignment(SwingConstants.CENTER);
    answerLabel4.setFont(new Font("Calibri", Font.BOLD, 50));
    answerLabel4.setBounds(524, 158, 58, 52);
    getContentPane().add(answerLabel4);
    
    answerLabel5 = new JLabel("A");
    answerLabel5.setHorizontalAlignment(SwingConstants.CENTER);
    answerLabel5.setFont(new Font("Calibri", Font.BOLD, 50));
    answerLabel5.setBounds(593, 158, 58, 52);
    getContentPane().add(answerLabel5);
    
    answerLabel6 = new JLabel("A");
    answerLabel6.setHorizontalAlignment(SwingConstants.CENTER);
    answerLabel6.setFont(new Font("Calibri", Font.BOLD, 50));
    answerLabel6.setBounds(657, 158, 58, 52);
    getContentPane().add(answerLabel6);
    
    answerLabel7 = new JLabel("A");
    answerLabel7.setHorizontalAlignment(SwingConstants.CENTER);
    answerLabel7.setFont(new Font("Calibri", Font.BOLD, 50));
    answerLabel7.setBounds(721, 158, 58, 52);
    getContentPane().add(answerLabel7);
    
    answerLabel8 = new JLabel("A");
    answerLabel8.setHorizontalAlignment(SwingConstants.CENTER);
    answerLabel8.setFont(new Font("Calibri", Font.BOLD, 50));
    answerLabel8.setBounds(785, 158, 58, 52);
    getContentPane().add(answerLabel8);
    
    JLabel gifLabel = new JLabel("");
    if(category.equals("food")){
      gifLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\food.gif"));
    }else if(category.equals("animal")){
      gifLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\animal.gif"));
    }else{
      gifLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\sports.gif"));
    }
    gifLabel.setHorizontalAlignment(SwingConstants.CENTER);
    gifLabel.setBounds(484, 10, 248, 134);
    getContentPane().add(gifLabel);
    
    btnBack = new JButton("Back");
    btnBack.setFont(new Font("Calibri", Font.BOLD, 30));
    btnBack.setBounds(32, 475, 118, 52);
    getContentPane().add(btnBack);
    btnBack.addActionListener(new gameButtonListener());
    
    btnRetry = new JButton("Retry");
    btnRetry.setFont(new Font("Calibri", Font.BOLD, 30));
    btnRetry.setBounds(175, 475, 118, 52);
    getContentPane().add(btnRetry);
    btnRetry.addActionListener(new gameButtonListener());
    
    lineLabel0.setVisible(false);
    lineLabel1.setVisible(false);
    lineLabel2.setVisible(false);
    lineLabel3.setVisible(false);
    lineLabel4.setVisible(false);
    lineLabel5.setVisible(false);
    lineLabel6.setVisible(false);
    lineLabel7.setVisible(false);
    lineLabel8.setVisible(false);
    
    answerLabel0.setVisible(false);
    answerLabel1.setVisible(false);
    answerLabel2.setVisible(false);
    answerLabel3.setVisible(false);
    answerLabel4.setVisible(false);
    answerLabel5.setVisible(false);
    answerLabel6.setVisible(false);
    answerLabel7.setVisible(false);
    answerLabel8.setVisible(false);
    
    answerLabel0.setText("");
    answerLabel1.setText("");
    answerLabel2.setText("");
    answerLabel3.setText("");
    answerLabel4.setText("");
    answerLabel5.setText("");
    answerLabel6.setText("");
    answerLabel7.setText("");
    answerLabel8.setText("");
    
    System.out.println(game_word);
    System.out.println(wordLength);
    if(wordLength >= 1){
      lineLabel0.setVisible(true);
      answerLabel0.setText(game_word.substring(0, 1));
      //answerLabel0.setVisible(true);
    }
    if(wordLength >= 2){
      lineLabel1.setVisible(true);
      answerLabel1.setText(game_word.substring(1, 2));
      //answerLabel1.setVisible(true);
    }
    if(wordLength >= 3){
      lineLabel2.setVisible(true);
      answerLabel2.setText(game_word.substring(2, 3));
      //answerLabel2.setVisible(true);
    }
    if(wordLength >= 4){
      lineLabel3.setVisible(true);
      answerLabel3.setText(game_word.substring(3, 4));
      //answerLabel3.setVisible(true);
    }
    if(wordLength >= 5){
      lineLabel4.setVisible(true);
      answerLabel4.setText(game_word.substring(4, 5));
      //answerLabel4.setVisible(true);
    }
    if(wordLength >= 6){
      lineLabel5.setVisible(true);
      answerLabel5.setText(game_word.substring(5, 6));
      //answerLabel5.setVisible(true);
    }
    if(wordLength >= 7){
      lineLabel6.setVisible(true);
      answerLabel6.setText(game_word.substring(6, 7));
      //answerLabel6.setVisible(true);
    }
    if(wordLength >= 8){
      lineLabel7.setVisible(true);
      answerLabel7.setText(game_word.substring(7, 8));
      //answerLabel7.setVisible(true);
    }
    if(wordLength >= 9){
      lineLabel8.setVisible(true);
      answerLabel8.setText(game_word.substring(8, 9));
      //answerLabel8.setVisible(true);
    }
   
    
    
    
  }
  
  protected class gameButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      if(event.getSource() == btnBack){
        System.out.println("Back button pressed");
        ModeSelection ms = new ModeSelection();
        ms.run();
        setVisible(false);
        dispose();
      }else if(event.getSource() == btnRetry){
        System.out.println("Replay button pressed");
        Gaming game = new Gaming(game_category, game_word);
        game.run();
        setVisible(false);
        dispose();
      }else if(event.getSource() == btnA){
        btnA.setEnabled(false);
        btnA.setBackground(Color.white);
        inputTest("A");
      }else if(event.getSource() == btnB){
        btnB.setEnabled(false);
        btnB.setBackground(Color.white);
        inputTest("B");
      }else if(event.getSource() == btnC){
        btnC.setEnabled(false);
        btnC.setBackground(Color.white);
        inputTest("C");
      }else if(event.getSource() == btnD){
        btnD.setEnabled(false);
        btnD.setBackground(Color.white);
        inputTest("D");
      }else if(event.getSource() == btnE){
        btnE.setEnabled(false);
        btnE.setBackground(Color.white);
        inputTest("E");
      }else if(event.getSource() == btnF){
        btnF.setEnabled(false);
        btnF.setBackground(Color.white);
        inputTest("F");
      }else if(event.getSource() == btnG){
        btnG.setEnabled(false);
        btnG.setBackground(Color.white);
        inputTest("G");
      }else if(event.getSource() == btnH){
        btnH.setEnabled(false);
        btnH.setBackground(Color.white);
        inputTest("H");
      }else if(event.getSource() == btnI){
        btnI.setEnabled(false);
        btnI.setBackground(Color.white);
        inputTest("I");
      }else if(event.getSource() == btnJ){
        btnJ.setEnabled(false);
        btnJ.setBackground(Color.white);
        inputTest("J");
      }else if(event.getSource() == btnK){
        btnK.setEnabled(false);
        btnK.setBackground(Color.white);
        inputTest("K");
      }else if(event.getSource() == btnL){
        btnL.setEnabled(false);
        btnL.setBackground(Color.white);
        inputTest("L");
      }else if(event.getSource() == btnM){
        btnM.setEnabled(false);
        btnM.setBackground(Color.white);
        inputTest("M");
      }else if(event.getSource() == btnN){
        btnN.setEnabled(false);
        btnN.setBackground(Color.white);
        inputTest("N");
      }else if(event.getSource() == btnO){
        btnO.setEnabled(false);
        btnO.setBackground(Color.white);
        inputTest("O");
      }else if(event.getSource() == btnP){
        btnP.setEnabled(false);
        btnP.setBackground(Color.white);
        inputTest("P");
      }else if(event.getSource() == btnQ){
        btnQ.setEnabled(false);
        btnQ.setBackground(Color.white);
        inputTest("Q");
      }else if(event.getSource() == btnR){
        btnR.setEnabled(false);
        btnR.setBackground(Color.white);
        inputTest("R");
      }else if(event.getSource() == btnS){
        btnS.setEnabled(false);
        btnS.setBackground(Color.white);
        inputTest("S");
      }else if(event.getSource() == btnT){
        btnT.setEnabled(false);
        btnT.setBackground(Color.white);
        inputTest("T");
      }else if(event.getSource() == btnU){
        btnU.setEnabled(false);
        btnU.setBackground(Color.white);
        inputTest("U");
      }else if(event.getSource() == btnV){
        btnV.setEnabled(false);
        btnV.setBackground(Color.white);
        inputTest("V");
      }else if(event.getSource() == btnW){
        btnW.setEnabled(false);
        btnW.setBackground(Color.white);
        inputTest("W");
      }else if(event.getSource() == btnX){
        btnX.setEnabled(false);
        btnX.setBackground(Color.white);
        inputTest("X");
      }else if(event.getSource() == btnY){
        btnY.setEnabled(false);
        btnY.setBackground(Color.white);
        inputTest("Y");
      }else if(event.getSource() == btnZ){
        btnZ.setEnabled(false);
        btnZ.setBackground(Color.white);
        inputTest("Z");
      }
      
    }
  }
  
  private void inputTest(String character){
    prevcounter = counter;
    System.out.println(character + " Has Been Typed" + "+++++ contains" + wordHs.contains(character));
    if(wordHs.contains(character)){
      if(answerLabel0.getText().equals(character) && wordLength >= 1){
        answerLabel0.setVisible(true);
        correct++;
      }
      if(answerLabel1.getText().equals(character) && wordLength >= 2){
        answerLabel1.setVisible(true);
        correct++;
      }
      if(answerLabel2.getText().equals(character) && wordLength >= 3){
        answerLabel2.setVisible(true);
        correct++;
      }
      if(answerLabel3.getText().equals(character) && wordLength >= 4){
        answerLabel3.setVisible(true);
        correct++;
      }
      if(answerLabel4.getText().equals(character) && wordLength >= 5){
        answerLabel4.setVisible(true);
        correct++;
      }
      if(answerLabel5.getText().equals(character) && wordLength >= 6){
        answerLabel5.setVisible(true);
        correct++;
      }
      if(answerLabel6.getText().equals(character) && wordLength >= 7){
        answerLabel6.setVisible(true);
        correct++;
      }
      if(answerLabel7.getText().equals(character) && wordLength >= 8){
        answerLabel7.setVisible(true);
        correct++;
      }
      if(answerLabel8.getText().equals(character) && wordLength >= 9){
        answerLabel8.setVisible(true);
        correct++;
      }
      if(correct == wordLength){
        imageLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\8.png"));
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnE.setEnabled(false);
        btnF.setEnabled(false);
        btnG.setEnabled(false);
        btnH.setEnabled(false);
        btnI.setEnabled(false);
        btnJ.setEnabled(false);
        btnK.setEnabled(false);
        btnL.setEnabled(false);
        btnM.setEnabled(false);
        btnN.setEnabled(false);
        btnO.setEnabled(false);
        btnP.setEnabled(false);
        btnQ.setEnabled(false);
        btnR.setEnabled(false);
        btnS.setEnabled(false);
        btnT.setEnabled(false);
        btnU.setEnabled(false);
        btnV.setEnabled(false);
        btnW.setEnabled(false);
        btnX.setEnabled(false);
        btnY.setEnabled(false);
        btnZ.setEnabled(false);
      }
    }else{
      counter++;
    }
    if(counter != prevcounter){
      if(counter >= 6){
        System.out.println("Lost");
        Fin fin = new Fin();
        fin.run();
        setVisible(false);
        dispose();
      }else if(counter == 1){
        imageLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\2.png"));
      }else if(counter == 2){
        imageLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\3.png"));
      }else if(counter == 3){
        imageLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\4.png"));
      }else if(counter == 4){
        imageLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\5.png"));
      }else if(counter == 5){
        imageLabel.setIcon(new ImageIcon("D:\\JavaWorkspace\\Hangman\\6.png"));
      }
      
    }
  }
  
}

/*CRUZ, Jericho Janssen L.
  CUNANAN, Patrick Bryan F.
  MACALINO, Brendel Jeorge F.
  MALONZO, Marc Denzel S.
  REYES, Raiden Karl Mordecai D.
  RICO, Maeric Eulex R.
  1CSB
  Main Case Study Problem 2: This program is a lottery ticker generator.*/

package lottoticketprogram;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LottoTicketProgram extends JFrame {
  
    public static void main (String[]args){
    
        Components();
    }
    
    public static void Components() {
        MainFrame = new JFrame();
        JButton Random;
        JButton Manual;
        JButton Input;
        History = new JTextArea();
        History.setColumns(50);
        History.setRows(20);
        History.setEnabled(false);
        MainFrame.setTitle("Lotto Ticket Generator");
        MainFrame.setLayout(new FlowLayout());
        MainFrame.setSize(600, 450);
        MainFrame.setResizable(false);
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Random = new JButton("Random");
        Random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent a) {
                try {
                    RandomMethod.Randomizer();
                } catch (Exception ex) {
                    Logger.getLogger(LottoTicketProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Manual = new JButton("Manual");
        Manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent a) {
                ManualInputMethod.ManuaInput();
            }
        });
        MainFrame.add(Random);
        MainFrame.add(Manual);
        ScrollBar = new JScrollPane (History);
        ScrollBar.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        MainFrame.add(ScrollBar);
        MainFrame.setVisible(true);
    }
    
    private static javax.swing.JScrollPane ScrollBar;
    public static javax.swing.JTextArea History;
    public static javax.swing.JFrame MainFrame;
}
     
  
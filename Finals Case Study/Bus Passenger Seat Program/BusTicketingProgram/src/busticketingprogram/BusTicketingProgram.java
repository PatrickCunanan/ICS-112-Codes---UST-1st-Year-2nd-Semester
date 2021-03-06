/*CRUZ, Jericho Janssen L.
  CUNANAN, Patrick Bryan F.
  MACALINO, Brendel Jeorge F.
  MALONZO, Marc Denzel S.
  REYES, Raiden Karl Mordecai D.
  RICO, Maeric Eulex R.
  1CSB
  Main Case Study Problem 1: This program is a reservation program for bus passengers.*/

package busticketingprogram;

import java.awt.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BusTicketingProgram extends JFrame{

    public static void Components(){
         JFrame Frame = new JFrame("Bus Ticket Program");
         Frame.setLayout(new GridLayout(9, 3, 5, 5));
         Frame.setSize(800,600);
         Frame.setResizable(false);
         Text1 = new JTextField("1A");
         Text2 = new JTextField("1B");
         Text3 = new JTextField("1C");
         Text4 = new JTextField("1D");
         Text5 = new JTextField("2A");
         Text6 = new JTextField("2B");
         Text7 = new JTextField("2C");
         Text8 = new JTextField("2D");
         Text9 = new JTextField("3A");
         Text10 = new JTextField("3B");
         Text11 = new JTextField("3C");
         Text12 = new JTextField("3D");
         Text13 = new JTextField("4A");
         Text14 = new JTextField("4B");
         Text15 = new JTextField("4C");
         Text16 = new JTextField("4D");
         Text17 = new JTextField("5A");
         Text18 = new JTextField("5B");
         Text19 = new JTextField("5C");
         Text20 = new JTextField("5D");
         Text21 = new JTextField("6A");
         Text22 = new JTextField("6B");
         Text23 = new JTextField("6C");
         Text24 = new JTextField("6D");
         Text25 = new JTextField("7A");
         Text26 = new JTextField("7B");
         Text27 = new JTextField("7C");
         Text28 = new JTextField("7D");
         Text29 = new JTextField("8A");
         Text30 = new JTextField("8B");
         Text31 = new JTextField("8C");
         Text32 = new JTextField("8D");
         Text1.setEnabled(false);
         Text2.setEnabled(false);
         Text3.setEnabled(false);
         Text4.setEnabled(false);
         Text5.setEnabled(false);
         Text6.setEnabled(false);
         Text7.setEnabled(false);
         Text8.setEnabled(false);
         Text9.setEnabled(false);
         Text10.setEnabled(false);
         Text11.setEnabled(false);
         Text12.setEnabled(false);
         Text13.setEnabled(false);
         Text14.setEnabled(false);
         Text15.setEnabled(false);
         Text16.setEnabled(false);
         Text17.setEnabled(false);
         Text18.setEnabled(false);
         Text19.setEnabled(false);
         Text20.setEnabled(false);
         Text21.setEnabled(false);
         Text22.setEnabled(false);
         Text23.setEnabled(false);
         Text24.setEnabled(false);
         Text25.setEnabled(false);
         Text26.setEnabled(false);
         Text27.setEnabled(false);
         Text28.setEnabled(false);
         Text29.setEnabled(false);
         Text30.setEnabled(false);
         Text31.setEnabled(false);
         Text32.setEnabled(false);
         Frame.add(Text1);
         Frame.add(Text2);
         Frame.add(Text3);
         Frame.add(Text4);
         Frame.add(Text5);
         Frame.add(Text6);
         Frame.add(Text7);
         Frame.add(Text8);
         Frame.add(Text9);
         Frame.add(Text10);
         Frame.add(Text11);
         Frame.add(Text12);
         Frame.add(Text13);
         Frame.add(Text14);
         Frame.add(Text15);
         Frame.add(Text16);
         Frame.add(Text17);
         Frame.add(Text18);
         Frame.add(Text19);
         Frame.add(Text20);
         Frame.add(Text21);
         Frame.add(Text22);
         Frame.add(Text23);
         Frame.add(Text24);
         Frame.add(Text25);
         Frame.add(Text26);
         Frame.add(Text27);
         Frame.add(Text28);
         Frame.add(Text29);
         Frame.add(Text30);
         Frame.add(Text31);
         Frame.add(Text32);
         Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JButton Seat = new JButton();
         Seat.setText("RESERVE SEAT");
         Seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent a) {
                try {
                    ReserveMethod.SeatActionPerformed(a);
                } catch (Exception ex) {
                    Logger.getLogger(BusTicketingProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
         JButton InFile = new JButton();
         InFile.setText("INPUT FILE");
         InFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent i) {
                try {
                    InputMethod.InputFileActionPerformed(i);
                } catch (Exception ex) {
                    Logger.getLogger(BusTicketingProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
      
         History = new JTextArea(100,100);
         History.setEditable(false);
         ScrollBar = new JScrollPane (History);
         ScrollBar.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
         Frame.add(ScrollBar);
         Frame.add(Seat);
         Frame.add(InFile);
         Frame.setVisible(true);        
    }
            
    public static void main(String[]args) throws Exception{
        Components();
    }
    
    private static javax.swing.JScrollPane ScrollBar;
    static javax.swing.JTextArea History;
    public static javax.swing.JTextField Text1;
    public static javax.swing.JTextField Text2;
    public static javax.swing.JTextField Text3;
    public static javax.swing.JTextField Text4;
    public static javax.swing.JTextField Text5;
    public static javax.swing.JTextField Text6;
    public static javax.swing.JTextField Text7;
    public static javax.swing.JTextField Text8;
    public static javax.swing.JTextField Text9;
    public static javax.swing.JTextField Text10;
    public static javax.swing.JTextField Text11;
    public static javax.swing.JTextField Text12;
    public static javax.swing.JTextField Text13;
    public static javax.swing.JTextField Text14;
    public static javax.swing.JTextField Text15;
    public static javax.swing.JTextField Text16;
    public static javax.swing.JTextField Text17;
    public static javax.swing.JTextField Text18;
    public static javax.swing.JTextField Text19;
    public static javax.swing.JTextField Text20;
    public static javax.swing.JTextField Text21;
    public static javax.swing.JTextField Text22;
    public static javax.swing.JTextField Text23;
    public static javax.swing.JTextField Text24;
    public static javax.swing.JTextField Text25;
    public static javax.swing.JTextField Text26;
    public static javax.swing.JTextField Text27;
    public static javax.swing.JTextField Text28;
    public static javax.swing.JTextField Text29;
    public static javax.swing.JTextField Text30;
    public static javax.swing.JTextField Text31;
    public static javax.swing.JTextField Text32;
}

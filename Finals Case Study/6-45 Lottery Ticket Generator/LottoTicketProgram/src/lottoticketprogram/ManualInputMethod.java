package lottoticketprogram;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ManualInputMethod extends LottoTicketProgram{
    
    static int Counter1, Counter2, Counter3, Counter4 = 0, Value[][];
    static JButton Buttons[][];
    static String ManualCombination = "";
    
    public static void ManuaInput(){
    
        SubFrame = new JFrame("CHOOSE NUMBERS HERE");
        SubFrame.setLayout(new GridLayout(9,5,5,5));
        SubFrame.setSize(600,600);
        SubFrame.setResizable(false);
        SubFrame.setVisible(true);
        Buttons = new JButton[9][5];
        Value = new int[9][5];
         //set values to Value array
        Counter3 = 1;
        for(Counter1 = 0; Counter1 < 9; Counter1++){
            for(Counter2 = 0; Counter2 < 5; Counter2++){
                Value[Counter1][Counter2] = Counter3;
                Counter3++;
            }
        }
        //put numbers on JButtons
        for(Counter1 = 0; Counter1 < 9; Counter1++){
            for(Counter2 = 0; Counter2 < 5; Counter2++){
                Buttons[Counter1][Counter2] = new JButton(Integer.toString(Value[Counter1][Counter2]));
                SubFrame.add(Buttons[Counter1][Counter2]);
                Buttons[Counter1][Counter2].addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent B) {
                        try {
                            ButtonActionPerformed(B);
                        } catch (Exception ex) {
                            Logger.getLogger(ManualInputMethod.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
            }
        }
    }
    
    private static void ButtonActionPerformed(ActionEvent B) throws Exception{
    
        int C1, C2;
        for(C1 = 0; C1 < 9; C1++){
            for(C2 = 0; C2 < 5; C2++){
                if(B.getSource() == Buttons[C1][C2] && Counter4 != 6){
                    String Choice = B.getActionCommand();                
                    Buttons[C1][C2].setEnabled(false);
                    ManualCombination += Choice + "-";
                    Counter4++;
                }
                else if(Counter4 == 6){
                
                    SubFrame.setVisible(false);
                }
            }
        }
        if(Counter4 == 6){
        
            ManualCombination = ManualCombination.substring(0, ManualCombination.length()-1);
            JOptionPane.showMessageDialog(null,"Lotto Ticket Combination: " + ManualCombination);
            History.append("Lotto Ticket Combination: " + ManualCombination + "\n");
            OutputFileWriter.OutPutFileWriter("Lotto Combination: " + ManualCombination + "\n");
            Counter4 = 0;
            ManualCombination = "";
        }
    }
    
    public static javax.swing.JFrame SubFrame;
}

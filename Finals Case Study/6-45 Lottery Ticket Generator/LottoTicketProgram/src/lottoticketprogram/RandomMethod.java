package lottoticketprogram;

import javax.swing.*;

public class RandomMethod extends LottoTicketProgram{
    
    static int Rand1, Rand2, Rand3, Rand4, Rand5, Rand6;
    static String RandomCombination;
    
    public static void Randomizer() throws Exception{
    
        Rand1 = (int)(Math.random()*45)+1;
        do{
        
            Rand2 = (int)(Math.random()*45)+1;
        }while(Rand2 == Rand1);
        do{
        
            Rand3 = (int)(Math.random()*45)+1;
        }while(Rand3 == Rand1 || Rand3 == Rand2);
        do{
        
            Rand4 = (int)(Math.random()*45)+1;
        }while(Rand4 == Rand1 || Rand4 == Rand2 || Rand4 == Rand3);
        do{
        
            Rand5 = (int)(Math.random()*45)+1;
        }while(Rand5 == Rand1 || Rand5 == Rand2 || Rand5 == Rand3 || Rand5 == Rand4);
        do{
        
            Rand6 = (int)(Math.random()*45)+1;
        }while(Rand6 == Rand1 || Rand6 == Rand2 || Rand6 == Rand3 || Rand6 == Rand4 || Rand6 == Rand5);
        
        RandomCombination = (Rand1 + "-" + Rand2 + "-" + Rand3 + "-" + Rand4 + "-" + Rand5 + "-" + Rand6);
        JOptionPane.showMessageDialog(null,"Lotto Ticket Combination: " + RandomCombination);
        int RandomAgain = JOptionPane.showConfirmDialog(null, "Do you like the combination? Click No to get another combination.", "Get Another Combination?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(RandomAgain == JOptionPane.YES_OPTION){
        History.append("Lotto Ticket Combination: " + RandomCombination + "\n");
        OutputFileWriter.OutPutFileWriter("Lotto Combination: " + RandomCombination + "\n");
        }
        else if (RandomAgain == JOptionPane.NO_OPTION){
        Randomizer();
        }
    }
}

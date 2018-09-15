package busticketingprogram;

import java.awt.event.ActionEvent;
import java.io.FileReader;
import static java.lang.Character.toUpperCase;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InputMethod extends BusTicketingProgram{
    
    static void InputFileActionPerformed(ActionEvent i)throws Exception{
    int Row = 0;
    JTextField TFArray[] = new JTextField[33];
    TFArray[1] = Text1;
    TFArray[2] = Text5;
    TFArray[3] = Text9;
    TFArray[4] = Text13;
    TFArray[5] = Text17;
    TFArray[6] = Text21;
    TFArray[7] = Text25;
    TFArray[8] = Text29;
    TFArray[9] = Text2;
    TFArray[10] = Text6;
    TFArray[11] = Text10;
    TFArray[12] = Text14;
    TFArray[13] = Text18;
    TFArray[14] = Text22;
    TFArray[15] = Text26;
    TFArray[16] = Text30;
    TFArray[17] = Text3;
    TFArray[18] = Text7;
    TFArray[19] = Text11;
    TFArray[20] = Text15;
    TFArray[21] = Text19;
    TFArray[22] = Text23;
    TFArray[23] = Text27;
    TFArray[24] = Text31;
    TFArray[25] = Text4;
    TFArray[26] = Text8;
    TFArray[27] = Text12;
    TFArray[28] = Text16;
    TFArray[29] = Text20;
    TFArray[30] = Text24;
    TFArray[31] = Text28;
    TFArray[32] = Text32;
    
    Scanner in = new Scanner(new FileReader("InputFile.txt"));
    String PassName = in.nextLine();
    String SeatNumber = in.next();
    char First = SeatNumber.charAt(0);
    char SecondTemp = SeatNumber.charAt(1);
    char Second = toUpperCase(SecondTemp);
    
    if(Second == 'A'){
    Row = 0;
    }
    else if(Second == 'B'){
    Row = 8;
    }
    else if(Second == 'C'){
    Row = 16;
    }
    else if(Second == 'D'){
    Row = 24;
    }
    
    int FirstValue = Character.getNumericValue(First);
    int Total = FirstValue+Row;
    String Value = TFArray[Total].getText();
    
    if(Value.equals("X")){
    
        JOptionPane.showMessageDialog(null, "The seat you wanted is already reserved!", "", JOptionPane.PLAIN_MESSAGE);
    }
    else{
    
        TFArray[Total].setText("X");
        JOptionPane.showMessageDialog(null, "Input File Loaded!");
        JOptionPane.showMessageDialog(null, "Seat successfully reserved!", "", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Bus Ticket \n" + "Passenger: " + PassName + "\nSeat Number: " + First + Second, "", JOptionPane.PLAIN_MESSAGE);
        History.append("Passenger: " + PassName + "\nSeat Number: " + First + Second +"\n");
        String Reserve = ("Passenger: " + PassName + "\nSeat Number: " + First + Second +"\n");
        OutputFileWriter.OutPutFileWriter(Reserve + "\n");
    }  
    }
}

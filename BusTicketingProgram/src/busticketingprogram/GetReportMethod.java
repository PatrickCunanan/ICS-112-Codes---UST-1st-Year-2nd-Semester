package busticketingprogram;

import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class GetReportMethod extends BusTicketingProgram{

    static void DisplayHistoryActionPerformed(ActionEvent d)throws Exception{
    
        JFrame Subframe = new JFrame("History Report");
        Subframe.setSize(250, 500);
        Subframe.setResizable(false);
        ScrollBar = new JScrollPane (History);
        ScrollBar.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);     
        Subframe.add(ScrollBar);
        Subframe.setVisible(true);
    }
}

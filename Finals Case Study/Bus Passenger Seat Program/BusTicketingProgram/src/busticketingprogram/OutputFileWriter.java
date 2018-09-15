package busticketingprogram;

import java.io.FileWriter;

class OutputFileWriter {
    static void OutPutFileWriter(String R) throws Exception{
        try (FileWriter OutWrite = new FileWriter("OutputFile.txt",true)) {     
            OutWrite.write(R);
            OutWrite.close();
        }
    }
}

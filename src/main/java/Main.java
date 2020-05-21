import model.LinkModel;
import commandLineCommands.CommandLineAnalyzer;
import controller.ResultFile;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        try {
            CommandLineAnalyzer reader = new CommandLineAnalyzer(args);
            List<LinkModel> brokenLinks = ResultFile.getBrokenLinks(reader.getPages(), reader.getReaderState());
            ResultFile.printBrokenLinks(brokenLinks, reader.getOutFile());
            System.out.println("Found " + brokenLinks.size() + " broken links, for details check file “out.csv”");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
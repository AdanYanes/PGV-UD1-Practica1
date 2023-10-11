import java.util.ArrayList;

import net.salesianos.launcher.ProcessLauncher;
import net.salesianos.utils.Utils;

public class Main{
    public static void main(String[] args) {
        String text = Utils.getText("./lorem_ipsum.txt");
        ArrayList<Process>allProcesses = new ArrayList<>();
        String[] vocales = {"A", "E", "I", "O", "U"};
        Integer vowelsCount = 0;
        
        for (String vowel : vocales) {
            String outputFileName = "outputVowel" + vowel + ".txt";
            Process javaProcess = ProcessLauncher.initVowelCounterProcess(vowel, text, outputFileName);
            allProcesses.add(javaProcess);
        }
        
        for (Process process : allProcesses) {
            try {
                process.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
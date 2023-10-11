import java.io.File;
import java.util.ArrayList;

import net.salesianos.launcher.ProcessLauncher;
import net.salesianos.utils.Utils;

public class Main{
    public static void main(String[] args) {
        String text = Utils.getText("./lorem_ipsum.txt");
        ArrayList<Process>allProcesses = new ArrayList<>();
        String[] vowels = {"A", "E", "I", "O", "U"};
        Integer vowelsCount = 0;
        
        for (String vowel : vowels) {
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

        System.out.println("Según el texto: \n" + text);
        for (String vowel : vowels) {
            String outputFileName = "outputVowel" + vowel + ".txt";
            String outputFileRoute = "./net/salesianos/outputs/" + outputFileName;
            Integer vowelsFromFile = Utils.getTotalVowelsFrom(outputFileRoute);
            vowelsCount += vowelsFromFile;

            System.out.println("El texto tiene " + vowelsFromFile + " vocales \"" + vowel+ "\"");
        
            File outputFile = new File(outputFileRoute);
            outputFile.delete();
        }
        System.out.println("En total hay " + vowelsCount + " vocales");
    }
}
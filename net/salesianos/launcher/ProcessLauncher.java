package net.salesianos.launcher;

import java.io.File;
import java.io.IOException;

public class ProcessLauncher {
    private final static String OUTPUT_ROUTE = "./net/salesianos/outputs/";
    public static Process initVowelCounterProcess(String vowel, String line, String fileName) {
        ProcessBuilder processBuilder = new ProcessBuilder(
        "java", "./net/salesianos/processes/VowelsCounter.java", vowel, line
        );

        Process javaProcess = null;

        try {
        File outputFile = new File(OUTPUT_ROUTE + fileName);
        processBuilder.redirectOutput(outputFile);
        javaProcess =  processBuilder.start();
        } catch (IOException e) {
        e.printStackTrace();
        }

        return javaProcess;
    }
}

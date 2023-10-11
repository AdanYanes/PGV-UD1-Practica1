package net.salesianos.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    public static String getText(String fileRoute){
      String text = "";

      try {
          BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRoute));
          String currentLine = bufferedReader.readLine();

          while (currentLine != null) {
              text += currentLine;
              currentLine = bufferedReader.readLine();
            }
      
          bufferedReader.close();
      } catch (IOException e) {
          // TODO: handle exception
          e.printStackTrace();
      }

      return text;
  }

}

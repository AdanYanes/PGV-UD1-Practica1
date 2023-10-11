package net.salesianos.processes;

public class VowelsCounter {
    public static void main(String[] args) {
        char vowel = args[0].charAt(0);
        int totalVowels = 0;
        for (int i = 0; i < args[1].length(); i++) {
          if(args[1].toUpperCase().charAt(i) == vowel){
            totalVowels++;
          }
        }
        System.out.println(totalVowels);
      }
}

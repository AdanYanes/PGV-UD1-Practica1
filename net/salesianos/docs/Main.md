# Main Class

The `Main` class represents the main entry point of the program.

## Description

The program allow us to count the number of vowels we have in a .txt file saved in the project folder.

## Class Structure

- `Main` class:
  - Main method: `public static void main(String[] args)`
  - Class variables:
    - `String text`: Store text string
    - `ArrayList<Process> allProcesses`: Stores process
    - `String[] vowels`: Stores vowels
    - `Integer vowelsCount`: Stores the total vowels on the text
  - Methods:
    - `main(String[] args)`: Contains the main logic for the vowel counter

## Main Logic

1. Text string:
   - Using a static method, store the text from `lorem_ipsum.txt` file.

2. Stores process:
   - Store all the sub process launched from `Main`

3. Stores vowels:
   - Simple array storing the five vowels

4. Store the total vowels:
   - Stores all the vowels the text contain

## External Dependencies

- `java.io.File`: Used for creating and reading files
- `java.util.ArrayList`: Used for storing processes
- `net.salesianos.launcher.ProcessLauncher`: Used for launching sub-process
- `net.salesianos.utils.Utils`: Creates static methods used on `Main`

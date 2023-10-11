# ProcessLauncher Class

The `ProcessLauncher` class is a secondary file used by `Main`.

## Description

The class allow us to create several sub-process.

## Class Structure

- `Process Launcher` class:
  - Main method: `public static Process initVowelCounterProcess(String vowel, String line, String fileName)`
  - Class variables:
    - `private final static String OUTPUT_ROUTE`: Stores relative route to file
    - `ProcessBuilder processBuilder`: Store the new builded sub-process
    - `Process javaProcess`: Store the new process
    - `File outputFile`: Store the new file the process is going to create
  - Methods:
    - `public static Process initVowelCounterProcess(String vowel, String line, String fileName)`: Contains the logic to create the sub-processes

## Main Logic

1. Route to file:
   - Store the route to the `lorem_ipsum.txt` file.

2. Build process:
   - Create the process

3. Store process:
   - Store the process created

4. Create files:
   - Create a file with the name and the route specified

## External Dependencies

- `java.io.File`: Used for creating and reading files
- `java.io.IOException`: Allow us to catch exceptions on the try-catch block
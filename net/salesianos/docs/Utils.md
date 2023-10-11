# Utils Class

The `Utils` class is a static-method's storing class used by `Main`.

## Description

The class allow us store two(2) static methods so can be re-used 

## Class Structure

- `Utils` class:
  - Class variables:
    - `BufferedReader bufferedReader`: Creates a buffered reader that allow us to read a file.
    - `String currentLine`: Store the current line from the file.
    - `String firsLine`: Store the text line.
  - Methods:
    - `public static String getText(String fileRoute)`: return the text from the file we pass as parameter
    - `public static Integer getTotalVowelsFrom(String fileRoute)`: return the int stored on the file

## Main Logic

1. Read loop:
   - Read everyline on the file and save it in a string.

## External Dependencies

- `java.io.BufferedReader`: Allow us to create a buffered stream for reading a file.
- `java.io.FileReader`: Used for read a file.
- `java.io.IOException`: Allow us to catch exceptions on the try-catch block
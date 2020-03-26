package com.company;

/*
1805 Sort bytes
Enter the file name from the console.
Read all bytes from a file.
Without considering repetitions - sort them bytecode in ascending order.
Display on screen.
Close the I / O stream.
Example bytes of the input file:
44 83 44
Output Example:
44 83

Requirements:
1. The program should read the file name from the console.
2. To read from a file, use the FileInputStream stream.
3. Through the space, all unique bytes from the file should be displayed in the console in ascending order.
4. The data in the console should be displayed on one line.
5. The stream of reading from the file should be closed.
 */

import java.io.FileInputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        String filename = reader.nextLine();

        FileInputStream f = new FileInputStream(filename);

        TreeSet<Integer> setSortBytes = new TreeSet<>();

        while(f.available() > 0) {
            setSortBytes.add(f.read());
        }
        f.close();
        for (int value : setSortBytes)
            System.out.println(value + " ");

    }
}

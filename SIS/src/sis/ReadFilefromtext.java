/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

import java.io.*;

/**
 *
 * @author Student
 */
public class ReadFilefromtext {
    public static String readFile(String fileName) throws IOException {
    try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
        String last=sb.toString();
        last = last.replace("\n", "").replace("\r", "");
        return last;
    }catch(IOException ex){
        return "file not found";
    }
}
}

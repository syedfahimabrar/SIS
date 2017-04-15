/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author fahim
 */
public class WriteToFileExample1 {
    private static final String FILENAME = "DBNAME.txt";

	public static void write(String m) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String content = m;

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			                 JOptionPane.showMessageDialog(null, e);

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, ex);
			}

		}

	}
    
}

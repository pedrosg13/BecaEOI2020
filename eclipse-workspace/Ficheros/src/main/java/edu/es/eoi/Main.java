package edu.es.eoi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws IOException {

		Main main= new Main();		
		File file = main.getFileFromResources("data.txt");	
		printFile(file);
		file = main.getFileFromResources("test.xml");	
		printFile(file);
		
		file = main.getFileFromResources("test.xml");	
		writeFile(file);
		
	}

	private File getFileFromResources(String fileName) throws FileNotFoundException {
		
        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }
	
	private static void printFile(File file) throws IOException {

        if (file == null) return;

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }            
            br.close();
        }
        
    }
	
	private static void writeFile(File file) throws IOException {

        if (file == null) return;
        	FileWriter writer = new FileWriter(file);
            writer.write("");
        	writer.close();
        
    }
	
	
}

package learningReadWriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class learnTowriteFile {

	public static void main(String[] args) {

		////////////////// to create file/////////////////////////////
		try {
			File myObj = new File("C:\\Users\\romyk\\OneDrive\\Desktop\\Software testing\\Assignments\\filename.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				if (myObj.exists()) {
					System.out.println("File name: " + myObj.getName());
					System.out.println("Absolute path: " + myObj.getAbsolutePath());
					System.out.println("Writeable: " + myObj.canWrite());
					System.out.println("Readable " + myObj.canRead());
					System.out.println("File size in bytes " + myObj.length());
				} else {
					System.out.println("The file does not exist.");
				}
			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		//////////////////// to write file/////////////////////////////////
		try {
			FileWriter myWriter = new FileWriter(
					"C:\\Users\\romyk\\OneDrive\\Desktop\\Software testing\\Assignments\\filename.txt");
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		///////////////////// to read file//////////////////////////////
		try {
			File myObj = new File("C:\\Users\\romyk\\OneDrive\\Desktop\\Software testing\\Assignments\\filename.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}
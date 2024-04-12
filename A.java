import java.io.*;
import java.util.Scanner;

class FileManager {
    private File file;

    public FileManager(String fileName) {
        file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    public void getFileName() {
        System.out.println("File Name: " + file.getName());
    }

    public void getFilePath() {
        System.out.println("File Path: " + file.getAbsolutePath());
    }

    public void canRead() {
        System.out.println("Can Read: " + (file.canRead() ? "Yes" : "No"));
    }

    public void canWrite() {
        System.out.println("Can Write: " + (file.canWrite() ? "Yes" : "No"));
    }

    public void writeToFile(String text) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(text + "\n");
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }

    public void renameFile(String newFileName) {
        File newFile = new File(newFileName);
        if (file.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
            file = newFile;
        } else {
            System.out.println("Failed to rename the file.");
        }
    }

    public void deleteFile() {
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}

class First {
    First(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        
        FileManager fileManager = new FileManager(fileName);

        int choice = 0;
        while (choice != 9) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Get file name");
            System.out.println("2. Get file path");
            System.out.println("3. Check if file can be read");
            System.out.println("4. Check if file can be written");
            System.out.println("5. Write to file");
            System.out.println("6. Read from file");
            System.out.println("7. Rename file");
            System.out.println("8. Delete file");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    fileManager.getFileName();
                    break;
                case 2:
                    fileManager.getFilePath();
                    break;
                case 3:
                    fileManager.canRead();
                    break;
                case 4:
                    fileManager.canWrite();
                    break;
                case 5:
                    System.out.print("Enter text to write to file: ");
                    scanner.nextLine(); // Consume newline
                    String text = scanner.nextLine();
                    fileManager.writeToFile(text);
                    break;
                case 6:
                    fileManager.readFromFile();
                    break;
                case 7:
                    System.out.print("Enter new file name: ");
                    scanner.nextLine(); // Consume newline
                    String newFileName = scanner.nextLine();
                    fileManager.renameFile(newFileName);
                    break;
                case 8:
                    fileManager.deleteFile();
                    break;
                case 9:
                    System.out.println("Exiting File Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

public class A {
    public static void main(String[] args) {
        First f = new First();
    }
}
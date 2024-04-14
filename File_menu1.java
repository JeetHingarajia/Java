import java.io.*;
import java.util.*;



class File_Name
{
	File_Name()
	{
		File f=new File("Myfile.txt");
		System.out.println("-------------------------------------");
		System.out.println("File Name is:"+f.getName());
		System.out.println("-------------------------------------");
	}
}
class File_Path
{
	File_Path()
	{
		File f=new File("Myfile.txt");
		System.out.println("-------------------------------------");
		System.out.println("File Path is:"+f.getAbsolutePath());
		System.out.println("-------------------------------------");
	}
}

class File_CanRead
{
	File_CanRead()
	{
		File f=new File("Myfile.txt");
		System.out.println("-------------------------------------");
        System.out.println("File can be Read: " + f.canRead());
		System.out.println("-------------------------------------");
	}
}

class File_CanWrite
{
	 File_CanWrite() {
        File f = new File("Myfile.txt");
        System.out.println("-------------------------------------");
        System.out.println("File can be written: " + f.canWrite());
        System.out.println("-------------------------------------");
    }
}
 class File_Write {
    File_Write() {
        try {
           Scanner sc=new Scanner(System.in);
            System.out.print("Enter the string you want to write to the file: ");
            String write = sc.nextLine();

            File file = new File("Myfile.txt");

            System.out.println("-------------------------------------");

            FileWriter fw = new FileWriter(file);

            for (int i = 0; i < write.length(); i++)
                fw.write(write.charAt(i));
            fw.close();
            System.out.println("Writing successful");
            System.out.println("-------------------------------------");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
 }

  class File_Read {
        File_Read() {
        try {
            File file = new File("Myfile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));

            System.out.println("-------------------------------------");
            System.out.println("Contents of the file:");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
            System.out.println("-------------------------------------");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

 }

class File_Rename
{
	File_Rename()
	{
		File f=new File("Myfile.txt");

        File rename = new File("NewFile.txt");
        boolean flag = f.renameTo(rename); 
		System.out.println("-------------------------------------");
		if (flag == true) { 
            System.out.println("File Successfully Rename"); 
        } 
        else { 
            System.out.println("Operation Failed"); 
        } 
		System.out.println("-------------------------------------");
	}
}

class File_Delete
{
	File_Delete()
	{
		File f=new File("Myfile.txt");
		System.out.println("-------------------------------------");
		 if (f.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file. Check if the file exists.");
        }
		System.out.println("-------------------------------------");
	}
}
class Menu
{
	Menu()
	{
		System.out.println("-----------File-Menu------------------");
		System.out.println("1.File Name");
		System.out.println("2.File Path");
		System.out.println("3.File Can-Read");
		System.out.println("4.File Can-Write");
		System.out.println("5.File Write");
		System.out.println("6.File Read");
		System.out.println("7.File Rename");
		System.out.println("8.Delete");
		System.out.println("9.Exit");
		System.out.println("-------------------------------------");
	}
}
class Case_perform
{
	Scanner sc=new Scanner(System.in);
	int choice;
	Case_perform()
	{
		System.out.print("Enter Above Choice.....:->");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				new File_Name();
				break;
			case 2:
                new File_Path();
				break;
			case 3:
                new File_CanRead();
				break;
			case 4:
                new File_CanWrite();
				break;
			case 5:
                new File_Write();
				break;
			case 6:
                new File_Read();
				break;
			case 7:
                new File_Rename();
				break;
			case 8:
                new File_Delete();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter above Menu.....");

		}
	}
}
class File_menu1
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Menu m=new Menu();
			Case_perform cp=new Case_perform();
		}
	}
}
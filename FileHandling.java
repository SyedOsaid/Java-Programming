import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling
{
    public static void main(String[] args)
    {
        //Code to create a new file
        
        File myfile=new File("FileHandling.txt");
        
        /* */
        try
        {
            myfile.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }


        //Code to Write to a file

        try
        {
            FileWriter fileWriter=new FileWriter("FileHandling.txt");
            fileWriter.write("Hello people, day after tomorrow's my PF 1st Semester final paper. So Best of Luck to ME!!! \n Ciao");
            fileWriter.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to write in the File");
            e.printStackTrace();
        }
        


        //Reading to a File
        
        try
        {
            Scanner sc=new Scanner(myfile);

            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        

        //Deleting a file
        /*
        File myfile=new File("FileHandling.txt");

        if(myfile.delete())
        {
            System.out.println("I have delete the file " + myfile.getName());
        }
        else
        {
            System.out.println("Some problem occured while deleting the file");
        }
        */
    }
}

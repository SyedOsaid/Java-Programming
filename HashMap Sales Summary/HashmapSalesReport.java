import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class HashmapSalesReport 
{

    public static void main(String[] args) throws Exception 
    {

        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Open file
        File file = new File("E:\\Java Programming\\sales_table.txt");
        System.out.println(file.exists());

        Scanner sc = new Scanner(file);

        // skip header
        if (sc.hasNextLine()) 
        {
            sc.nextLine(); 
        }

        // Read line by line
        while (sc.hasNextLine()) 
            {

               String line = sc.nextLine();

               // Split the line into words
               String[] parts = line.split("\\s+");

               // Get product
               String product = parts[7] + " " + parts[8];

               // Get amount
               int amount = Integer.parseInt(parts[9]);

               // Create key
               String key = product;

               // If key already exists
               if (map.containsKey(key)) {

                int oldAmount = map.get(key);

                map.put(key, oldAmount + amount);

            } 
            else 
            {
                map.put(key, amount);
            }
        }

        sc.close();

        // Print final result
        System.out.println("Sales Summary:");

        for (String key : map.keySet()) 
        {
            System.out.println(key + " -> Rs." + map.get(key));
        }
    }
}
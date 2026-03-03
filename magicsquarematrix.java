/* Write a Java program using a class to represent a square matrix.The program should take input for the dimension 
and all elements of the matrix.It should check whether the matrix is a magic square (all rows, columns, and diagonals
sum to the same value).At the end tell if its a magic square matrix or not */

import java.util.Scanner;

class magicsquarematrix
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        
        //taking input of the dimension of matrix
        System.out.print("Enter the Dimension of the Matrix: ");
        int d=inp.nextInt();

        int[][] matrix = new int[d][d];

        //taking input of the elements of the matrix 
        System.out.print("Enter the elements of the matrix: ");
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<d;j++)
            {
                matrix [i][j]=inp.nextInt();
            }
        }
        
        //Sum of 1st row
        int ms=0;
        for(int j=0;j<d;j++)
        {
            ms+=matrix[0][j];
        }

        //Sum of Rows
        for(int i=0;i<d;i++)
        {
            int rowsum=0;
            for(int j=0;j<d;j++)
            {
                rowsum+=matrix[i][j];
            }
            if(ms!=rowsum)
            {
                System.out.println("The given matrix is not a Magic Square Matrix");
                return;
            }
        }

        //Sum of Colums
        for(int j=0;j<d;j++)
        {
            int colsum=0;
            for(int i=0;i<d;i++)
            {
                colsum+=matrix[i][j];
            }
            if(ms!=colsum)
            {
                System.out.println("The given matrix is not a Magic Square Matrix");
                return;
            }
        }

        //Sum of 1st Diagonal
        int diagsum1=0;
        for(int i=0;i<d;i++)
        {
            diagsum1+=matrix[i][i];
        }
        //Checking
        if(ms!=diagsum1)
        {
            System.out.println("The given matrix is not a Magic Square Matrix");
            return;
        }

        //Sum of 2nd Diagonal
        int diagsum2=0;
        for(int i=0;i<d;i++)
        {
            diagsum2+=matrix[i][d-1-i];
        }
        //Checking
        if(ms!=diagsum2)
        {
            System.out.println("The given matrix is not a Magic Square Matrix");
            return;
        }

        //If all checks passed
        System.out.println("The given matrix is a Magic Square Matrix");
    }
}
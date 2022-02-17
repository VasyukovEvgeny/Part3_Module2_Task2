import java.util.Scanner;

public class Main {

    public static void main (String[] args){


        Scanner scr = new Scanner(System.in);
        int double_massiv[][]= new int[3][4];
        int i=0;
        int j =0;
        for (i=0;i<double_massiv.length;i++)
        {
            for (j = 0; j < double_massiv[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                int a = scr.nextInt();
                double_massiv[i][j] = a;
            }
        }
//Task1
        System.out.println("");
        System.out.println("Task1:");
        int k =0;
        for (i=0;i<double_massiv.length;i++)
        {
            for (j = 0; j < double_massiv[i].length; j++) {
                k = k + double_massiv[i][j];
            }
            System.out.println("Line" + i + ":"  + k );
            k=0;
        }

//Task2
        i=0;
        j=0;
        System.out.println("");
        System.out.println("Task2:");
        k =0;
        for (j = 0; j < 4; j++)
        {
            for (i=0;i<double_massiv.length;i++){
                k = k + double_massiv[i][j];
            }
            System.out.println("Column" + j + ":"  + k );
            k=0;
        }

//Task4
        System.out.println("");
        System.out.println("Task4:");
        float f =0;
        for (i=0;i<double_massiv.length;i++)
        {
            for (j = 0; j < double_massiv[i].length; j++) {
                f = f + double_massiv[i][j];
            }
            System.out.println("Line" + i + ":"  + f/4 );
            f=0;
        }

//Task3
        System.out.println("");
        System.out.println("Task3:");
        for (i=0;i<double_massiv.length;i++)
        {
            for (j = 0; j < double_massiv[i].length; j++) {
                if (double_massiv[i][j] % 2 > 0) double_massiv[i][j] = 1;
                else double_massiv[i][j] = 0;
            }
        }
        for (i=0;i<3;i++)
        {
            for (j = 0; j < double_massiv[i].length; j++) {
                System.out.println("Элемент arr[" + i + "][" + j + "]:" + double_massiv[i][j]);
            }
        }



    }



}


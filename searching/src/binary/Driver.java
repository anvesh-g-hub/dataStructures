package binary;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        BinarySearch bs=new BinarySearch();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number/size of elements in an array");
        int sizeOfArray=sc.nextInt();
        int[] elements=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            System.out.print("Enter "+i+" element in an array: ");
            elements[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        int elementToSearch=sc.nextInt();
        bs.binarySearch(elements,elementToSearch);




    }
}
